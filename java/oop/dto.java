package oop;

import java.util.ArrayList;

//getter, setter: 데이터를 주고받는 역할을 하는 class

public class dto {
	String id,name,email,age;
	ArrayList<String> all_arr=new ArrayList<String>();

	public String getId() { //getter: return 메소드
		return id;
	}

	public void setId(String id) { //setter: 필드에 있는 변수를 데이터 삽입
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	//전역 형태의 배열
	public ArrayList<String>make2(){
		this.all_arr.add(getName());
		return this.all_arr;
	}
	
	public ArrayList<String> make(){
		ArrayList<String> arr=new ArrayList<String>();
		arr.add(getName());
		arr.add(getAge());
		arr.add(getEmail());
		arr.add(getId());
		return arr;
	}
	
	ArrayList<String> al=new ArrayList<String>();
	ArrayList<ArrayList<String>>all=new ArrayList<ArrayList<String>>();
	
	public ArrayList<ArrayList<String>>data(){
		//1차 배열 생성
		//최종 2차 배열을 생성 후 return을 이용해서 데이터 반환
		
		return null;
	}
	
}
