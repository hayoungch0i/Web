package oop2;

import java.util.Scanner;

//예외처리 응용편
public class ex4 {

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("입금할 금액을 입력하세요: ");
		try {
			int money=sc.nextInt();
			System.out.println("정상적으로 입금되었습니다.");
		}
		catch (Exception e) {
			System.out.println("숫자만 입력하세요"); 
			ex4 ex=new ex4(); //오류시 해당 클래스와 메소드를 재실행시킴
			ex.main(args);
			e.getStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
