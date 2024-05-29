package oop;
//외부 클래스를 이용한 조건문(if)
public class oop6 {
	public static void main(String[] args) {
		// 사용자 정보
		String user="hong";
		String pass="a1234";
		oop6_cal op6=new oop6_cal();
		op6.abc1(user, pass);
		//char auto_login='Y';
		String auto_login ="Y";
		oop6_ck op6_ck=new oop6_ck();
		op6_ck.login_ck(auto_login);
	}
}

class oop6_ck{
	public void login_ck(String check2){
		if(check2.equals("Y")){//char 로 인식(==연산시기호)
			System.out.println("자동 로그인 활성화");
		}
		else if(!check2.equals("Y")){
			System.out.println("자동 로그인 비활성화");
			
		}
	}//숫자는 무조건 연산기호 (==, !=,>=, <=, <, >)
}


class oop6_cal{
	public void abc1(String mid, String mpw) {
		if(mid==null) {
			System.out.println("아이디가 허용 되지않음");	
		}
		else {
			
		}
	}
	public void abc(String mid, String mpw){
		if(mid==null || mid=="") {
			System.out.println("아이디가 확인되지않음");
		} else {
			if(mid=="hong" && mpw=="a1234") {
				System.out.println("로그인 되셨습니다.");
			}
			else {
				System.out.println("패스워드가 틀립니다.");
			}
		}
	}
}