package oop;

public class oop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop5_box op5= new oop5_box();
		String mid="hong";
		String mpass="a1234";
		op5.abc(mid,mpass);
		//public class에서 
		//oop5 mains = new oop5();
		//mains.zzz();
		new oop5().zzz();
	}
		
		public void zzz() {// 메인 글래스에 추가 메소드
		System.out.println("메인 클래스 추가 메소드");
		
		//메인 메소드 외에 public 클래스에 추가 메소드는 this를ㄹ 
	}
		public void kkk() {// 메인 글래스에 추가 메소드
			System.out.println("kkk메소드 실행");
	}
}

class oop5_box{
	//main에서 받은 데이터를 받는 메소드
	//받는 메소드의 인자값 갯수 및 자료형 일치
	public void abc(String id, String pw) {
		System.out.println(id);
		System.out.println(pw);	
		oop5_box op5= new oop5_box();
		op5.login(id,pw);
	}
	
	public void login(String id, String ps) { //메인에서 보내온 데이터를 받는 메소드
		System.out.println(id);
		System.out.println(ps);
	}
	
	public void oop5(String id, String ps) { //메인에서 보내온 데이터를 받는 메소드
		System.out.println(id);
		System.out.println(ps);
		System.out.println(id);
		System.out.println(ps);
	}
		
		
}
