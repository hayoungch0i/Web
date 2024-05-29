package net;
//Server Open( Socket 통신 환경 ) - TCP

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class net5 {

	public static void main(String[] args) {
		System.out.println("Server Connection");
		int port=9000; //서버 port 적용
		try {
			//해당 포트를 open
			ServerSocket ss=new ServerSocket(port);
			while(true) { //서버에서 접속을 유지하기 위한 반복문
				Socket sk= ss.accept();
				System.out.println("호스트 통신 연결 성공");
				Scanner sc=new Scanner(System.in);
				
				InputStream is=sk.getInputStream(); //클라이언트에서 메시지를 받는 Stream
				byte msg[]=new byte[1024]; //최대 받을수있는 메시지의 크기 설정(InputStream.available() 사용시 0입력됨)
				is.read(msg);
				String result=new String(msg);
				System.out.println(result);
				
				String cms=sc.nextLine();
				OutputStream os=sk.getOutputStream(); //서버에서 메시지를 보내는 Stream
				byte call[]=cms.getBytes();
				os.write(call);
				os.flush();
				
				is.close();
				os.close();
				sk.close();
				ss.close();
				sc.close();
			}
		}
		catch (Exception e) {
			//System.out.println("현재 서버 포트 충돌로 인하여 서버를 가동하지 못합니다.");
			e.getMessage();
			e.printStackTrace();
		}
		finally {
			
		}
	}

}
