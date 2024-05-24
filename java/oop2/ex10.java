package oop2;

import java.util.ArrayList;

//배열을 이용한 예외처리 코드문법
public class ex10 {

	public static void main(String[] args) {
		Object data[]={"유재석",1000,"실버회원",0.5,true};
		System.out.println(data[4].getClass().getName()); //배열값에 대한 자료형 확인
		ArrayList<Integer> user=new ArrayList<Integer>();
		try {
			int w=0;
			//user.add(String.valueOf(data[w]));
			while(data[w].getClass().getName()=="Integer") { //object 원시배열시 숫자 클래스 배열로 입력할 경우 자료형 변환 후에 함
				//user.add(Integer.valueOf((int)data[w]));
				String ck=data[w].getClass().getSimpleName();
				if(ck.equals("Integer")) {
					user.add(Integer.valueOf((int)data[w]));
				}
			}
			w++;
			System.out.println(user);			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
