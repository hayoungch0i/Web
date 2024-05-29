package oop;

import java.util.ArrayList;

//2차 원시 배열을 클래스 배열로 변경
public class array14 {
	
	public static void main(String[] args) {
		ay14_box ay=new ay14_box();
		ay.abc();
	}

}

class ay14_box{
	public void abc() {
		int a[][]= {
				{10,20,30},
				{100,200,300}
		};
		//2차 빈 배열
		ArrayList<ArrayList<Integer>>al2=new ArrayList<ArrayList<Integer>>();
		
		int w=0;
		while(w<a.length) {
			//1차 빈 배열
			ArrayList<Integer>al=new ArrayList<Integer>();
			int ww=0;
			while(ww<a[0].length) {
				al.add(a[w][ww]); //1차 배열에 값을 반복문으로 삽입
				ww++;
			}
			al2.add(al);//1차 클래스 배열의 전체 값을 2차 빈배열에 삽입
			w++;
		}
		//위는 정석대로의 코드
		
		
		System.out.println(al2);
		System.out.println(al2.get(1).get(2)); //al2[1][2] 출력 
		
		
		
		
		
	}
}