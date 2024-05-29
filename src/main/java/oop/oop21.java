package oop;

import java.util.Scanner;

//더블 반목문을 이용한 코드 테스트
public class oop21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop21_box1 box=new oop21_box1();
		box.mult();
		
	}
}

class oop21_box1{
	public void mult() {
		Scanner sc=new Scanner(System.in); 
		System.out.println("첫번째 숫자를 입력하세요: ");
		int num1= sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요: ");
		int num2= sc.nextInt();
			for(int i=num1;i<=num2;i++) {
				for(int j=i;j<=num2;j++) {
					System.out.printf("%d*%d=%d\n", i, j, i*j);
				}
			}
			sc.close();
		}	
	}