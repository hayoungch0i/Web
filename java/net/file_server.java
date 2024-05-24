package net;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//파일 전송(서버)-FTP Server
public class file_server {

	public static void main(String[] args) {
		new ftp_server(10000);

	}

}


class ftp_server{
	int p=0;
	Socket sk=null;
	ServerSocket ss=null;
	InputStream is=null;
	FileOutputStream fs=null;
	
	
	public ftp_server(int port) {
		this.p=port;
		this.data();
	}
	
	private void data() {
		try {
			this.ss=new ServerSocket(this.p);
			this.sk=this.ss.accept();
			System.out.println("*************서버 가동중*************");
			String url="d://";
			
			//클라이언트가 전송한 파일을 읽어들여서 체크함
			this.is=this.sk.getInputStream();
			byte data[]=new byte[1024*1024*8];
			this.is.read(data);
			
			//서버에 저장
			this.fs=new FileOutputStream(url+"data.jpg");
			int filesize=0;
			while((filesize=this.is.read(data))!=-1){
				this.fs.write(data,0,filesize);
				this.fs.flush();
			}
			this.fs.flush();
			System.out.println("정상적으로 업로드 되었습니다.");
			
			this.fs.close();
			this.is.close();
			this.sk.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}