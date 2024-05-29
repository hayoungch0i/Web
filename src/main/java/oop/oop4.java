package oop;
//메소드 인자값 호출 및 전달
public class oop4 {
	public static void main(String[] args) {

	}	
}

class oop4_box{ 
	//외부 class는 동일한 package에 있을 경우 같은 이름을 사용하지 못함
	//해당 class 안에서 method는 동일한 이름을 사용할 수 있음 단, 인자값에 대한 자료형 및 인자 개수가 다를 경우에 가능
	public void abc() {
		System.out.println("테스트");
	}	
	public void abc(String a) {
		System.out.println("테스트2");
	}	
	public void abc(int a) {
		System.out.println("테스트2");
	}
}