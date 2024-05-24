package oop2;

import java.util.Arrays;

public class ex17 {

	public static void main(String[] args) {
		String stringTypeNumbers[]= {"1000","2000","","400","","600"};
		parsing ps=new parsing();
		System.out.println(Arrays.toString(ps.numbers(stringTypeNumbers)));
	}
}

class parsing{
	
	public int[] numbers(String strings[]) {
		int intNumbers[]=new int[strings.length];
		
		for(int i=0;i<strings.length;i++) {
			intNumbers[i]=strToInt(strings[i]);
		}
		
		return intNumbers;
	}
	
	public int strToInt(String str) throws NumberFormatException {
			
		int intTypeNumbers;	
		
		try {
			intTypeNumbers=Integer.parseInt(str);	
		} 
		catch (NumberFormatException e) {
			return 0;
		}
		
		return intTypeNumbers;
	}
	
}
