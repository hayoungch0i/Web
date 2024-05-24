package exam;

/*
응용문제11
해당 데이터 배열에 대해 데이터값을 분석하는 프로세서를 제작해야 합니다.
해당 데이터는 http://mekeyace.kbsn.or.kr/infodata.txt에 있습니다.
[결과]
SKT 사용자 : 2
KT 사용자 : 3
LGT 사용자 : 1

*/
public class exam11 {

	public static void main(String[] args) {
		String user[][] = {
				{"hong","홍길동","hong@gmail.com","경기도","010-1234-5678","SKT"},
		        {"kang","강감찬","kang@naver.com","인천광역시","010-3344-5566","KT"},
		        {"leesh","이순신","leesh@daum.net","강원도","010-5501-3366","KT"},
		        {"hansb","한석봉","hansb@nate.com","제주도","011-4459-3233","SKT"},
		        {"leesan","이산","korea_lee@gmail.com","서울","010-5050-5531","LGT"},
				{"do_jong","정도전","do_jong04@naver.com","경기도","010-5050-5531","KT"}
		};
		//System.out.println(Arrays.deepToString(user[0]));
		int SKT=0, KT=0, LGT=0;
		for(int i=0;i<user.length;i++) {
			for(int j=0;j<user[0].length;j++) {
				if(user[i][j].equals("SKT")) {
					SKT++;
				}
				else if(user[i][j].equals("KT")) {
					KT++;
				}
				else if(user[i][j].equals("LGT")) {
					LGT++;
				}
			}
		}
		System.out.println("SKT 사용자: "+SKT);
		System.out.println("KT 사용자: "+KT);
		System.out.println("LGT 사용자: "+LGT);
	}

}