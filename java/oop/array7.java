package oop;

import java.util.Arrays;

//1차배열->2차배열
public class array7 {

	public static void main(String[] args) {
		String area[]= {"서울","경기도","인천"};
		String people[]= {"12000","6500","3300"};
		String total[][]=new String[area.length][2];
		int f;
		for(f=0;f<area.length;f++) {
			total[f][0]=area[f];
			total[f][1]=people[f];
		}
		//System.out.println(Arrays.deepToString(total));
		
		
		//1차 배열->2차 배열 변환// {90,22,16,13,8,42,49,37,1,9}->짝수5,홀수5개
		int num[]={90,22,16,13,8,42,49,37,1,9};
		int number[][]=new int[2][5];
		int odd_count=0;
		int even_count=0;
		for(int i=0;i<10;i++) {
			if(num[i]%2==0) {
				number[0][even_count]=num[i];
				even_count++;
			}
			else if(num[i]%2==1) {
				number[1][odd_count]=num[i];
				odd_count++;
			}
		}
		System.out.println(Arrays.deepToString(number));
		
	}

}
