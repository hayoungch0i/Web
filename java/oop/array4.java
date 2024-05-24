package oop;

import java.util.Arrays;

//2차 원시배열
public class array4 {

	public static void main(String[] args) {
		String user[][]= {
				{"홍길동","이순신", "유관순"},
				{"100","90","80"}
		};
		int gp=user.length;
		int ea=user[0].length;
		for(int i=0;i<ea;i++) {
			for(int j=0;j<gp;j++) {
				System.out.println(user[j][i]);
			}
		}	
	int adata[][]=new int[2][2];
	adata[0][0]=50;
	adata[0][1]=100;
	adata[1][0]=200;
	adata[1][1]=500;
	System.out.println(Arrays.deepToString(adata));
	//Arrays.deepToString:다차원 배열의 값을 출력할 때 사용
	//Arrays.toString: 일차원 배열의 값을 출력할 때 사용
	}

}
