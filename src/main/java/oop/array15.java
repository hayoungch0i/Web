package oop;

import java.util.ArrayList;
import java.util.Arrays;

//method를 활용한 2차 클래스 배열 데이터 만들기
public class array15 {

	public static void main(String[] args) {
		/*
		 1.원시배열은 자료형 클래스를 이용해야함
		 2.외부 클래스에서 메소드를 1차 클래스 배열을 생성
		 3.반복문을 이용해서 return 결과를 2차 클래스 배열에 삽입
		 4.출력
		 */
		Integer a[][]= {
				{5,10,15,20},
				{6,12,18,24},
				{7,14,21,28}
		};
		ay15 ay=new ay15();
		ArrayList<ArrayList<Integer>>al=new ArrayList<ArrayList<Integer>>();//2차원 빈배열
		int w=0;
		while(w<a.length) {
			al.add(ay.abc(a[w]));//return된 1차 배열을 2차 배열에 삽입
			w++;
		}
		System.out.println(al);
	}

}

class ay15{
	
	//1차원 빈배열 메소드
	public ArrayList<Integer> abc(Integer data[]){
		ArrayList<Integer>all= new ArrayList<Integer>(Arrays.asList(data));
		
		return all;
	}
	
}
