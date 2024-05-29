package oop2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//단어 검토 및 변경(정규식 코드)
public class regular {

	public static void main(String[] args) {
		String word="1,2,3,4,5,6,7";
		String arr[]=word.split(",");
		System.out.println(Arrays.toString(arr));
		
		
		//replace: 문자변경("찾을단어","변경단어");
		String address="서울특별시 마포구 마포동";
		String result1=address.replace("마포","mapo");
		System.out.println(result1);
		
		//replaceall(정규식): 배열 형태의 단어 범위를 설정하여, 특정 단어로 모두 변경 
		String code="010abcd12z4";
		String result2=code.replaceAll("[a-zA-Z]", "*");
		System.out.println(result2);

		
		//한글은 자음, 모음, 받침 모두 필터링을 배열 범위에 적용하여 단어를 변경시킴
		String id="hong길동";
		String idcheck=id.replaceAll("[ㄱ-ㅎ ㅏ-ㅣ 가-힇]", ""); //"":해당문자 삭제
		System.out.println(idcheck);
		
		//^: 부정의 의미, 해당 배열 외의 단어를 의미
		String name="hong길東*";
		String namecheck=name.replaceAll("[^a-zA-Z0-9]", ""); 
		System.out.println(namecheck);
	
		//Pattern, Matcher: Java 라이브러리를 이용한 정규식 코드로 사용하는 단어 분리
		String today="2024-05-14 14:14:10";
		Pattern p=Pattern.compile("[0-9]+"); //해당 문자 외에 다른 문자가 있을 경우 +를 이용하여 그룹화함
		Matcher mc=p.matcher(today);
		while(mc.find()) {
			System.out.println(mc.group());
		}
		
		//indexof 업그래이드버전 라이브러리 contains:true(단어가 있음).false(단어가 없음)
		String msg="html css javascript java ajac mysql";
		boolean msgck=msg.contains("java");
		System.out.println(msgck);
		
	}
}
