package oop;

import java.util.Scanner;

public class oop18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop18_box op18=new oop18_box();
		op18.abc();
	}

}
class oop18_box{
	public void abc() {
		Scanner sc=new Scanner(System.in);
		int i=1,sum=0;
		int price;
		while(i<5) {
			System.out.println("상품금액을 입력하세요: ");
			price=sc.nextInt();
			sum+=price;
			i++;
		}
		System.out.println(sum);
	sc.close();
	}
}