package oop2;
//String, StringBuilder, StringBuffer
public class string_etc {

	public static void main(String[] args) {
		//같은 자료형 또는 자료형 클래스여도 new가 붙은 상황이면 
		//인스턴스 영역(메모리)으로 변경되므로 비교되는 상황이 달라질 수 있음
		
		
		String a="a1234";
		String b="a1234";
		String c=new String("a1234");
		String d=new String("a1234");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==c);
		System.out.println(a.equals(c));
		System.out.println(c==d);
		System.out.println(c.equals(d)); 
	
		
		//StringBuffer, StringBuilder: 둘다 멀티 쓰레드를 이용함, 
		StringBuffer sb=new StringBuffer(); //StringBuffer: 멀티 쓰레드일때 빠름, 단점: 단일 쓰레드일때 매우 느림(String보다 느림, 안정성이 매우 좋음)
		sb.append("홍길동");
		sb.append("님 환영합니다.");
		System.out.println(sb);
		
		StringBuilder sb2=new StringBuilder(); //StringBuilder: 단일 쓰레드가 월등히 빠름, 단점-로스가 중간에 발생할 수 있음(안정성 떨어짐)
		sb2.append("이순신");
		sb2.append("포인트는 5000");
		System.out.println(sb2);
	}

}
