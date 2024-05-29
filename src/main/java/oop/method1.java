package oop;

import java.util.Scanner;

//상수와 변수(전역변수, 지역변수), 메모리
public class method1 {

	public static void main(String[] args) {
		method1_box mb=new method1_box();
		mb.abc1();
		method1_box mb2=new method1_box();
		mb2.abc1();
		
		
	}
}

class method1_box {
	//field 영역(library, 배열, 변수(상수, 메모리) 선언
	String user;
	int a=10;
	final int b=100; //final: 변수를 상수로 만듬(값 변경 못함)
	static int c=1; //메모리에 저장하는 영역
	int d=1;
	Scanner sc=null; //라이브러리를 필드에 사용하여 해당 클래스 안에 사용하여 해당 라이브러리를 즉각 사용 가능
	public void abc1(){
		//this.b=500;
		this.user="홍길동";
		this.abc2();
	}
	
	public void abc2() {
		System.out.println(this.user);
		//System.out.println(user2);
		c++;
		this.d++;
		System.out.println(this.user);
		System.out.println(this.a);
		this.sc=new Scanner(System.in);
		System.out.println("아이디 입력");
		String mid=this.sc.next();
		System.out.println(mid);
	}
}
