package net;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

//네트워크 URL 정보 현황
public class net4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String url= "https://borntostandout.com/category/eau-de-parfum/84/";
		try {
			URL u=new URL(url);
			URLConnection con=u.openConnection(); // URL명.openConnection(): 해당 경로 연결
			/*
			System.out.println(u.getProtocol()); //URL명.getProtocol(): 프로토콜(http, https, Ftp등)
			System.out.println(u.getPort()); //URL명.getPort(): 포트 번호(도메인명 이후 포트번호 명시하면 출력
			System.out.println(u.getHost()); //URL명.getHost(): 실제 도메인명
			System.out.println(u.getFile()); //URL명.getFile(): 경로+파라미터값(실행 파일)
			System.out.println(u.getPath()); //URL명.getPath(): 파라미터를 제외한 현재 경로 파일
			System.out.println(u.getQuery()); //URL명.getQuery(): 파라미터 값
			*/
			InputStream is=u.openStream();
			InputStreamReader isr=new InputStreamReader(is,"utf-8");
			BufferedReader br=new BufferedReader(isr);
			
			FileOutputStream fs=new FileOutputStream("d:\\join.html");
			PrintWriter pw=new PrintWriter(fs);
			
			String source="";
			while((source=br.readLine())!=null) {
				pw.println(source);
				pw.flush();
			}
			
			pw.close();
			fs.close();
			br.close();
			isr.close();
			is.close();
	
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
