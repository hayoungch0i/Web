package oop;
//사용자 데이터를 이용하여 배열값 출력하기
public class array6 {
 final static String user[][]={
		 {"김민지","서은진","김선숙","명동건","강휘"},
		 {"A","B", "AB", "O", "B"},
		 {"SKT", "KT","LGT","LGT","KT"}
 };
 
	public static void main(String[] args) {
		int i;
		for (i=0;i<user[0].length;i++) {
			if(user[2][i]=="KT") {
				System.out.println(user[0][i]);
			}
		}
	}

}
