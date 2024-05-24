package oop2;

import java.util.ArrayList;

public class ex21 {

	public static void main(String[] args) {
		new ex21_box();
	}

}

class ex21_box extends ex_ab{
	final String a[]= {"유재석", "신동엽", "정상훈", "아이유", "한지민"};
	
	ex21_box(){ 
		this.total_transfer(a);
		super.sc.close();
	}
	
	protected void total_transfer(String names[]) {
		int totalSalary=0;
		String eachData[]= new String[2];
		ArrayList<String[]> salaryData=new ArrayList<String[]>();
		
		for (String eachName : names) {
			int eachSalary=this.each_transfer(eachName);
			eachData[0]=eachName;
			eachData[1]=Integer.toString(eachSalary);
			salaryData.add(eachData);
			totalSalary+=eachSalary;
		}		
		
		System.out.println("총 이체 금액: "+totalSalary);
	}
	
	 protected int each_transfer(String name) {
		return super.each_transfer(name);
	}
}
