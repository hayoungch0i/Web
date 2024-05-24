package oop;

import java.util.ArrayList;

//클래스 array리스트 배열(원시배열+ArrayList)
public class array10 {
	ay10_box ay=new ay10_box();
	
}

class ay10_box{
	public void abc() {
		ArrayList<String> al=new ArrayList<String>();
		//ArrayList:
		//remove:배열에 데이터 삭제(삭제시 배열번호 변경
		//size: 배열의 데이터 갯수
		//clear: 배열의 모든 데이터 삭제
		//get: 배열에 있는 데이터 출력
		al.add("홍길동");
		al.add("강감찬");
		al.add("유관순");
		al.add("이산");
		al.add("이순신");
		System.out.println(al.get(3));
		System.out.println(al);
		al.add("장보고");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		al.add("홍길동");
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
		//복사 클래스 배열
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(5);
		al2.add(1);
		al2.add(8);
		System.out.println(al2);
		
		//clone: class배열을 복사할 수 있다(추가 삭제 모두 가능)
		/*
		ArrayList<Integer> al3=(ArrayList<Integer>) al2.clone();
		al3.add(10);
		al3.add(20);
		System.out.println(al3);
		*/
		
	}
}