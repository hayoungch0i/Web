package net;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Scanner;

//외부서버에 있는 이미지
public class net3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("웹에서 가져올 이미지 주소를 입력하세요:");
			String url=sc.nextLine();
			URL u=new URL(url);
			URLConnection con=u.openConnection();//해당 서버에 접근
			
			int imgsize=con.getContentLength(); //파일 사이즈
			String imgtype=con.getContentType(); //파일 속성 및 확장자
			long date=con.getDate(); //getDate():해당파일에 접속하는 날짜
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy--mm-dd");
			String today=sdf.format(date);
			System.out.println(imgsize);
			System.out.println(imgtype);
			System.out.println(date);
			
			//Stream 형태
			InputStream is=u.openStream(); //openStream(): 외부에서 접속하는 파일
			BufferedInputStream bs=new BufferedInputStream(is);
			byte b[]=new byte[bs.available()];
			
			//pc에 저장(저장 경로 및 파일명)
			String copy="d:\\";
			FileOutputStream fs=new FileOutputStream(copy+"123.png");
			int  size=0;
			while((size=bs.read(b))!=-1) {
				fs.write(b,0,size); // 파일 크기에 맞춰서 저장하는 형태
				fs.flush();
			}
			fs.close();
			sc.close();
		
		
		} catch (Exception e) {
			System.out.println("해당 서버로 접속이 제한 되었습니다.");
			
		}
		
		finally {
			
		}
	}

}
