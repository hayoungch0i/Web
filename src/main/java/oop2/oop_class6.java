package oop2;

public class oop_class6 {

	public static void main(String[] args) {
		oc6_box ob=new oc6_box(50);
		ob.abc();
	}

}
class oc6_box extends ab3{
	public oc6_box(int a) { // 클래스의 즉시실행 메소드- abstract 클래스의 즉시 실행 메소드와 인자를 맞춰주어야함
		super(a);			//super: 외부 클래스에서 로드하는 내용을 그대로 반영
							//(abstract 내용: this.number=a;)
	}
	
	@Override
	public String product() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer basket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		super.pay();
	}

	@Override
	public String today() {
		// TODO Auto-generated method stub
		return super.today();
	}

	//abstract에 있는 return 메소드 호출 및 출력
	public void abc() {
		System.out.println(this.number);
		String to=this.today(); 
		System.out.println(to);
	}
	
}
