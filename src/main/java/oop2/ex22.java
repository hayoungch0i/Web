package oop2;

import java.util.ArrayList;

public class ex22 {
	public static void main(String[] args) {
		String what="상품명";
		ex22_box eb=new ex22_box(what);
		System.out.printf("[%s]\n",what);
		System.out.println(eb.al.toString());
	}
}

class ex22_box extends ex_ab{
	ArrayList<String> al=null;
	
	ex22_box(String menu){
		this.makeMenuList(menu);
		super.sc.close();
	}
	
	private void makeMenuList(String menu){
		al=new ArrayList<String>();
		al=(ArrayList<String>) super.makeList(menu);
	}
	
}
