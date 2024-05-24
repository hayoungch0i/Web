package oop;
//자료형2 (자료형 변환)
public class oop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ck=true;
		System.out.println(ck);
	
		//파일용량 체크시
		byte money=127;
		System.out.println(money);
		
		//int: 약 21억, long: 약 9경, short: 약 3만
		//long a=213456789151L;
		//short b=32345;
		
		char word='홍';
		String name=String.valueOf(word); //String.valueOf(변수명): char형을 String형으로 변환
		System.out.println(name.getClass()); //변수명.getClass(): 변수의 클래스 타입 형태
		
		String id="hong";
		char word2=id.charAt(1);	//변수명.charAt(배열번호)=String형 변수의 배열번호번째 문자
		System.out.println(word2);
		
		//Integer ->short, int, long, byte(Integer는 int 범위의 수)
		//int n=100;
		//Integer z=n;
		
		//Integer n2=1000;
		//int z2=n2;
		
		//문자형 클래스를 숫자형 클래스 또는 숫자형 자료형으로 변환
		String total="50000";
		String etc="19850000";
		int all=Integer.parseInt(total)+Integer.valueOf(etc);
		System.out.println(all);
		//Integer.parseInt(변수명): 기본 자료형 int, 문자 데이터를 직접적으로 변환 
		//Integer.valueOf(변수명): 기본 자료형 int, 문자 데이터를 검토 후 다른 형으로 변환
		
		float money2=38.72f;
		String sm=String.valueOf(money2);
		System.out.println(sm);
	}

}
