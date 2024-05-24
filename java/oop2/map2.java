package oop2;

import java.util.ArrayList;
import java.util.HashMap;

// key 배열 만들기(HashMap+ArrayList)
public class map2 {

	public static void main(String[] args) {
		
		ArrayList<String> one=new ArrayList<String>();
		HashMap<String, ArrayList<String>> data=new HashMap<String, ArrayList<String>>();
		
		one.add("홍길동");
		one.add("강감찬");
		one.add("이순신");
		one.add("유관순");
		
		data.put("member", one); //1차 배열 클래스를 대표키를 생성하여 입력시킴.
		System.out.println(data);
		
		//foreach를 이용하여 대표키를 설정한 후 해당 대표키에 적용된 데이터를 출력
		for(String mb:data.get("member")) { 
			System.out.println(mb);
		}
		
		//data.remove("member"); //대표키 삭제시 해당 그룹의 데이터는 모두 삭제
		
		System.out.println(data.size());//size(): 키가 몇개 잇는지 확인
		System.out.println(data.get("member").size());//해당 대표키의 그룹안에 멤버가 몇개 있는지 확인
	}

}
