package oop;
 //외부 클래스 변수값 가져요기 및 변경(public. private)
public class method2 {
	static String user=null; //static: 메모리에 장소만 설정
	//main 메소드는 기본적으로 메모리 영역을 사용
	public static void main(String[] args) {
		//method2 mb=new method2();
		//mb.user="홍길동";
		user="홍길동";	//메모리에 등록된 전역변수(this 사용불가)
		method2_box mb2=new method2_box();
		mb2.aaa=500; //외부 클래스 필드에 있는 전역변수 값을 변경
		//mb2.bbb=25000;
		mb2.abc();
		//mb2.zzz(); //private로 생성된 메소드는 외부에서 호출하지못함
	}
}

class method2_box{
	
	public int aaa=100; //일반 전역 변수
	private int bbb=1000; //private: 해당 class에서만 사용 및 변경 가능
	private void zzz() {
		System.out.println("내부 보안 메소드");
	}
	
	public void abc(){	
		new method2();
		String aaa=method2.user; //public class에 있는 메모리 영역의 변수값을 일반 변수에 등록
		System.out.println(aaa);
		System.out.println(this.aaa);
		this.bbb=50000;
		System.out.println(this.bbb); //해당 class 내부에서는 값 변경 가능
		zzz();
	}
}