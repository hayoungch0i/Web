package net;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class net2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			//socket: 외부에서 접속 할 수 있도록 오픈하는 하나의 경로
			ServerSocket ss=new ServerSocket();
			InetSocketAddress ia=new InetSocketAddress("127.30.1.33", 7070);
			//bind: 정적(자식생성 후 포풀), 동적(부모에게 접근)
			ss.bind(ia);
			System.out.println("연결 중입니다..."); //socket오픈 시 해당 라인에서 정지(대기)
			
			//소켓으로 접속 시 아래 코드 활성화
			Socket sc=ss.accept();
			//getRemoteSocketAddress: 상대방의 ip주소흫 확인 및 접속 소켓 확인
			InetSocketAddress ia2=(InetSocketAddress)sc.getRemoteSocketAddress();
			System.out.println("연결확인");
			
			ss.close();
		} catch (Exception e) {
			System.out.println("해당 서버에 오류가 발생 하였습니다.");
		}

	}

}
