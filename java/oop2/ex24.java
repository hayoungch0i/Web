package oop2;
//menu_interface.java 연계

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) throws Exception {
		menuShow ms = new menuShow();
		ms.sc.close();
	}
}

class menuShow {
	Scanner sc = null;

	public menuShow() throws Exception {
		try {
			sc = new Scanner(System.in);
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.돈까스 2.함박스테이크 3.냉면 4.콩국수");
			String str=sc.nextLine().intern();
			int num = Integer.parseInt(str); 
			whatMenu wm = new whatMenu();
			switch (num) {
			case 1:
				cutlet ctl = new cutlet();
				wm.confirm(ctl);
				break;
			case 2:
				hamburg hbg = new hamburg();
				wm.confirm(hbg);
				break;
			case 3:
				naengmyeon mn = new naengmyeon();
				wm.confirm(mn);
				break;
			case 4:
				konggugsu kg = new konggugsu();
				wm.confirm(kg);
				break;
			default:
				System.out.println("메뉴에 없는 코드입니다.");
				System.exit(0);
				break;
			}

		} catch (Exception e) {
			System.out.println("잘못된 코드입니다.");
			System.exit(0);
		}
	}
}

class whatMenu {
	String name = null, taste = null, set = null;
	int price = 0;

	public void confirm(menu_interface mi) {
		this.name = mi.getName();
		this.price = mi.getPrice();
		this.taste = mi.getTaste();
		this.set = mi.getSet();
		this.printExplanation();
	}

	private void printExplanation() {
		System.out.printf("%s: %d원 %s %s", this.name, this.price, this.taste, this.set);
	}
}

class cutlet implements menu_interface {
	String name = "돈까스";
	int price = 9000;
	String taste = "약간매운맛";
	String set = "우동";

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getTaste() {
		return taste;
	}

	public String getSet() {
		return set;
	}

}

class hamburg implements menu_interface {
	String name = "함박스테이크";
	int price = 14500;
	String taste = "담백한맛";
	String set = "야채튀김";

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getTaste() {
		return taste;
	}

	public String getSet() {
		return set;
	}

}

class naengmyeon implements menu_interface {
	String name = "냉면";
	int price = 10000;
	String taste = "새콤달콤한맛";
	String set = "";

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getTaste() {
		return taste;
	}

	public String getSet() {
		return set;
	}

}

class konggugsu implements menu_interface {
	String name = "콩국수";
	int price = 4800;
	String taste = "달콤한맛";
	String set = "서리태콩국수";

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getTaste() {
		return taste;
	}

	public String getSet() {
		return set;
	}

}
