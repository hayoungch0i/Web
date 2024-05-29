package oop;

import java.util.ArrayList;
import java.util.Collections;

//응용편  [100,55,67,90,13,7], [9,16,22,31]
//다음 배열 데이터를 이용하여 결과와 동일하게 출력되도록 코드 작성
public class array13 {

	public static void main(String[] args) {
		Integer data1[]= {100,55,67,90,13,7};
		Integer data2[]= {9,16,22,31};
		ArrayList<Integer> data=new ArrayList<Integer>();
		for	(int i=0;i<data1.length;i++) {
			data.add(data1[i]);
		}
		for	(int i=0;i<data2.length;i++) {
			data.add(data2[i]);
		}
		Collections.sort(data,Collections.reverseOrder());
		//System.out.println(data);
		
		Integer adata[]={10,16,9,7,31,45,27,94,86,87,112,100,3};
		ArrayList<Integer> bdata=new ArrayList<Integer>();
		for(int i=0;i<adata.length;i++) {
			if(adata[i]%2==1) {
				bdata.add(adata[i]);
			}
		}
		Collections.sort(bdata);
		System.out.println(bdata);
	}
/*응용문제 
 * 다음배열 데이터에서 홀수 데이터만 출력
 * 홀수 데이터는 오름차순으로 정렬되도록
 * {10,16,9,7,31,45,27,94,86,87,112,100,3}-> 결과:{3,7,9,27,31,45,87}
*/
}
