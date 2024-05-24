package exam;

import java.lang.Math;

public class exam3 {

	public static void main(String[] args) {
		new randNum();
	}

}

class randNum{
	
	public randNum() {
		int num=(int)Math.ceil(Math.random()*9);
		System.out.println("선택된 숫자: "+num);
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}
	}
	
} 