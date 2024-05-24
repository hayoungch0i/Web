package oop;
//다차원배열
public class array8 {

	public static void main(String[] args) {
		String data[][][]= {
				{
					{"홍길동", "강감찬", "유관순", "이순신", "이산"},
					{"일반", "실버", "골드", "실버", "일반"}
				},
				{
					{"1500", "2500", "1000", "2200", "3000"}
				}
		};
		//해당 배열을 기준으로 다음 결과처럼 출력되도록 코드 작성
		/*
		 * 결과
		 * 고객명
		 * 회원등급
		 * 포인트
		 * */
		for(int i=0;i<data[0][0].length;i++) { 
			//System.out.println("결과");
			//System.out.printf(" 이름: %s\n",data[0][0][i]);
			//System.out.printf(" 회원등급: %s\n",data[0][1][i]);
			//System.out.printf(" 포인트: %s\n",data[1][0][i]);
			//System.out.println("------------------------------------");
		}
		
		/* 응용편
		 * 실버 회원 정보 리스트만 데이터 추출하여 출력
		 * 출력방식: 
		 * [결과]
		 * 강감찬
		 * 실버
		 * 이순신
		 * 실버
		 * */
		for(int i=0; i<data[0][0].length;i++) {
			for(int j=0;j<data[0].length;j++) {
				if(data[0][1][i]=="실버") {
					System.out.println(data[0][j][i]);
				}	
			}
			if(data[0][1][i]=="실버") {
				System.out.println(data[1][0][i]);
			}
		}
	
	
	}
}
