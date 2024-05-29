package exam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class exam10_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer list[] = { 1, 3, 6, 9, 12, 15, 18, 21, 24, 27 };
		LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(list));
		System.out.println("1~30 사이의 숫자를 입력하시오.: ");
		Integer num = sc.nextInt();
		if (ll.contains(num)) {
			//중복된 숫자일 경우 그냥 출력
		} 
		else {
			if (num > 0 && num < 31) {
				for(int i=0;i<ll.size();i++) {
					if(num<ll.getFirst()) {
						ll.addFirst(num);
					}
					else if(num>ll.getLast()) {
						ll.addLast(num);
					}
					else if(i<ll.size()-1) {
						if(num<ll.get(i+1) && num>ll.get(i)) {
							ll.add(i+1, num);
						}
					}
				}
			} 
			else {
				System.out.println("잘못 입력하셨습니다.");
				System.exit(0);
			}
		}
		System.out.println(ll);
		sc.close();
		
	}
}
