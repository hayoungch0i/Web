package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class net_chat_server {

	public static void main(String[] args) {
		new net_chat_server().open();
	}

	public void open() {
		ServerSocket ss = null;
		Socket sk = null;
		try {
			ss = new ServerSocket(10000);
			System.out.println("[Chatting Room OPEN]");
			while (true) {
				sk = ss.accept();
				// Thread 작동
				chatroom cr = new chatroom(sk);
				cr.start();
			}
		} catch (Exception e) {
			System.out.println("포트 충돌로 인하여 서버가 오픈되지 않습니다.");
		}
	}
}

class chatroom extends Thread {
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader in = null;
	OutputStream os = null;
	Socket socket = null;
	PrintWriter pw = null;
	String mid="";
	
	// 서버 메모리에 사용자 리스트를 저장하는 공간
	static List<PrintWriter> list = new ArrayList<PrintWriter>(); // 암호화된 byte를 그대로 저장

	public chatroom(Socket sk) {
		this.socket=sk;
		try {
			/*
			this.os=this.socket.getOutputStream();
			this.pw=new PrintWriter(this.os);
			this.list.add(this.pw);
			*/
			
			//System.out.println(this.socket.getInetAddress());//상태방 접속 IP
			//System.out.println(this.socket.getKeepAlive()); //소켓 유/무 메소드 true,false(기본)
			//System.out.println(this.socket.getPort()); //접속 port
			
			//접속자 id 및 메시지
			this.isr=new InputStreamReader(this.socket.getInputStream());
			this.in=new BufferedReader(this.isr);
			this.mid=new String(this.in.readLine());

		} 
		catch (Exception e) {
			System.out.println("Socket 통신 오류 발생");
		}
	}
	//사용자에게 메시지 전체 발송 시스템
	@Override
	public void run() {
		try {
			System.out.printf("[%s]님이  입장 하셨습니다.\n", this.mid);
		} 
		catch (Exception e) {
			System.out.println("사용자 id가 올바르지 않습니다.");
		}
	}
	@SuppressWarnings({ "unused", "static-access" })
	private void sends() {
		for(PrintWriter pw:this.list) {
			pw.println();
			pw.flush();
		}
	}
}