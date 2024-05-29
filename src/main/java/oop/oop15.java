package oop;
import java.util.Scanner;
//scanner 사용시 next, nextLine 오류발생 원인
public class oop15 {

	public static void main(String[] args) {
		//임의 사용자 입력받는 라이브러리
		Scanner sc= new Scanner(System.in);
		String a,b;
		System.out.println("고객명을 입력하세요: ");
		a=sc.next();
		System.out.println(a);
		sc.nextLine();
		System.out.println("이메일을 입력하세요: ");
		b=sc.nextLine();
		System.out.println(b);
		//System.out.println(a+"/"+b);
		
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("연락처를 입력하세요: ");
		String tel=sc2.nextLine();
		System.out.println(tel);
		
		sc2.close(); //모든 라이브러리는 close 시 역순으로 닫아주어야 함(stack 구조) 
		sc.close();
	}

}
