package oop2;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) { 
		Ex15_box ex=new Ex15_box(); 
		ex.sc.close();
	}
}

class Ex15_box{
	
	Scanner sc= new Scanner(System.in);
	exdto exd=new exdto();
	
	public Ex15_box() { 
		System.out.println("등록을 끝내려면 exit를 입력하세요.");
		
		while(true) {
			System.out.println((exd.plist.size()+1)+"번째 상품등록입니다.");
			setProduct();
		}
	}
	
	public void setProduct(){ //상품 세팅		
		System.out.println("상품명을 입력하세요: "); //상품명 등록부
		String name=this.isExit();
		exd.setProductName(name);
		
		System.out.println("상품 가격을 입력하세요: "); //상품가격 등록부
		String price=this.isExit();
		exd.setProductPrice(price);
		
		System.out.println("상품 수량을 입력하세요: "); //상품수량 등록부
		String count=this.isExit();
		exd.setProductCount(count);
		System.out.println("");
		
		exd.adding();
	}
	
	public String isExit() { //상품등록 종료(exit입력)
		String command=sc.nextLine();
		if(command.equals("exit")) {
			System.out.println("상품 등록을 종료합니다.");
			System.out.println("등록된 상품 리스트");
			System.out.println(exd.plist); //마지막에 등록된 상품 리스트 출력	
			System.exit(0);
		}
		return command;
	}
	
}