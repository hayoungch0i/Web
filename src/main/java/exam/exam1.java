package exam;

import java.util.Scanner;

/*
응용문제1
Scanner 라이브러리를 이용하여 다음과 같이 나오도록 코드 작성. 단 최대 및 최소값:0~100
결과: 
점수를 입력해주세요: xx
100~80: A 등급
79~60: B 등급
59~40: C 등급
39~: D 등급
*/
public class exam1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("점수를 입력해주세요: ");
		int score=sc.nextInt();
		if(score<0 || score>100) {
			System.out.println("점수 범위는 0~100입니다.");
		}
		else {
			if(score<40) {
				System.out.println("D 등급");
			}
			else if(score<60) {
				System.out.println("C 등급");
			}
			else if(score<80) {
				System.out.println("B 등급");
			}
			else if(score<101) {
				System.out.println("A 등급");
			}
			
		}
		sc.close();
	}

}
