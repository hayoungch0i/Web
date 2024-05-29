package net;

import java.net.Socket;

//Thread를 이용한 client
public class multi_client {

	public static void main(String[] args) {
		new client_port();
	}
}

class client_port {
	Socket sk = null;
	String serverip = "";
	int port = 0;

	public client_port() {
		this.serverip = "172.30.1.4";
		this.port = 9001;

		try {
			this.sk = new Socket(this.serverip, this.port);
			System.out.println("서버 접속 완료");

			// 대화시 Thread로 넘기는 방식
			Thread th = new client_open(); // Thread 메소드 호출
			th.start(); // Thread의 run() 메소드 실행
		}
		catch (Exception e) {
			System.out.println("서버 접속 오류 발생");
		}

	}

}

//채팅에 참여시 같은 포트 사용자끼리 대화시 사용되는 부분
class client_open extends Thread {
	public client_open() {

	}

	@Override
	public void run() {

	}
}