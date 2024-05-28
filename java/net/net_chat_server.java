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
	//소켓을 유지하는 Thread
	public void open() {
		ServerSocket ss=null;
		Socket sk=null;
		
		try {
			ss=new ServerSocket(9000);
			System.out.println("[채팅 서버 오픈]");
			while(true) { //해당 반복문은 소켓을 유지하기 위한 반복문
				sk=ss.accept();
				
				//Thread부분에서 채팅이 작성됨
				chatroom ch=new chatroom(sk); 
				ch.start();
			}
		} 
		catch (Exception e) {
			System.out.println("서버 포트 충돌로 인하여 서버 가동을 중지합니다.");
		}
		finally {
			if(ss!=null) {
				try {
					ss.close();
					System.out.println("서버를 강제 종료 합니다.");
				} 
				catch (Exception e) {
					System.out.println("서버 소켓이 완전 오류가 발생함");
					System.exit(0);
				}
			}
		}
	
	}
}
//관리자가 직접 채팅을 사용하여 입력시는 별도의 Thread 필요
class admin extends Thread{
	
	
}

//송신 역할을 하는 Thread
class chatroom extends Thread {
	
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	OutputStream os = null;
	Socket socket = null;
	PrintWriter pw = null; //Stream에서 Writer로 자동변환(byte->String)
	String mid="";
	
	static List<PrintWriter> list=new ArrayList<PrintWriter>();
	
	private void message(String msg) { //배열에 있는 모든 사용자에게 동일한 메시지 전달
		for(PrintWriter pw:this.list) {
			pw.println(msg); //전체 발송
			pw.flush(); //메모리 내용 비우기
		}
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		try {
			this.mid=this.br.readLine();
			String hello="["+this.mid+"]님 입장하였습니다.";
			System.out.println(hello); //서버에서 해당 클라이언트 내용을 출력
			message(hello); //전체 발송
			
			while(this.br!=null) { //메세지를 입력하면 작동되는 반복문
				hello=this.br.readLine().intern();
				if(hello=="나가기") {
					break;
				}
				else{
					message(this.mid+":"+hello);
				}
			}
		} 
		catch (Exception e) {
			System.out.println("사용자 추가 오류 발생으로 접속이 해제 됩니다.");
		}
		finally {
			this.message(this.mid+"님이 퇴장하였습니다.");
			this.list.remove(this.pw);
			try {
				this.socket.close();
			} catch (Exception e) {
				System.out.println("채팅 서버 종료");
			}
			System.out.println(this.mid+"퇴장");
		}
	}

	@SuppressWarnings("static-access")
	public chatroom(Socket s) {
		this.socket=s;	
	
		try {
			//접속에 대한 정보를 리스트 배열에 추가
			this.pw=new PrintWriter(this.socket.getOutputStream()); 
			this.list.add(this.pw);
			//System.out.println(this.list.size());
			
			//채팅 관련 정보
			this.is=this.socket.getInputStream();
			this.isr=new InputStreamReader(this.is);
			this.br=new BufferedReader(this.isr);
			
			//System.out.println(this.socket.getInetAddress()); //상대방 접속 IP
			//System.out.println(this.socket.getKeepAlive()); //소켓 유무 true/false(기본)
			
		} 
		catch (Exception e) {
			System.out.println("소켓통신 오류 발생");
		}
		
		
	}
	
}