package oop2;

import java.util.Hashtable;

public class map3 {
	//HashTable: 데이터 병렬처리 및 멀티 Thread
	//HashMap: 단일 처리 및 single Thread
	public static void main(String[] args) {
		Hashtable<Integer, String> all=new Hashtable<Integer, String>();
		all.put(0, "HTML");
		all.put(1, "CSS");
		all.put(2, "JSS");
		all.put(3, "JS");
		//all.put(4, null); //HashTable은 null을 사용하지 못함
		System.out.println(all);
		System.out.println(all.get(0));
		System.out.println(all.keySet());
		int w=0;
		while(w<all.keySet().size()) {//키 값을 숫자로 설정하여, 모든 데이터 출력
			System.out.println(all.get(w));
			w++;
		}
	
	}

}
