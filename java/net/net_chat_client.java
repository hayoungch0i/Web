package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class net_chat_client {

	public static void main(String[] args) {
		new net_chat_client().open();
	}
	@SuppressWarnings("unused")
	public void open() {
		String server_ip="172.30.1.33";
		int server_port=10000;
		Socket sk=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		Scanner sc=null;
		try {
			sk=new Socket(server_ip, server_port);
			System.out.println("[서버 접속 완료]");
			sc=new Scanner(System.in);
			System.out.println("접속할 ID를 입력하세요: ");
			String username=sc.nextLine();
			
			OutputStream os=sk.getOutputStream();
			os.write(username.getBytes());
			os.flush();
			
			Thread th=new clients(sk, username);
			th.start();
			
			/*
			is=sk.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			*/
		} 
		catch (Exception e) {
			System.out.println("******Server not Connected******");
		}
		
	}
}

class clients extends Thread{
	Socket serversk=null;
	String mid="";
	Scanner sc=null;
	
	public clients(Socket sk, String name) {
		this.serversk=sk;
		this.mid=name;
		this.sc=new Scanner(System.in);
	}
	
	@Override
	public void run() {
		try {
			OutputStream os=this.serversk.getOutputStream();
			os.write(this.mid.getBytes());
			os.flush();
			/*
			OutputStream os=this.serversk.getOutputStream();
			PrintStream ps=new PrintStream(os);
			ps.println(this.mid);
			ps.flush();
			*/
		} 
		catch (Exception e) {
			System.out.println("Thread 소켓 통신 오류");
		}
	}
}
