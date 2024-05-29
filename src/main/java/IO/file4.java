package IO;

import java.io.File;

//파일 생성
public class file4 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("D:\\webpage\\agree\\src\\main\\java\\IO\\");
		sb.append("member.txt");
		System.out.println(sb);
		try {
			//File: 파일 생성, 삭제, 이동, 파일명 변경, 파일 속성 변경 할 때 사용
			File f=new File(String.valueOf(sb)); //File은 파일 생성 파트
			f.createNewFile(); //createNewFile(): 파일을 생성하는 메소드
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
