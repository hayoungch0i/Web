package exam;

public class exam6 {

	public static void main(String[] args) {
		int numlist[]= {60,39,42,7,93,26,38,41,9,12,71};
		int result=new exam6_even().even(numlist);
		System.out.println("최종 결과 값: "+result);
	}

}

class exam6_even{
	public int even(int list[]) {
		int sum=0;
		int i=0;
		for(i=0;i<list.length;i=i+2) {
			sum+=list[i];
		};
		
		return sum;
	}
}