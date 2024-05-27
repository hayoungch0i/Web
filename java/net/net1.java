package net;
/*

	네트워크 
	1. Ip or 도메인 주소
	2. Port - 중복 사용이 불가능, 단, TCP와 UDP로 구분 될 경우는 가능(서로 다른 프로토콜의 같은 포트 번호는 서로 다르다고 봄)
	3. TCP - 외부 연결 프로토콜
		포트를 열어놓기만 하면 외부에서 접속 가능
		전송속도가 빠름  
	4. UDP - 내부 연결 프로토콜
		서버와 클라이언트에서 같은 포트를 열어놓고 사용해야만 접속이 가능
		전송속도가 느림, 단 1:1일 경우 TCP보다 빠름
	
 */

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

public class net1 {

	public static void main(String[] args) throws Exception {
		//Inet4Address.getByName("도메인"): 접속할 도메인의 IP 주소
		InetAddress ia=Inet4Address.getByName("naver.com"); 
		System.out.println(ia.getHostName()); //해당 주소의 도메인 명
		System.out.println(ia.getHostAddress()); //해당 주소의 IP 주소
		System.out.println(ia); //도메인 명과 IP 주소
		
		//Inet4Address.getAllByName("도메인"): 접속할 도메인의 모든 IP 주소를 리스트 함
		InetAddress all[]=Inet4Address.getAllByName("google.com");
		System.out.println(Arrays.toString(all));
	}

}
