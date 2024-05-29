package oop2;

import java.util.List;
import java.util.Scanner;

//응용문제-oop_class4.java랑 연계
public abstract class ab2 {
	Scanner sc=new Scanner(System.in);
	List<Integer> list=null;
	Integer sum=0;
	
	//즉시 실행 해당 메소드는 abstract 안에서만 작동되는 메소드
	public ab2() {System.out.println("즉시실행");};
	 
	public abstract void ab_box(String id, String pw);
	
	public Integer calc(){
		return sum;
	};
		
}
