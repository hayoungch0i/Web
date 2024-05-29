package oop2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Exception: 예외처리 사용법
 1.사용자의 입력실수로 인해 정보전달이 안될경우
 2.개발자가 프로그램 오류시 정확한 오류 파악을 하기 위한 수단
 3.강제 프로세서에 대한 정보 수정 및 종료
 */
public class ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a = "2000";
		int b = 0;
		try { //try: 프로세서를 진행
			b = Integer.parseInt(a)/3;
			System.out.println(b);
			Integer user=sc.nextInt();
			System.out.println(user);
		} 
		catch (NumberFormatException nfe) { //catch는 try에서 문제 발생시 해당 문법이 발동
			System.out.println("문자를 숫자로 변경되는 사항 오류발생");
		} 
		catch(InputMismatchException ime) {
			System.out.println("숫자를 입력하셔야합니다.");
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		sc.close();
	}

}
