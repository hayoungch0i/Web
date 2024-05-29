package game;
/*
	pc가 1~45까지 6개의 수를 생성하고, 그 6개를 클래스 배열에 모두 저장 시킵니다.
	단, 동일한 숫자가 입력되었을 경우 새로운 숫자로 pc가 다시 선택할 수 있도록 코드를 작성합니다.
*/

import java.util.ArrayList;
import java.util.Collections;

public class lotto {

	public static void main(String[] args) {
		choosing ch=new choosing();
		ArrayList<Integer> winner = new ArrayList<Integer>();
		ch.choose(winner);
		Collections.sort(winner);
		System.out.println(winner);
		winner.clear();
	}

}

class choosing {

	public void choose(ArrayList<Integer> winning) {
		while (winning.size() < 6) 
		{
			Integer num = Integer.valueOf((int) Math.ceil(Math.random() * 45));
			if (winning.contains(num)) 
			{
				choose(winning);
			} 
			else 
			{
				winning.add(num);
			}
		}
	}
	
	
}