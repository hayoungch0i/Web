package oop;

import java.util.Scanner;

public class method4 {

	public static void main(String[] args) {
		method4_box mb=new method4_box();
		Scanner sc=new Scanner(System.in);
		//int result=mb.gugu(5, 10);
		//System.out.println(result);
		
		System.out.println("사용자 이름을 입력하세요: ");
		String name=sc.nextLine();
		String rank_name=mb.rank(name);
		System.out.printf("사용자 등급: %s",rank_name);
		sc.close();
	}
}

//사용자명에 따라 회원등급을 반환하는 return 코드

class method4_box{
	public String rank(String name) {
		String rank="";
		switch(name) {
			case "홍길동":
				rank="일반회원";
			break;
			case "이순신":
				rank="실버회원";
			break;
			case "유관순":
				rank="VIP회원";
			break;
			case "강감찬":
				rank="비회원";
			break;
			default:
				
			break;
		}
		return rank;
	}
	
	
	
	
	public int gugu(int a, int b) {
		int sum=0;
		while(a<=b) {
			sum+=a;
			a++;
		}
		return sum;
	}
	
	
}