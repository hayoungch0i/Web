package oop;

import java.util.Scanner;

//더블 반복문(복합) - Scanner 응용편
public class oop20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//oop20_box op20=new oop20_box();
		//op20.abc();
		Scanner sc2= new Scanner(System.in);
		System.out.println(sc2);
		int no1=sc2.nextInt();
		int no2=sc2.nextInt();
		oop20_box2 box2= new oop20_box2();
		box2.abc(no1, no2);
	}                                                                                                                                 
}

class oop20_box2{
	public void abc(int a, int b) {
		int w=a;
		while(w<=b) {
			for(int f=1;f<=9;f++) {
				System.out.printf("%d*%d=%d",w,f,w*f);
			}
			w++;
		}
	}
}



class oop20_box{
	public void abc() {
		Scanner sc =new Scanner(System.in);
		System.out.println("첫번째 구구단 숫자를 입력하세요: ");
		int gugu=sc.nextInt();
		System.out.println("두번째 구구단 범위 숫자를 입력하세요: ");
		int dan=sc.nextInt();
		int f,ff;
		for(f=gugu;f<=dan;f++){
			for(ff=1;ff<=9;ff++) {
			
			}
		}
		
	}
}