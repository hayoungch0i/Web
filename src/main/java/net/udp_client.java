package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//채팅 클라이언트
public class udp_client {

	public static void main(String[] args) {
		new chat_client();
	}

}

class chat_client {
	private final int port = 9000; // 서버 포트
	private int myport = 0; // 자신이 사용하는 포트
	private DatagramSocket ds = null;
	private DatagramPacket dp = null;
	private InetAddress ia = null;
	private String msg = "";
	private InputStreamReader isr = null;
	private BufferedReader br = null;

	public chat_client() {
		this.myport = (int) (Math.ceil(Math.random() * 1000) + 9000);
		this.chatting();
	}

	private void chatting() {
		try {
			this.ds=new DatagramSocket(this.myport); //서버에게 자신의 포트 알림
			while (true) {
				System.out.println("상담내용을 입력하세요");
				this.isr = new InputStreamReader(System.in); //메시지 입력
				this.br = new BufferedReader(this.isr); //입력한 내용을 메모리에 임시저장
				this.msg = this.br.readLine(); //임시저장 된 내용을 변수 받아서 처리
				byte by[] = this.msg.getBytes(); // 메시지 String -> byte 변환
				this.dp = new DatagramPacket(by, by.length, this.ia, this.port); // 전송할 내용 패킷
				this.ds.send(this.dp); // 전송
				System.out.println("상담 내용 전송 완료!");

				// 서버 메시지 출력역할
				byte server[] = new byte[1024];
				this.dp = new DatagramPacket(server, server.length); //서버 패킷 확인
				this.ds.receive(this.dp); //서버 내용을 받음
				String server_msg = new String(this.dp.getData()); //byte -> 문자열 변환
				System.out.println(server_msg); // 출력
			}
		} catch (Exception e) {
			System.out.println("서버 접속 오류!");
		}
	}

}