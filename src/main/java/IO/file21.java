package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;

//csv 파일 로드
public class file21 {

	public static void main(String[] args) throws Exception {
		
		new file21_csv("member.csv");

	}

}

class file21_csv{
	String file_src="";
	File f=null;
	FileReader fr=null;
	BufferedReader br=null;
	
	public file21_csv(String url) throws Exception { //즉시실행
		this.file_src="D:\\webpage\\agree\\src\\main\\java\\IO\\"+url;
		this.csv_load(); //은닉화
	}
		
	private void csv_load() throws Exception {
		this.f=new File(this.file_src);
		try {
			this.fr=new FileReader(f,Charset.forName("euc-kr"));
			this.br=new BufferedReader(fr);
			String data="";
			while((data=this.br.readLine())!=null){
				System.out.println(data);
			}
		} 
		catch (Exception e) {
			e.getMessage();
		}
		finally {
			this.br.close();
			this.fr.close();
			
		}	
	}
	
}