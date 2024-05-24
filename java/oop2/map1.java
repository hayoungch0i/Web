package oop2;

import java.util.HashMap;
import java.util.Map;
//배열:(데이터배열 / 키가 존재하는 배열)
//ArrayList, LinkedList:class , Map: interface
//Map 클래스 배열(key배열): key-data 값0
//Map(HashMap, HashTable, TreeMap) => 모두 클래스
//HashMap -> ArrayList -> LinkedList
public class map1 {

	public static void main(String[] args) {
		Map<String, String> map1=new HashMap<String, String>();
		map1.put("product", "모니터");
		map1.put("product","키보드"); //중복된 키를 사용시 해당 값 변경
		map1.put("product2","마우스");
		System.out.println(map1); 
		System.out.println(map1.get("product")); //등록된 키를 이용하여 데이터를 출력
		System.out.println(map1.keySet()); //등록된 키 현황
		
	}

}
