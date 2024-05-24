package exam;

public class exam5 {

	public static void main(String[] args) {
		int numlist[]= {10,20,15,3,9,22,8,3,27};
		int result=new ex5_sum().sum(numlist);
		System.out.println("최종 결과 값: "+result);
	}

}

class ex5_sum{
	
	public int sum(int list[]) {
		int sum=0;
		int i=0;
		do {
			sum+=list[i];
			i++;
		}while(i<list.length);
		
		return sum;
	}
}
