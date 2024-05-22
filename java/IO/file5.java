package IO;

import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class file5 {

	public static void main(String[] args) {
		String path="D:\\webpage\\agree\\src\\main\\java\\IO\\";
		String fileName="gugu.txt";
		gugudan gd=new gugudan();
		File f=new File("");
		try {
			f= gd.makeFile(path,fileName); //입력한 경로,파일명으로 파일 생성
			gd.gugucontent(f); //입력한 파일에 구구단을 추가
		} 
		catch (InputMismatchException e) {
			System.out.println("숫자만 입력해야합니다.");
			try {
				gd.gugucontent(f);
			} 
			catch (Exception e1) {
				e1.printStackTrace();
				System.out.println("강제 종료합니다.");
				System.exit(0);
			} 
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

class gugudan{
	
	public File makeFile(String path, String fileName) throws Exception { //입력한 path에 fileName으로 새 파일을 생성하고 해당 파일을 반환한다.
		StringBuffer sb=new StringBuffer();
		sb.append(path);
		sb.append(fileName);
		
		File f=new File(String.valueOf(sb));
		f.createNewFile();
		
		return f;
	}
	
	public void gugucontent(File f) throws Exception { //입력한 file에 table 단의 구구단을 쓰고 저장한다.
		Scanner sc=new Scanner(System.in);
		FileWriter fw=new FileWriter(f,false); //해당 파일을 처음부터 다시 쓰기로 설정
		
		System.out.printf("구구단을 입력하세요: ");
		int table=sc.nextInt();
		int i=1;
		
		while(i<=9) { //구구단 계산 및 파일에 추가하는 부분
			String line=(table+"*"+i+"="+table*i+"\n");
			fw.append(line);
			i++;
		}
		
		fw.close();
		sc.close();
	}
	
}
