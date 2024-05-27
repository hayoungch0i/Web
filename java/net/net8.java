package net;

/*
 Socket: 일반 socket(실시간 통신 가능) -> 웹 socket-http, https(실시간 통신X), 양방향 통신(node.js-wocket.io)-실시간 통신가능 
 Packet: 실제 데이터에서 앞, 뒤 정보를 표시하는 역할
 */
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class net8 {

	public static void main(String[] args) {
		new net8_client().client_start();

	}

}

class net8_client{
	private String ip=null; //서버 ip
	private int port=0; //udp 포트
	private int myport=0; //자신의 port를 체크해서 server로 전달
	private DatagramSocket ds=null; //socket
	private DatagramPacket dp=null; //packet 
	
	
	public void client_start() {
		this.ip="172.30.1.4";
		this.port=7000;
		//this.myport=7001;
		this.myport=(int) (Math.ceil(Math.random()*1000)+7000);
		try {
			InetAddress ia=InetAddress.getByName(this.ip);
			this.ds=new DatagramSocket(this.myport);
			while(true) {
				byte b[]=new byte[1024];
				this.dp=new DatagramPacket(b, b.length, ia, this.port); //서버 메시지를 받는 공간 생성
				this.ds.send(this.dp); //서버 메시지를 받음
				System.out.println("메시지 전송 완료");
				//byte b2[]=new byte[1024];
				this.ds.receive(this.dp);
				System.out.println(new String(this.dp.getData()));//서버 메시지 출력
			}
			
		} 
		catch(RuntimeException re) {
			System.out.println("서버 접속 지연시간으로 접속장애 발생");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}