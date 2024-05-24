package oop2;
//inter1, inter2 연계
public class oop_class7 {

	public static void main(String[] args) {
		op7_box op= new op7_box();
		op.point();
	}

}

//interface를 직접 클래스 파일에 사용하지는 못함 (로드를 활용해서 사용해야함)
//implements: interface 로드할 때 사용함
//interface: 한개 이상의 .java 파일을 로드 할 수 있음
class op7_box implements inter1, inter2_2{
	@Override
	public void point() {
		//System.out.println(this.p);
	}
	
	@Override				//@Override는 추상 클래스와 동일하게 사용함
	public String names() {	//default형 메소드는 사용 유/무로 나뉘어짐
		return null;
	}
	
	@Override 
	public void setbox(String id) {
		inter1.super.setbox(id);
	}

	@Override
	public Integer age() {
		return null;
	}

	@Override
	public void money() {
		
	}
	
	
	
}