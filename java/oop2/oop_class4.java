package oop2;

import java.util.ArrayList;

//ab2.java랑 연계
public class oop_class4 {

	public static void main(String[] args) {
		oc4_box ob=new oc4_box();
		System.out.println("합계: "+ob.calc());
	}
}

class oc4_box extends ab2{
	
	@Override
	public Integer calc() {
		int i=0;
		this.list=new ArrayList<Integer>();
		while(i<10) {
			System.out.println((i+1)+"번째 숫자를 입력하세요: ");
			Integer num=this.sc.nextInt();
			this.list.add(num);
			this.sum+=num;
			i++;
		}
		sc.close();
		return this.sum;
	}
	
	@Override
	public void ab_box(String id, String pw) {
		
		
	}
}