package exam;

import java.util.ArrayList;

public class exam4 {
	public static void main(String[] args) {
		int i=1;
		ArrayList<Integer> al=new ArrayList<Integer>();
		while(i<=10) { 
			Integer num=Integer.valueOf((int)Math.ceil(Math.random()*20));
			al.add(num);
			i++;
		}
		int even=0;
		for(Integer a:al) {
			if(a%2==0) {
				even++;
			}
		}
		System.out.println(al);
		System.out.println("짝수: "+even+"개");
	
	}
	
}
