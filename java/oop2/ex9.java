package oop2;
/*
45*3+16+5+22*8 해당 계산된 최종값을 외부클래스에 전송합니다.
외부클래스에서 짝수일경우 예외오류
단 홀수일경우 홀수값입니다.라는 결과값을 return으로 보냅니다.
 
 */
public class ex9 {

	public static void main(String[] args) throws Exception {
		Integer num= 45*3+16+6+22*8;
		try {
			ex9_box ex=new ex9_box();
			//String result=ex.calc(num);
			String result=ex.calc2(num);
			System.out.println(result);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class ex9_box{
	public String calc2(Integer a) throws Exception{
		String evenodd=null;
		try {
			if(a%2==0) {
				throw new Exception("예외처리 발생: 해당 결과 짝수값입니다.");
			}
			else {
				evenodd="홀수값입니다.";
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		return evenodd;
	}
	
	
	
	public String calc(Integer a) throws Exception{
		String evenodd=null;
		if(a%2==0) {
			/*
			Exception ep=new Exception("예외처리 발생: 해당 결과 짝수값입니다.");
			throw ep;
			 */
			throw new Exception("예외처리 발생: 해당 결과 짝수값입니다.");
		}
		else {
			evenodd="홀수값입니다.";
		}
		return evenodd;
	}
}
	