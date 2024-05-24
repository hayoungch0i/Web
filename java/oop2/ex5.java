package oop2;

//메소드 형태의 오류처리 선언 및 호출 방법
public class ex5 {

	public static void main(String[] args) {
		ex5_box ex5=new ex5_box(); 
		try {
			ex5.abc(5000,"500k");			//해당 메소드가 throws이므로 무조건 try~catch 이용
		} 
		catch (Exception e) {
			System.out.println(e);			//try로 재실행하여 데이터를 다시 보냅니다.(throws이므로 무조건 사용)
			try {
				ex5.abc(5000, "500 0"); 
			} 
			catch (Exception e2) {
				System.out.println(e2);
				System.exit(0);
			}
		}
	}
}

class ex5_box{
	//throws: 해당 메소드 실행 시 예외처리 구분자를 필수로 적용시키는 형태
	public void abc(int no, String z) throws Exception{ 
		int sum=no+Integer.parseInt(z);
		System.out.println(sum);
	}
}
