package oop;

import java.util.Arrays;

//배열 생성 및 출력방법(1차 배열) - 원시 배열, class 배열
public class array1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int[] b= {10,20,30,40,50};
		System.out.println(a.length);
		System.out.println(b[3]);
		String c[]= {"홍길동","이순신","강감찬"};
		System.out.println(c[1]);
		//Arrays: 배열 클래스를 이용, 문자화하여 배열로 출력
		System.out.println(Arrays.toString(b)); //데이터 파싱(원하는 형태로 변환)
		int data[]=new int[4]; //빈 배열
		data[0]=100;
		data[1]=200;
		//data[2]=300;
		data[3]=400;
		//data[4]=500;  배열번호보다 큰 값이 적용되으로 error처리
		System.out.println(Arrays.toString(data));
		String userlist[]= new String[2];
		userlist[1]="이순신";
		System.out.println(Arrays.toString(userlist));
		Object list[]={"홍길동",25,"이순신",30}; //복합배열 
		System.out.println(Arrays.toString(list));
	}

}
