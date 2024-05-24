package oop;
//클래스와 메소드의 형태
public class oop3 {
	//public class는 한 파일당 한번만 사용가능
	//public class 이름과 파일명은 동일함
	//main()은 public class에서만 사용하는 실행 메소드
	public static void main(String[] args) {
		box b=new box();	//클래스(new box()), 객체(box), 인스턴스(b)
		b.abc(); 	//해당 클래스의 abc()메소드 호출하여 실행
		box2 b2=new box2();
		b2.kkk();		
	}
}

class box{
	public void abc() {
	System.out.println("외부 클래스 및 메소드 데이터 호출");	
	}
}

class box2{
	public void kkk() {
		System.out.println("kkk 메소드 호출!");
	}
}