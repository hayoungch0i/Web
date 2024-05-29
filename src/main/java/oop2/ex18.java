package oop2;

import java.util.Scanner;

public class ex18 {
/*
1.한글 사용시 아이디는 "영문자+숫자만 사용가능합니다." 출력
2.아무것도 입력하지 않을경우 "아이디를 입력하세요" 출력
*/
	public static void main(String[] args) {
	makeID id=new makeID();
	id.isCorrectID();
	
	}

}

class makeID{
	Scanner sc= new Scanner(System.in);
	
	public void isCorrectID(){
		System.out.println("아이디를 입력하세요: ");
		String user=sc.nextLine().intern();
		if (user.matches(".*[ㄱ-ㅎ|ㅏ-ㅣ|가-힇].*")) { //한글 입력시
			System.out.println("아이디에는 영문자와 숫자만 입력할 수 있습니다.");
		}
		else if(user.equals(null) || user.replaceAll(" ", "").equals("")) { //입력안했거나 공백문자만 입력시
			System.out.println("아이디를 입력하셔야 합니다.");
			this.isCorrectID();
		}
		System.out.println("id:"+user);
	}
	
	
}
