package oop;

import java.util.ArrayList;

//setter, getter를 이용한 데이터 주고받기
/*
DAO: Data Access Object: 
DTO: Data Transfer Object:
VO: Value Object, Getter 상수 데이터 이용하여 값을 가져오는 메소드
*/
public class web1 {

	public static void main(String[] args) {
		//반복문 사용시 new 오브젝트 할당량을 확인 해야함
		Integer a[] = {5,10,8,4,2};
		ArrayList<Integer>arr1=new ArrayList<Integer>();
		ArrayList<Integer>arr2=new ArrayList<Integer>();
		int w=0;
		while(w<a.length) {
			arr1=new ArrayList<Integer>();
			arr1.add(a[w]);
			arr2.add(arr1.get(0));			
			w++;
		}
		System.out.println(arr1);
		System.out.println(arr2);
		
		String user[][]=
			{
					{"hong","kim","park"},
					{"21","16","33"}
			};
		ArrayList<ArrayList<String>>all=new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>>all2=new ArrayList<ArrayList<String>>();
		ArrayList<String>al=new ArrayList<String>();
		int f=0;
		for(f=0;f<user[0].length;f++) {
			al.add(user[0][f]);
			al.add(user[1][f]);
			all.add(al);
			all2.add(al);
		}
		
		
	}

}
