package oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//LinkedList로 원시배열 가공하기
public class web7 {

	public static void main(String[] args) {
		new wb7_box();
		

	}

}

class wb7_box{

	String product[][]=null;
	String money[]=null;
	Scanner sc=new Scanner(System.in);
	
	public wb7_box(){
		this.product=new String[][]{
				 {"쿠첸 브레인 IH 전기압력밥솥","누벨르 디지털 미니 전기밥솥","제니퍼룸 마카롱 전기밥솥 화이트","쿠쿠 트윈프레셔밥솥"},
				 {"4인용","3~4인용","3인용","1~2인용"},
				 {"199500","31650","357910","283000"}
		};
		//this.abc();
		this.bbb();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void bbb() {
		LinkedList<ArrayList<String>> cooker=new LinkedList<ArrayList<String>>();
		for(int i=0;i<(this.product[0].length);i++) {
			ArrayList<String> coocoo=new ArrayList<String>();
			for(int j=0;j<(this.product.length);j++) {
				coocoo.add(product[j][i]);
			}
			cooker.push(coocoo);
		}
		//System.out.println(cooker);
		System.out.println("상품명을 검색하세요: ");
		String search=this.sc.nextLine();
		cooker.indexOf("search");
		int w=0;
		while(w<cooker.size()) {
			int ck=cooker.get(w).get(0).indexOf(search);
			if(ck>=0) {
				System.out.printf("%s 가격: %s\n",cooker.get(w).get(0),cooker.get(w).get(2));
			}
			else {
				System.out.println("검색하신 상품이 없습니다.");
			}
			w++;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	//응용문제: 사용자 금액 입력,0입력시 종료, 그외 입력 사항은 LinkedList에 기록
	public void abc() {
		LinkedList<String> ls=new LinkedList<String>();
		
		while(true) {
			Integer gold;
			System.out.println("금액을 입력하세요: ");
			gold=this.sc.nextInt();
			
			if(gold==0) {//LinkedList 인스턴스명.addFirst: node번호 첫번째에 삽입
				break; //LinkedList 인스턴스명.addLast: node번호 마지막에 삽입
			}
			else {
				ls.push(gold.toString());
			}
		}
		System.out.printf("입력된 금액의 총 리스트 출력: %s",ls);
		this.sc.close();
	}
}