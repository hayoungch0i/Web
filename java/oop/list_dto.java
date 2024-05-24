package oop;

import java.util.ArrayList;
import java.util.List;

public class list_dto {

	public static void main(String[] args) {
		new list_data();
	}

}

class list_data{
	String user[][]= {
			{"hong","kim"},
			{"홍길동","강감찬"}
	};
	//클래스 배열에 getter,setter 클래스를 로드하여 1차 배열을 생성 및 출력
	List<dto_info> di=null; //개발자가 ArrayList, LinkedList, Hashmap을 자유롭게 변경하기 위해 List 사용
	
	public list_data() { //즉시 실행 메소드
		this.list_useradd();
	}
	
	public void list_useradd() { //사용자를 추가하는 메소드
		dto_info sg=new dto_info();
		int w=0;
		while(w<this.user.length) {
			this.di= new ArrayList<dto_info>(); //1차 배열로 값을 원시->클래스 배열로 이관
			sg.setMid(user[0][w]);
			sg.setMname(user[1][w]); //setter에 값 추가 
			this.di.add(sg); //클래스 배열에 추가
			this.user_print(); //출력 파트 실행
			w++;
		}
	}
	
	public void user_print() {
		for(dto_info z: this.di) { //foreach로 데이터 출력
			System.out.println(z.getMid());
			System.out.println(z.getMname());
		}
	}
	
}

class dto_info{ //getter, setter 모듈
	String mid,mname;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
	
}
