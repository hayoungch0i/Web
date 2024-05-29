package net;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//클라이언트-FTP Server에 파일 전송
public class file_client {

	public static void main(String[] args) {
		new ftp_client("172.30.1.51",10000);
		
		
	}

}

class ftp_client{
	String ip=null;
	int port=0;
	Socket sk=null;
	InputStream is=null;
	OutputStream os=null;
	
	public ftp_client(String serverIp, int serverPort) {
		this.ip=serverIp;
		this.port=serverPort;
		this.files();
		
	}
	
	private void files() {
		Scanner sc=new Scanner(System.in);
		try {
			this.sk=new Socket(this.ip, this.port);
			System.out.println("업로드 할 이미지 경로를 입력하세요.: ");
			String url=sc.nextLine();
			this.is=new FileInputStream(url);
			BufferedInputStream bs=new BufferedInputStream(this.is);
			byte img[]=new byte[bs.available()];
			bs.read(img);
			
			this.os=this.sk.getOutputStream();
			this.os.write(img);
			this.os.flush();
			this.os.close();
			this.is.close();
			sc.close();
		} 
		catch (Exception e) {
			System.out.println("서버에 접속하지 못하였습니다.");
		}
		
		
	}
	
}