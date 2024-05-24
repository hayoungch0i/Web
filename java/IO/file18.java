package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class file18 {

	public static void main(String[] args) {
		//String data="유재석";
		try {
			//InputStreamReader: Stream+Reader로 변환 가능한 라이브러리
			//Stream[byte] Reader[String]
			InputStreamReader isr=new InputStreamReader(System.in);
			
			//InputStreamReader -> BufferedReader
			BufferedReader br= new BufferedReader(isr);
			System.out.println(br.readLine());
			
			
			//OutputStreamWriter
			OutputStreamWriter osw=new OutputStreamWriter(System.out);
			BufferedWriter bw=new BufferedWriter(osw);
			//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			String msg="고객님의 포인트는 10000입니다";
			bw.write(msg);
			
			bw.close();
			//osw.close();
			br.close();
			isr.close();
			
		} 
		catch (Exception e) {
		
			
		}
		

	}

}
