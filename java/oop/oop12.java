package oop;

public class oop12 {

	public static void main(String[] args) {
		int a=2;
		for(a=2;a<=9;a++) {
			for(int b=1;b<=9;b++) {
				//System.out.printf("%d*%d=%d\n",a,b,a*b);
			}
		}
		
		int c=5;
		while(c<=7) {
			int d=1;
			while(d<=9) {
				//System.out.printf("%d*%d=%d\n",c,d,c*d);
				d++;
			}
			c++;
		}
		
		int e=9;
		do {
			int f=1;
			do {
				//System.out.printf("%d*%d=%d\n",e,f,e*f);
				f++;
			}while(f<=9);
			e--;
		}while(e>=5);
		
		
		int g=6;
		int sum_odd=0;
		for(g=6;g<10;g++) {
			int h=1;
			do {
				if((g*h)%2==1) {
					sum_odd+=g*h;
				}
				h++;
			}while(h<=9);
		}
		System.out.println(sum_odd);
	
		int i=2;
		do {
			int j=1;
			while(j<=9) {
				if(i%2==1) {
					System.out.printf("%d*%d=%d\n",i,j,i*j);
				}
				j++;
			}
			i++;
		}while(i<=9);
	}
}
