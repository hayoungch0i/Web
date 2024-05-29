package exam;

import java.util.ArrayList;

public class exam7 {

	public static void main(String[] args) {
		ArrayList<Integer> evenlist=new ArrayList<Integer>(); 
		ArrayList<Integer> oddlist=new ArrayList<Integer>(); 
		int list[]={60,39,42,7,93,26,38,41,9,12,71};
		int i=0;
		for(i=0;i<list.length;i++) {
			if(list[i]%2==1) {
				oddlist.add(Integer.valueOf(list[i]));
			}
			else{
				evenlist.add(Integer.valueOf(list[i]));
			}
		};
		System.out.println("짝수 클래스 배열: "+evenlist);
		System.out.println("홀수 클래스 배열: "+oddlist);
	}

}
