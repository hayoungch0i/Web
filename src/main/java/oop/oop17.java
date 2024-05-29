package oop;

import java.util.Scanner;

//Scanner+반복문
public class oop17 {

	public static void main(String[] args) {
		//oop17_box op17 = new oop17_box();
		//op17.abc();
		// 응용문제 외부클래스(product)이며 메소드(product_cal) 코드를 추가하여 
		//사용할 포인트 입력
		oop17_product pd= new oop17_product();
		pd.product_cal();
	}
}
class oop17_product{
	public void product_cal() {
		int price=50000;
		Scanner scp=new Scanner(System.in);
		System.out.println("사용할 포인트 금액을 입력하세요: ");
		int point=scp.nextInt();
		if(point>price) {
			System.out.println("사용할 포인트가 상품금액을 초과하였습니다.");
		}
		else {
			System.out.println("최종 결제 금액: "+(price-point)+"원");
		}
		scp.close();
	}
}


class oop17_box{
	public void abc() {
		Scanner sc=new Scanner(System.in);	//가상 입력 라이브러리 로드
		System.out.println("출력할 구구단 단수를 입력하세요: ");
		int num=sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n", num, i, num*i);
		}
		sc.close();
	}	
}

