package exam;

import java.util.Scanner;

public class exam8_2 {

	public static void main(String[] args) {
		new menuNnum2();

	}
}

class menuNnum2 {

	String list[][] = { { "콜라", "3000" }, { "커피", "1500" }, { "아이스크림", "500" } };
	Scanner sc = new Scanner(System.in);

	public menuNnum2() {
		System.out.println("[키오스크]");
		System.out.println("메뉴선택:");
		for(int i=0;i<list.length;i++) {
			System.out.printf("%d.%s ", i+1, list[i][0]);
		}
		int num = sc.nextInt();
		
		if (num > 0 && num < 4) {
			int price = Integer.parseInt(list[num - 1][1]);

			System.out.println("해당 메뉴의 갯수를 입력하세요: ");
			int pcs = sc.nextInt();
			int totalPrice = price * pcs;
			System.out.println("총 결제 금액: "+totalPrice+"원");
		} 
		else {
			System.out.println("잘못된 값을 입력하셨습니다.");
			System.exit(0);
		}
		
		sc.close();
	}

}