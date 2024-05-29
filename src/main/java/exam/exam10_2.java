package exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class exam10_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer list[] = { 1, 3, 6, 9, 12, 15, 18, 21, 24, 27 };
		LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(list));
		System.out.println("1~30 사이의 숫자를 입력하시오.: ");
		int num = sc.nextInt();
		if (ll.contains(num)) {
			//중복된 숫자일 경우 그냥 출력
		} 
		else {
			if (num > 0 && num < 31) {
				ll.add(num);
				Collections.sort(ll);
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.exit(0);
			}
		}
		System.out.println(ll);
		sc.close();
		
	}
}
