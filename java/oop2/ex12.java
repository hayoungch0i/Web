package oop2;

import java.util.Arrays;
import java.util.LinkedList;

//ArrayList(순서를 유지하는 배열형태),LinkedList(순방향,역방향 검색) => List(부모 라이브러리)
public class ex12 {

	public static void main(String[] args) {
		Integer numList[]= {1,3,6,9,10};
		LinkedList<Integer> LL=new LinkedList<Integer>(Arrays.asList(numList));
		int i=0;
		for(Integer num:LL) {
			if(num%2==1) {
				LL.set(i, num+1);
			}
			i++;
		}
		System.out.println(LL);
	}

}
