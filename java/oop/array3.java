package oop;

import java.util.Scanner;

// 반복문+원시1차배열응용
public class array3 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int money[] = new int[5];
		int sum=0, i;
		for(i=0;i<5;i++){
			System.out.printf("%d번째 금액을 입력하세요: \n", i+1);
			money[i]=sc.nextInt();
			sum+=money[i];
		}
		sc.close();	
		System.out.printf("총 입금한 금액은: %d\n", sum);
	}

}
