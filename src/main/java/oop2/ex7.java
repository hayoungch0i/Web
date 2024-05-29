package oop2;
//throws와 throw 모두 사용
public class ex7 {

	public static void main(String[] args) {
		try {
			ex7_box ex=new ex7_box();	
			ex.abc("ok");
		} 
		catch (Exception e) {
			System.out.println(e.getMessage()); //throws메소드에 문제사항 출력
			//상대방에서 처리된 사항을 확인하는
			if(e.getMessage()==null) {
				System.out.println("정상적으로 데이터를 처리 하였습니다.");
			}
			else{
				System.out.println("코드 오류가 발생하였습니다.");
			}
		}
	}

}

class ex7_box{
	Exception ep=null;
	public void abc(String a) throws Exception {
		try {
			if(a=="ok") {
				String key= "123a";
				int keycode=Integer.valueOf(key);
				System.out.println(keycode);
			}
			else if(a=="no"){
				System.out.println("정상적 처리 완료");
			}	
		} 
		catch (Exception e) {
			e.printStackTrace();
			this.ep=new Exception();
			throw this.ep;
		}
		
		
		
	}
	
	
}