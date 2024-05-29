package oop2;

public class oop_class2 {

	public static void main(String[] args) {
		oc1_box ob= new oc1_box();
		ob.age=65; //protected 선언 변수
		ob.abc();
		oc2_box ob2=new oc2_box();
		ob2.aaa();
		String result=ob2.bbb();
		System.out.println(result);
		ob2.ccc();
	}

}

//추상 클래스 생성
//코드 진행중 해당 추상 메소드의 이름 변경시 상속받은 모든 클래스에 문제 발생
abstract class ab_box1{
	public void aaa() {}; //추상 메소드
	public String bbb() {return null;}; //추상 메소드
	public void ccc1() {}; //해당 추상 메소드는 사용하지 않음(오버라이딩 안함)
}

//일반 클래스
class oc2_box extends ab_box1{ //extends: 상속 클래스
	@Override //@Override: 상속된 메소드를 호출
	public void aaa() {		
		System.out.println("aaa");
		super.aaa();
	}
	@Override
	public String bbb() {
		String user="강감찬";
		return user;
	}
	//Overloading: 상속 받는 메소드 외에 추가로 메소드를 생성함
	public void ccc() {
		System.out.println("ccc 오버로딩 메소드 호출");
	}
}