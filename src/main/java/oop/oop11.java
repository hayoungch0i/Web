package oop;
	//반복문을 이용한 응용편
public class oop11 {

	public static void main(String[] args) {
		//무한루프 이용 50이하까지 반복문 모든 합계 while
		int a=1;
		int sum_a=0;
		while(true) {
			if(a==50) {
				break;
			}
			else {
				sum_a+=a;
			}
			a++;
		}
		System.out.println(sum_a);
	///////////////////////////////////////////////////////////////////////////////////
		
		int b=1;
		int sum_b=0;
		for(b=1; ;b++) {
			if(b>=70) {
				sum_b+=b;
				if(b==79) {
					break;
				}
			}
		}
		System.out.println(sum_b);
	}

}
