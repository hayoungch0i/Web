package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//Socket 통신 Client 
public class net6 {

	static Socket sk= null;
	public static void main(String[] args) {
		String ip = "172.30.1.51"; // 서버 주소
		int port = 9000; // 서버 포트
	
		System.out.println("클라이언트 접속 시도");
		Scanner sc = new Scanner(System.in);
		try {
			//System.out.println("서버에 연결되었습니다.");
			while (true) {
				sk = new Socket(ip, port);
				System.out.println("보낼 내용을 입력하세요: ");
				String msg = sc.nextLine();
				
				OutputStream os = sk.getOutputStream(); // 해당 소켓으로 OutputStream을 반환함
				byte m[] = msg.getBytes(); // 입력받은 문자열을 byte[]로 변환
				os.write(m); // bytes[] 전송
				os.flush(); // 빈공간 내용 초기화

				// 서버에서 보낸 내용을 클라이언트에서 메시지 출력
				InputStream is = sk.getInputStream();
				byte call[] = new byte[1024];
				is.read(call);
				String result = new String(call);
				System.out.println(result);
				is.close();
				os.close();
				sk.close();
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			sc.close();
		}
	}

}
