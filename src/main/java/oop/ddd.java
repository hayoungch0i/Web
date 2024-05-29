package oop;

import java.util.ArrayList;

public class ddd {

	public static void main(String[] args) {
		
		String member[][] = {
				{"홍길동","SKT","45","hong@nate.com","01012234556"},
				{"이순신","LGT","55","lee@gmail.com","01022309544"},
				{"강감찬","KT","25","kang@gmail.com","01036601688"}
		};
		dd result=new dd();
		result.abc(member);
	}
	
}

class dd{
	
	public ArrayList<ArrayList<String>> abc(String data[][]){
		
		ArrayList<ArrayList<String>>alldata= new ArrayList<ArrayList<String>>();
		for(int i=0;i<data[0].length;i++) {
			ArrayList<String> idata= new ArrayList<String>();
			
			for(int j=0;j<data.length;j++) {
				idata.add(data[j][i]);
			}
			
			alldata.add(idata);
		}
		System.out.println(alldata);
		
		return alldata;
	}
	
}
