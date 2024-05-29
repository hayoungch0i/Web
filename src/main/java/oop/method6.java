package oop;

import java.util.Scanner;

//응용문제 외부 클래스를 이용하여 사용자가 하나의 숫자값을 입력,
public class method6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요: ");
		int num=sc.nextInt();
		number nb=new number();
		String result=nb.evenodd(num);
		System.out.println("입력하신 결과는 "+result+"입니다.");
		sc.close();
	}
}

class number{
	public String evenodd(int num) {
		String result="";
		if(num%2==0) {
			result="짝수";
		}
		else {
			result="홀수";
		}
		return result;
	}
}