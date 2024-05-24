package oop;

import java.util.Scanner;

//선택문 switch~case문
public class switch1 {
/* Scanner를 이용하여 다음과 같은 프로세서를 작성하시오*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("상품을 결제하실 항목을 선택해주세요: ");
		String ck=sc.nextLine();
		switch(ck) {
		case "1":
			System.out.println("신용카드로 결제합니다");
			break;
		case "2":
			System.out.println("휴대폰으로 결제합니다");
			break;
		case "3":
			System.out.println("무통장 입금 결제합니다");
			break;
		default:
			System.out.println("결제를 취소합니다");
			break;
			
		}
		sc.close();
	}

}
