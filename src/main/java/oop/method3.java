package oop;
// 메소드 정의( void, 자료형, return)
public class method3 {
	public static void main(String[] args) {
		method3_box mb=new method3_box();
		mb.aaa();
		//자료형 메소드에 인자값을 보낸 후 결과값을 변수로 받음
		String result=mb.bbb("hong");
		System.out.println(result);
		
		int sum=mb.ccc(10,5);
		System.out.println(sum);
	}

}
class method3_box{
	
	public void aaa(){ //void: 메소드 호출 시 연산, 결과, 실행 등을 담당
		
	}
	
	public String bbb(String id) { //문자 자료형 메소드
		String email= "hong@nate.com";
		return email;
	}
	
	public int ccc(int a, int b) { //숫자 자료형 메소드
		int c=a*b;
		return c;
	}
	
	public static void ddd() { //메모리 영역에 등록되는 메소드 
		
	}
	
	public static String eee() { //메모리 영역에 등록된 return 자료형 메소드
		return null;
	}
	
}