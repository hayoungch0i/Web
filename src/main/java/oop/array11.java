package oop;

import java.util.ArrayList;
import java.util.Arrays;

//원시 배열을 클래스 배열로 변환
public class array11 {

	public static void main(String[] args) {
		//Arrays.asList: 원시 배열값을 클래스로 변환하는 메소드
		Integer data[]= {10,20,30,40,50};
		ArrayList<Integer> al= new ArrayList<Integer>(Arrays.asList(data));
		System.out.println(al);
		al.add(60);
		al.add(70);
		al.add(80);
		System.out.println(al);
		
		ArrayList<String> al2= new ArrayList<String>(1);
		al2.add("HTML&CSS");
		al2.add("Javascript 기초");
		al2.add("Java oop");
		System.out.println(al2);
		
		
	}

}
