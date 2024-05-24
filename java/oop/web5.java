package oop;

import java.util.Arrays;
import java.util.LinkedList;

//Linked List 클래스 배열
public class web5 {

	public static void main(String[] args) {
		Integer a[]= {1,3,5,7,9};
		LinkedList<Integer>ls=new LinkedList<Integer>(Arrays.asList(a));
		System.out.println(ls);
		LinkedList<Integer>ls2=new LinkedList<Integer>();
		ls2.add(10);
		ls2.add(20);
		ls2.add(30);
		ls2.add(2,50); //LinkedList.add: ArrayList와 사용법 동일
		ls2.remove(0); //LinkedList.remove: ==clear
		ls2.set(1, 500); //LinkedList.set: 해당 배열 번호에 데이터를 수정 변경시킴
		ls2.push(100); //LinkedList.push: 0번째 자리에 데이터를 집어넣음
		Integer aa=ls2.pop(); //LinkedList.pop: 배열의 0번째 값을 삭제하고 출력
		Integer bb=ls2.peek(); //LinkedList.peek: 배열의 0번째 값을 복사하여 출력
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(ls2);
	}

}
