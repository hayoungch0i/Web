package game;

import java.util.Scanner;

//UP&DOWN GAME
public class updown {

	public static void main(String[] args) {
		new ud().gm();

	}

}

/*
 * int a=(int)Math.ceil(Math.random()*100); 
 * int b=(int)Math.floor(Math.random()*100); 
 * int c=(int)Math.round(Math.random()*100);
 */
class ud {
	int pc, user;
	int count = 0; // 게임 기회(실패 횟수)
	Scanner sc = null;

	public void gm() {
		sc = new Scanner(System.in);
		this.pc = (int) Math.ceil(Math.random() * 20);
		System.out.println("1~20 사이의 숫자 하나를 입력하세요: ");
		while (true) {
			user = sc.nextInt();
			//System.out.println(this.pc);
			if (this.user == this.pc) {
				System.out.println("정답입니다.");
				break;
			} else {
				count++;
				if (this.user > this.pc && count < 2) {
					System.out.println("DOWN");
				}
				else if (this.user < this.pc && count < 2) {
					System.out.println("UP");
				} 
				else if (count == 3) {
					System.out.println("FAIL: 횟수초과입니다");
					break;
				}
			}
		}

	}
}