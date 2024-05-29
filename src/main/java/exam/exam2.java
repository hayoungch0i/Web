package exam;
import java.util.Scanner;

public class exam2 {
	/*
	
	*/
	public static void main(String[] args) {
		kiosk ki = new kiosk();
		// ki.menu1();

		String menu = ki.menu2();
		if (menu.equals("품절")) {
			System.out.println("해당 메뉴는 SOLD OUT입니다");
		} else {
			System.out.printf("%s를 신청하였습니다.\n", menu);
		}
	}

}

class kiosk {
	Scanner sc = new Scanner(System.in);

	public void menu1() {
		System.out.println("[키오스크]");
		System.out.println("메뉴선택: 1.커피 2.햄버거 3.콜라 4.피자");
		int num = sc.nextInt();
		String name = null;
		switch (num) {
		case 1:
			name = "커피";
			System.out.printf("%s를 신청하였습니다.\n", name);
			break;
		case 2:
			name = "햄버거";
			System.out.printf("%s를 신청하였습니다.\n", name);
			break;
		case 3:
			name = "콜라";
			System.out.printf("%s를 신청하였습니다.\n", name);
			break;
		case 4:
			name = "피자";
			System.out.printf("%s를 신청하였습니다.\n", name);
			break;
		default:
			System.out.printf("해당 메뉴는 SOLD OUT입니다.\n", name);
			break;
		}
		sc.close();
		
	}

	public String menu2() {
		System.out.println("[키오스크]");
		System.out.println("메뉴선택: 1.커피 2.햄버거 3.콜라 4.피자");
		int num = sc.nextInt();
		String name = null;
		switch (num) {
			case 1:
				name = "커피";
				break;
			case 2:
				name = "햄버거";
				break;
			case 3:
				name = "콜라";
				break;
			case 4:
				name = "피자";
				break;
			default:
				name = "품절";
				break;
		}
		sc.close();		
		return name;
	}
}
