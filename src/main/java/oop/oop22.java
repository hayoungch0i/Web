package oop;

import java.util.Scanner;

public class oop22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		sc.close();
	}

}

class oop22_lo{
	public void aaa(){
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int a=sc.nextInt();
		System.out.println("첫번쨰 숫자"+a);
		System.out.println("두번쨰 숫자를 입력하세요");
		int b=sc.nextInt();
		System.out.println("두번쨰 숫자"+b);
		System.out.println("짝수 또는 홀수를 입력하세요");
		String c=sc.nextLine();
		System.out.println("숫자"+c);
		sc.close();
	}
	
}
