package oop;

import java.util.Arrays;

//return 메소드를 이용한 배열값 받기
public class array9 {
	public static void main(String[] args) {
		ar9_box ar=new ar9_box();
		int result[]=ar.point();
		System.out.println(Arrays.toString(result));
		
		// 허락된 key가 맞을 경우 데이터 출력
		String info[]=ar.user("a1234"); //key 값을 인자값으로 전송
		System.out.println(Arrays.toString(info));
		
		//2차 배열 return 
		int recall[][]=ar.money(); //2차 배열 호출 및 반환값 전달
		System.out.println(Arrays.deepToString(recall)); //출력
	}
}

class ar9_box{
	public int[][] money(){ //2차 배열 return 메소드
		int data[][]= {
				{10,20,30,40,50},
				{100,200,300,400,500}
		};
		return data; //배열값 반환
	}
	
	
	public int[] point() { //숫자형 1차배열 리턴 메소드
		int adata[]= {10,20,30,40,50};
		return adata;
		}
	
	public String[] user(String apikey) { // key 값을 인자값으로 받음
		if(apikey=="a1234") { //key 값이 동일할 경우 
			String userlist[]= {"박세은","최한결","신희문","김단희"};	
			return userlist; //해당 사용자 리스트 반환
		}
		else {	//key가 틀릴 경우
			String userlist[]=null;
			return userlist; //null값으로 반환 처리함
		}
	}	
}