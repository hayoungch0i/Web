package oop2;

import java.util.ArrayList;

public class ex14 {

	public static void main(String[] args) {
		String data[][] = {
				{"대한민국","일본","중국","베트남","태국"},
				{"40","35","70","55","32"}
		};
		ArrayList<String> AL=new ArrayList<String>();
		ex14_box ex=new ex14_box();
		AL=ex.Parsing(data);
		System.out.println(AL);
	}
}

class ex14_box{
	
	ArrayList<String> L=null;
	
	public ArrayList<String> Parsing(String list[][]) {
		L=new ArrayList<String>();
		for(int i=0; i<list[0].length;i++) {
			list[1][i]="("+list[1][i]+")";
			L.add(list[0][i]+list[1][i]);
		}
		return L;
	}
	
}
