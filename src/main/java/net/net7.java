package net;
//UDP: 보안상 연결을 체크할 수 있음
//Server(TCP 5000번 port) <-> Client(TCP 5000번 port), Client(TCP 5000번 port), Client(TCP 5000번 port)
//Server(UDP 5000번 port) <-> Client(UDP 5000번 port), Client(UDP 5001번 port), Client(UDP 5002번 port) 
//TCP는 Client가 추가 되어도 같은 포트를 사용함(속도가 느려짐, 1:1일때 포트 관리 편함)
//UDP는 Client가 추가 될 때마다 클라이언트의 포트 번호가 늘어남(포트 하나로 여러 클라이언트와 통신(자동생성), 가상포트, n:n일때 포트 관리 편함)

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

public class net7 {

	public static void main(String[] args) {
		server_udp su=new server_udp();
		su.server_start();
	}

}

class server_udp{
	private String ip=null; //서버 IP
	private int port=0; //서버 포트
	private DatagramSocket ds=null; //UDP socket
	private DatagramPacket dp=null; //메세지 송수신 패킷
	
	public void server_start() {
		this.ip="172.30.1.4";
		this.port=7000;
		//1:1 접속
		//this.myport=7000;
		try {
			//Server ip를 확인
			InetAddress ia=Inet4Address.getByName(this.ip);
			this.ds=new DatagramSocket(this.port); //UDP 소켓 등록
			byte by[]=new byte[1024]; //전송할 byte
			this.dp=new DatagramPacket(by, by.length); //송수신에 사용되는 packet
			System.out.println("서버 오픈!");
			this.ds.receive(dp); //client에서 보낸 메세지를 서버에서 받는 역할(소켓 가동)
			
			// 클라이언트 정보 출력
			InetAddress client_ip= this.dp.getAddress(); //상대방 접속 ip를 가져옴
			int client_port=this.dp.getPort(); //상대방 접속 
			System.out.println(client_ip);
			System.out.println(client_port);
			
		} 
		catch (Exception e) {
			System.out.println("udp 포트 충돌 발생!");
			e.printStackTrace();
		}
		finally {
			this.ds.close();
		}
		
	}
	
}