package oop2;
//외부 클래스 throws 메소드 응용편
public class ex6 {

	public static void main(String[] args) {
		ex6_box ex6=new ex6_box();
		try { //throws 메소드 이용
			ex6.abc("400");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}

class ex6_box{
	public void abc(String a) throws Exception, NumberFormatException{
		//코드 에러 발생
		int k=Integer.valueOf(a)+Integer.valueOf("200a");
		
		System.out.println(k);
		Exception ep=new Exception(); //Exception 라이브러리
		throw ep; 
		//throw: 예외처리가 발생되면, 상대방에게 에러 코드를 전송하며, 재전송을 요청.
		//코드의 가장 아래에 기입하여 적용, throw = return과 비슷한 성격
		//예외처리 결과에 대한 값을 호출한 메소드로 다시 return 시킴
	
	}
}