package oop;

import java.util.ArrayList;

public class web4 {

	public static void main(String[] args) {
		dto dt=new dto();
		String user[][]= {
				{"홍길동","25","hong@nate.com","hong"},
				{"이순신","33","lee@naver.com","lee"}
		};
		ArrayList<ArrayList<String>>data=new ArrayList<ArrayList<String>>();
		int w=0;
		while(w<user[0].length) {
			int ww=0;
			ArrayList<String> test=new ArrayList<String>();
			while(ww<user.length) {
				dt.setName(user[ww][w]); //해당 메소드 무조건 사용자명만 입력하는 사항은 없음. 단, 자료형이 틀릴경우는 if, switch로 구분하여 메소드의 인자값을 보냄
				test=dt.make2(); //1차 배열에서 1차 배열로 이관하므로 = 사용
				ww++;
				//System.out.println(test);
			}	
			data.add(test);
			//dt.all_arr=new ArrayList<String>(); //해당 class에 전역 클래스배열 초기화
			System.out.println(data);
			w++;
		}
	}
}
