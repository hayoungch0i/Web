package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;

//csv 데이터 저장
public class file20 {

	public static void main(String[] args) throws Exception {
		new file_csv("member.csv");
	}

}

class file_csv{
	String file_src="";
	File f=null;
	FileWriter fw=null;
	BufferedWriter bw=null;
	
	public file_csv(String url) throws Exception { //즉시실행
		this.file_src="D:\\webpage\\agree\\src\\main\\java\\IO\\"+url;
		this.member_input(); //은닉화
	}
		
	private void member_input() throws Exception {
		this.f=new File(this.file_src);
		try {
			//FileWriter(파일경로, 언어셋, true): txt외의 문서파일에 한글 깨짐이 발생할 경우 언어셋을 Charset.forName("euc-kr")으로 설정
			this.fw=new FileWriter(this.f, Charset.forName("euc-kr"), true); //이어쓰기 위해 true 설정
			this.bw=new BufferedWriter(this.fw);
			ArrayList<String> mb=new ArrayList<String>();
			mb.add("유재석,ISFP");
			mb.add("강호동,ENFP");
			mb.add("안정환,INFP");
			mb.add("조정석,INTP");
			mb.add("차은우,ENTP");
			
			for (String m : mb) {
				this.bw.write(m+"\n");
				this.bw.flush(); //write를 사용했으므로 flush로 메모리를 초기화 함
			}
			
		} 
		catch (Exception e) {
			
		}
	}
	
}