package oop2;

//추상 클래스 응용편 - ex_ab.java
public class ex20 {

	public static void main(String[] args) {
		 ex20_box tn=new ex20_box();
		 System.out.println(tn.date);
	}
}

class ex20_box extends ex_ab{
	String date="";
	
	ex20_box(){
		this.date=super.today("YYYY-MM-dd HH:mm:ss");
	}
	
}