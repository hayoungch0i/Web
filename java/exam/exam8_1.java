package exam;

import java.util.Scanner;

public class exam8_1 {

	public static void main(String[] args) {
		menuNnum mNn=new menuNnum();
		mNn.setmenuNcount();
	}
}

class menuNnum{
	exam8dto dt=new exam8dto();
	
	public void setmenuNcount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("[키오스크]");
		System.out.println("메뉴선택:\n1.콜라 - 3000 2.커피 - 1500 3.아이스크림 - 500");
		int num = sc.nextInt();
		switch (num) {
			case 1:
				dt.setName("콜라");
				dt.setPrice(3000);
				break;
			case 2:
				dt.setName("커피");
				dt.setPrice(1500);
				break;
			case 3:
				dt.setName("아이스크림");
				dt.setPrice(500);
				break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				System.exit(0);
				break;
		}
		
		System.out.println("해당 메뉴의 갯수를 입력하세요: ");
		int pcs=sc.nextInt();
		dt.setCount(pcs);
		int pricePerPiece=dt.getPrice();
		int totalPrice=pricePerPiece*pcs;
		System.out.println("총 결제 금액: "+totalPrice+"원");
		sc.close();
	}
	
}