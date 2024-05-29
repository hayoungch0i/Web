package oop;

import java.util.Arrays;
import java.util.Scanner;

public class class1 {

}

class cl1_box{
	load_class lc =new load_class();
	Scanner sc=new Scanner(System.in);
	
	public void news_data() {
		String result[]=lc.news();//반환된 배열값을 변수 배열로 받음
		System.out.println(Arrays.toString(result));
	}
	
	public void abc() {
		String result= this.lc.sc_code(1234);//인증번호 체크 메소드로 값 전달 및 반환
		System.out.println(result);
	}
	
	
	
}