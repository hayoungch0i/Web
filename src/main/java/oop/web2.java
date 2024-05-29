package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class web2 extends dto {

	public static void main(String[] args) {
		final String a[][]= {
				{"김남주","윤보미","정은지"},
				{"21","19","24"}
		};
		ArrayList<String>all=new ArrayList<String>(Arrays.asList(a[1]));
		Collections.sort(all);
		
		ArrayList<ArrayList<String>>all2=new ArrayList<ArrayList<String>>();
		int ww=0;
		while(ww<a.length) {
			int w=0;
			ArrayList<String>mb=new ArrayList<String>(a[0].length);
			
			while(w<a[0].length) {
				String node=all.get(w);
				int ck=Arrays.asList(a[1]).indexOf(node);
				mb.add(a[ww][ck]);
					
				w++;
			}
			all2.add(mb);
			ww++;
		}
		System.out.println(all2);
	}

}
