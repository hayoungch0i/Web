package oop2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		String member[][] = {
				{"홍길동","SKT","45","hong@nate.com","01012234556"},
				{"이순신","LGT","55","lee@gmail.com","01022309544"},
				{"강감찬","KT","25","kang@gmail.com","01036601688"}
		};
		Scanner sc= new Scanner(System.in);
		ArrayList<ArrayList<String>> AL=new ArrayList<ArrayList<String>>();
		
		for(int i=0;i<member.length;i++) {
			ArrayList<String> sLL=new ArrayList<String>(Arrays.asList(member[i]));
			AL.add(sLL);
			//System.out.println(sLL);
		}
		
		System.out.println("검색할 고객명을 입력하세요: ");
		String name=sc.nextLine();
		String tel=null;
		boolean check=false;
		for(int i=0;i<AL.size();i++) {
			if(AL.get(i).get(0).equals(name)) {
				System.out.println("변경할 연락처를 입력하세요: ");
				tel=sc.nextLine();
				AL.get(i).set(4, tel);
				System.out.println("정상적으로 변경이 완료 되었습니다.");
				System.out.println(AL.get(i).get(4));
				check=true;
				break;
			}
		}
		if(!check) {
			System.out.println("해당 고객은 검색 되지 않습니다.");
		}
		sc.close();
	}

}
