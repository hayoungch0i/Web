package oop;

//import: 외부 클래스 또는 라이브러리를 가져올때,출력되는 코드
import java.util.Scanner;

//java에서 기본적으로 제공하는 scanner: library 사용
public class oop13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//사용자가 입력하는 가상의 입력창
		System.out.println("아이디를 입력하세요: ");
		String mid=sc.nextLine();	// .nextLine: 빈공간과 관계없이 데이터를 인식함.
		System.out.println(mid);	
		System.out.println("나이를 입력하세요: ");
		int mage=sc.nextInt();		// .nextInt: 숫자 하나를 입력받음 
		System.out.println(mage);
		System.out.println("이메일을 입력하세요: ");
		String email=sc.next();		// .next는 빈 공간 입력사항에 대해서 단어 전체데이터를 받지 못함 
		System.out.println(email);
	
		sc.close();	//라이브러리 종료
	}

}
