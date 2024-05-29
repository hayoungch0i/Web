package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//다른 속성을 가진 ASCII 파일 읽기 및 쓰기
public class file2 {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("D:\\webpage\\agree\\src\\main\\java\\IO\\member.dat");
		Scanner scfr=new Scanner(fr);
		System.out.println(scfr.nextLine());  //해당 라인 전체를 읽어들이는 방식
		fr.close();
		FileWriter fw=new FileWriter("D:\\webpage\\agree\\src\\main\\java\\IO\\member.dat");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("추가 내용 입력: ");
		fw.write(sc.nextLine()); //write(): 해당 내용을 저장(덮어쓰기)시키는 메소드
		fw.append(sc.nextLine()); //append(): 해당 내용을 추가시키는 메소드
		scfr.close();
		sc.close();
		fw.close();
		
	}

}
