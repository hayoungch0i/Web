package oop;
	//do~while문
public class opp10 {

	public static void main(String[] args) {
		int a=15;
		do {
			//System.out.println(a);
			a--;
		}while(a>=10);
		
		
		int b=0;
		int sum=0;
		do {
			sum+=b;
			b++;
		}while(b<=10);
		System.out.println(sum);
		
		
		int c=1;
		int sum_even=0;
		int sum_odd=0;
		do{
			if((3*c)%2==0) {
				sum_even+=3*c;
			}
			else {
				sum_odd+=3*c;
			}
			c++;
		}while(c<10);
		System.out.println("홀수: "+sum_odd);
		System.out.println("짝수: "+sum_even);
		
		/*int d=1;
		do {
			System.out.println(d);
			d++;
		}while(true);
		*/
		
	}

}
