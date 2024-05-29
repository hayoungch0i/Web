package oop;
import java.util.Scanner;
//응용문제 Scanner 라이브러리를 활용하여 두 숫자를 입력받아 합의 결괏값을 출력하시오.
public class oop16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num1,num2,sum=0;
		System.out.println("첫번째 숫자 값을 입력하세요: ");
		num1=sc.nextInt();
		System.out.println("두번째 숫자 값을 입력하세요: ");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.printf("두 숫자의 합: %d",sum);
		sc.close();
	}

}
