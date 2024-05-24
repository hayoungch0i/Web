package IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//servlet, spring -> java -> jsp

public class file23 {

	public static void main(String[] args) {
		
		String url="D:\\webpage\\agree\\src\\main\\java\\IO\\info.txt";
		try {
			PrintWriter pw=new PrintWriter(url); //파일을 로드하여 해당 내용을 기록하는 클래스
			
			
			
			pw.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
