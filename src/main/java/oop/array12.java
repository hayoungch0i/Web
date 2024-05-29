package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//원시배열 -> 클래스 배열 정렬
public class array12 {

	public static void main(String[] args) {
		//Collections.sort: 정렬(오름차순,내림차순)
		//Collections.reverseOrder(): 내림차순 정렬
		
		Integer data[]={3,6,1,9,8,7,10,2};
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(data));
		System.out.println(al);//정렬이 안된 배열값
		Collections.sort(al);//오름차순 정렬방식
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());//내림차순 정렬방식
		System.out.println(al);
		
		String user[]={"최하영","이윤석","김단희","하현수","김지현"};
		ArrayList<String> al2=new ArrayList<String>(Arrays.asList(user));
		Collections.sort(al2);
		System.out.println(al2);
		
		//원시배열 데이터 정렬
		Integer adata[]= {5,10,3,1,7,6,2};
		Arrays.sort(adata);
		System.out.println(Arrays.toString(adata));
		Arrays.sort(adata,Collections.reverseOrder());
		System.out.println(Arrays.toString(adata));
		
		
	}

}
