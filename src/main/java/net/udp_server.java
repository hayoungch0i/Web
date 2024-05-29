package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//채팅 서버
public class udp_server {

	public static void main(String[] args) {
		new chat_server();
	}

}

class chat_server {
	private final String ip = "172.30.1.4";
	private final int port = 9000;
	private DatagramSocket ds = null;
	private DatagramPacket dp = null;
	private InetAddress ia = null;
	private String msg = "";
	private InputStreamReader isr = null;
	private BufferedReader br = null;

	public chat_server() {
		try {
			this.ia = InetAddress.getByName(this.ip);
			this.ds = new DatagramSocket(this.port);
			this.udp();

		} catch (Exception e) {
			System.out.println("포트 충돌로 인하여 서버가 작동되지않습니다.");
			e.printStackTrace();
		}

	}

	private void udp() {
		try {
			while (true) {
				byte server_byte[] = new byte[1024];
				this.dp = new DatagramPacket(server_byte, server_byte.length, this.ia, this.port);
				System.out.println("상담 시작"); // 서버 오픈 대기
				this.ds.receive(this.dp); // 클라이언트에서 전송한 메시지를 받는 역할
				this.msg = new String(this.dp.getData()); //전송된 byte를 문자열로 변환
				System.out.println(this.msg); //클라이언트가 입력한 값 출력

				// 클라이언트에게 전송 메시지
				System.out.println("메시지를 입력하세요:  ");
				InetAddress ia2 = this.dp.getAddress(); //상대방 ip
				int port2=this.dp.getPort(); //상대방 포트
				this.isr=new InputStreamReader(System.in); //보낼
				this.br=new BufferedReader(this.isr);
				this.msg=this.br.readLine();
				byte client_msg[]=this.msg.getBytes();
				this.dp=new DatagramPacket(client_msg, client_msg.length, ia2, port2);
				this.ds.send(this.dp);
				
			}

		} catch (Exception e) {
			System.out.println("UDP 서버 오픈 오류 발생");
		}

	}

}
