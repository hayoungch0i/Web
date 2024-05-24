package oop;

public class method5 {

	public static void main(String[] args) {
		parents pr=new parents();			//부모 클래스를 로드
		pr.zzz();							//부모 클래스 안의 메소드 호출
		parents.child ch= pr.new child();	//부모 클래스 안의 자식 클래스 로드
		ch.abc();							//자식 클래스 안의 메소드 호출
	}	
}

class parents{
	public String a="홍길동";
	
	public void zzz() {
		System.out.println("부모 클래스에 있는 zzz메소드");
	}
	class child2{
		
	}
	class child{
		public int gugu=50;

		public void abc() {
			System.out.println("자식 클래스에 있는 abc메소드\n"+parents.this.a);
			
		}
		
	}
}