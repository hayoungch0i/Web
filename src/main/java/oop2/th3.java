package oop2;

import java.util.ArrayList;
import java.util.Arrays;

//멀티 스레드 응용편
public class th3 {

	public static void main(String[] args) {
		// 응용문제 Thread를 이용하여 각배열의 값을 모두 더하는 결과줄력 프로세서 제작
		Integer data1[]= {10,20,30,40,50,60,70,80,90};
		Integer data2[]= {5,10,15,20,25,30,35,40,45};
		Integer data3[]= {7,14,21,28,35,42,49,56,63};
		
		Object data[]= {data1,data2,data3};
		th3_box tb[]=new th3_box[3];
		Thread tr[]=new Thread[3];
		
		for(int w=0;w<data.length;w++) {
			tb[w]=new th3_box((Integer[]) data[w]);		
			tr[w]= new Thread(tb[w]); 	
		}
		
		try {
			tr[0].start();
			tr[1].start();
			tr[2].start();
		} 
		catch (Exception e) {
			
		}
	}
}

class th3_box extends Thread{
	Integer sum=0;
	ArrayList<Integer> all= new ArrayList<Integer>();
	public th3_box(Integer z[]) {
		this.all=new ArrayList<Integer>(Arrays.asList(z));
	}
	
	@Override
	public void run() {
		try {
			for(Integer i: all) {
				sum+=i;
			};
			System.out.println(sum);
		} 
		catch (Exception e) {
			System.out.println("Thread 오류");
		}
	}
	
}