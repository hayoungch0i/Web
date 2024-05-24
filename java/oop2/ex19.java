package oop2;

public class ex19 extends ex19_box{

	public static void main(String[] args) {
		new ex19_member(100).abc(); 
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb(int a) {
		// TODO Auto-generated method stub
		
	}

	
}

//Override: 추상 클래스에서 선언한 메소드 
//Overload: 추상 클래스 외에 생성하여 사용하는 메소드
//abstract class를 사용하는 이유: 은닉화, 코드의 통일성과 재활용성, 라이브러리 로드의 간편화
/*
 1. 메소드: default, public, protected는 사용가능
 2. 필드 변수 선언: public. protected는 사용 가능
 	단, abstract 안에서 private로 처리하는 변수일 경우 사용가능(오버라이드 메소드에서 사용 불가능)
 3. abstract class의 즉시 실행 메소드는 abstract 사용 불가능  
 4. 즉시 실행 메소드 호출시 abstract 메소드가 아닌 실제 클래스 즉시 실행 메소드를 호출
*/

abstract class ex19_box{
	private String data="";
	
	public ex19_box() { System.out.println("즉시 실행"); };
	
	public void abc() {
		this.data="홍길동";
		System.out.println(this.data);
	};
	
	abstract public void bbb(); //필수로 오버라이드 해야하는 메소드
	abstract public void bbb(int a);
	
}

class ex19_member extends ex19_box {

	public ex19_member(int a) {
		super(); //상속 받는 내용을 받아서 처리함
		System.out.println(a);
	};
	
	@Override
	public void bbb() {	}

	@Override
	public void bbb(int a) { }
	
}
