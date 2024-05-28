package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class net_chat_client {

	public static void main(String[] args) {
		new net_chat_client().open();
	}

	public void open() {
		String server_ip="172.30.1.51";
		int server_port=9000;
		try{
			Socket sk=new Socket(server_ip, server_port); 
			System.out.println("[채팅 서버 접속 완료]");
			Scanner sc=new Scanner(System.in);
			System.out.println("생성할 아이디를 입력하세요: ");
			String mid=sc.nextLine();
			
			//Thread로 값을 이관(서버에 메세지를 송신)
			Thread th=new chat_clients(sk, mid);
			th.start();
			
			//접속 입장시 상대방에 대한 메시지를 출력(서버쪽 내용을 출력)
			InputStream is=sk.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			//BufferedReader 시 null이 아닐 경우 송수신에 대한 byte 메모리가 full이 되므로 값이 전송안됨
			BufferedReader br=new BufferedReader(isr);
			
			//수신
			while(br!=null) {
				String chat_msg=br.readLine(); //서버에서 받은 내용을 문자 배열로 받음
				
				if(chat_msg.equals(mid+"님이 퇴장하였습니다.")){ //서버에서 보내준 내용과 동일할 경우 종료
					System.out.println("채팅 프로그램 종료");
					System.exit(0); //강제 종료
				}
				//자신의 화면에 서버 메세지를 출력하는 역할
				System.out.println("전송: "+chat_msg);
			}
			
			sc.close();
			sk.close();
		}
		catch(Exception e){
			System.out.println("소켓통신 서버 접근 오류");
		}
	}
}

//송신역할 하는 Thread
class chat_clients extends Thread {
	Socket sk = null;
	String mid = "";
	Scanner sc = null;

	public chat_clients(Socket s, String id) {
		this.sk=s;
		this.mid=id;
		sc=new Scanner(System.in);
		
	}

	@Override
	public void run() {
		try {
			//접속 아이디를 전송(첫번째 메시지)
			PrintStream ps=new PrintStream(this.sk.getOutputStream());
			ps.println(this.mid);
			ps.flush();
			
			//사용자가 입력하는 메시지를 서버로 전송
			while(true) {
				System.out.println("채팅 메시지를 입력하세요");
				String msg=this.sc.nextLine();
				ps.println(msg);
				ps.flush();	
			}
		} 
		catch (Exception e) {
			System.out.println("서버 소켓 오류 발생으로 채팅이 중지됩니다.");
		}
	}
}
