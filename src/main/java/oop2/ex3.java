package oop2;

public class ex3 {

	public static void main(String[] args) {
		String a="500a0";
		int b=0;
		try {
			b=b+Integer.parseInt(a);
			
		}
		catch(NumberFormatException nfe) { //해당 예외처리 발생시 
			a=a.replaceAll("[a-z A-Z]",""); //해당 문법으로 문제처리를 한 후 결과값을 정상적으로 진행시킴
			b=b+Integer.parseInt(a);
		}
		catch (Exception e) {
			e.printStackTrace(); //오류 발생시 해당 라인을 확인하는 목적
			System.out.println(e);
		}
		System.out.println(b);
	}

}
