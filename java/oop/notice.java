package oop;

import java.util.ArrayList;
import java.util.Collections;
//공지사항 부분 datalist.java랑 연결
//즉시 실행 메소드
public class notice {
	public static void main(String[] args) {
		notice_list nl=new notice_list();
		ArrayList<ArrayList<String>>data=nl.new_notice();
		System.out.println(data);
	}
}

class notice_list{
	
	datalist dl=new datalist();
	String data[][]=dl.notice(); //datalist.java에서 원시 배열 가져오기
	ArrayList<ArrayList<String>> arr= new ArrayList<ArrayList<String>>(); //빈 이차원 배열 생성
	
	//Collections.sort: 1차 배열에서만 가능
	public void product_list() { 
		Collections.sort(this.arr.get(0));//이상하게 정렬됨
		
	}
	
	public ArrayList<ArrayList<String>> new_notice(){
				
		for(int i=0; i<data.length;i++) {
			ArrayList<String> mini =new ArrayList<String>();
			for(int j=0; j<data[0].length;j++) { //반복하며 원시배열의 1차원 배열 저장
				mini.add(data[i][j]); 
			}
			this.arr.add(mini); //저장된 1차원 배열을 빈 이차원 배열에 추가
		}
		
		return arr;
	}
	
}