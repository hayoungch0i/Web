package oop;

import java.util.Scanner;

public class oop19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank bk=new bank();
		bk.aaa();
	}	
}

class bank{
	public void aaa(){
		Scanner sc=new Scanner(System.in);
		int total=100000;
		int out=0;
		for(int i=1; i<=3;i++) {
			System.out.println("출금하실 금액을 입력하세요: ");
			out=sc.nextInt();
			if(total<out) {
				System.out.println("잔액보다 큰 금액이므로 출금 되지 않습니다.");
				System.out.println("현재 잔액:"+total);
			}
			else {
				total-=out;
			}
		}
		System.out.println("총 잔액: "+total+"원");
		sc.close();
	}
	
}