package oop;
//ArrayList와 LinkedList의 데이터 속도 처리 차이
import java.util.ArrayList; //ArrayList: 순차적으로 데이터를 읽기 또는 쓰기 할 경우 빠름
import java.util.LinkedList;//LinkedList:이미 데이터가 있는 상황에서 추가로 데이터를 중간에 삽입할 경우 빠름

public class web6 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		System.out.println(start);
		ArrayList<Integer>data1=new ArrayList<Integer>();
		
		LinkedList<Integer>data2=new LinkedList<Integer>();
		int w=0;
		do {
			data1.add(w);
			//data2.add(w);
			w++;
		}while(w<=1000000);
		int ww=0;
		int no=0;
		do {
			//data1.add(no,ww);
			data2.add(no,ww);
			ww++;
			no++;
		}while(ww<=500);
		
		
		
		
		
		long end=System.currentTimeMillis();
		System.out.println(end-start);

	}

}
