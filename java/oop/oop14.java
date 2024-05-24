package oop;

import java.util.Scanner;

public class oop14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop14_box op14=new oop14_box();
		op14.ccc();	
	}
}
//응용편: 사용자 아이디 및 패스워드를 입력하는 코드 작성, 단 sample 데이터로 hong, a1234일 경우 로그인 하셨습니다. 
//패스워드 오류시 아이디 및 패스워드를 확인하세요, 그외 다른아이디: 가입되지 않은 사용자입니다.



class oop14_box{
	public void abc() {
		Scanner sc= new Scanner(System.in);
		//System.out.println("로그인 아이디 입력: ");
		String st=sc.next().intern(); 	//.intern(): 조건문에서 문자열에 대해 연산 기호 사용 시
		if(st=="hong") {
		//if(st.equals("hong")) {		//.equals(): 문자열과 같은지 비교
			//System.out.println("가입된 사용자 입니다.");
		}
		else {
			//System.out.println("미가입된 사용자입니다.");
		}
		sc.close();
	}
	
	public void ccc() {
		Scanner sc= new Scanner(System.in);
		System.out.println("아이디를 입력 하세요: ");
		String id=sc.next().intern();
		System.out.println("패스워드를 입력 하세요: ");
		String pw=sc.next().intern();
		if(id=="hong") {
			if(pw=="a1234") {
				System.out.println("로그인하셨습니다.");
			}
			else {
				System.out.println("아이디 및 패스워드를 확인하세요");
			}
		}
		else {
			System.out.println("가입되지 않은 사용자입니다.");
		}
		sc.close();
	}
}
