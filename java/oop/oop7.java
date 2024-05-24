package oop;

public class oop7 {
//외부 클래스를 이용하여 해당 조건에 맞는 결과를 출력하는 코드를 작성하시오.
	public static void main(String[] args) {
		oop7_multiple multi=new oop7_multiple();
		multi.mul(33, 42, 82);
	}
}

class oop7_multiple{
	public void mul(int a, int b, int c){
		int sum=a*b*c;
		if(sum%2==1) {
			System.out.println("홀수");
		}
		else {
			System.out.println("짝수");
		}
	}	
}