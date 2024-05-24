package oop2;

import java.util.Scanner;

//try, catch, final, throw, throws 전부 사용
public class ex8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("첫번째 숫자를 입력하세요: ");
			String a=sc.nextLine();
			System.out.println("두번째 숫자를 입력하세요: ");
			String b=sc.nextLine();
			Integer result=new ex8_box().files(a,b);
			System.out.println("결과: "+result);
					
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}

class ex8_box{
	public Integer files(String aa, String bb) throws Exception{
	int sum=0;
		try {
			sum=Integer.parseInt(aa)+Integer.parseInt(bb);
			System.out.println(sum);
		} 
		catch (Exception e) {
			System.out.println("인자값 숫자변환 오류");
			throw e;
		}
		return null;	
	}
}