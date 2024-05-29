package oop2;

/*
 1. public 클래스 형태로 만들지 않음
 2. default 클래스를 활용
 3. 오버라이드를 활용해야함
 4. 필드에 변수 사용시 상수가 됨(final이랑 같음)
 5. interface 안에 abstract 사용 가능
 6. interface 여러개를 한꺼번에 로드 할수도 있음
 7. interface에는 즉시 실행 메소드가 없음
 8. interface는 공용 작업이므로 public 외에는 사용하지 않음
 9. 조건문, 반복문 등이 없음
 */

public interface ex_interface extends user {
	public void box1(); //interface 메소드
	public String box2();
	public abstract void box3();
	default void zzz() {
		System.out.println("test");
	}
}

//기존에 사용한 interface를 보강 및 유지보수 위해 사용
interface re{
	public String getdata();
}

interface user{
	public String userlevel();
	
}