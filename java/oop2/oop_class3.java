package oop2;

import java.util.ArrayList;

public class oop_class3 {

	public static void main(String[] args) {
		new oc3_box().ab_method1("유관순");

	}

}

class oc3_box extends ab1{
	@Override
	public void ab_method1(String uid) {
		this.userid=uid;
		System.out.println(this.userid);
		System.out.println("사용자 이름을 입력하세요:");
		String username=this.sc.nextLine();
		System.out.println(username);
		this.all=new ArrayList<String>();
		this.all.add("HTML");
		this.all.add("CSS");
		this.all.add("JAVA");
		System.out.println(this.all);
		this.sc.close();
		
	}
	
	
}