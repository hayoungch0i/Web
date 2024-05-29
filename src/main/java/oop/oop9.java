package oop;
//while문
public class oop9 {

	public static void main(String[] args) {
		int a=1;
		//while
		while(a<10) {
			//System.out.println(a);			
			a++;
		}
		//if+while문
		int b=1;
		while(b<10){
			if(6*b>=40){
				break;
			}
			else{
				System.out.printf("6*%d=%d\n",b,b*6);
			}
			b++;
		}
		
		int aa=0;
		while(true){ //while문 무한루프
			System.out.println(aa);
			aa++;
		}
		
	}
}
