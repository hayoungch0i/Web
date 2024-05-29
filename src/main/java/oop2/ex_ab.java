package oop2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//추상 클래스
public abstract class ex_ab {
	private Date todaynow = null;
	private int eachAmount = 0;
	
	Scanner sc=new Scanner(System.in);
	
	protected String today(String part) {
		todaynow = new Date();
		SimpleDateFormat sf = new SimpleDateFormat();
		sf.applyPattern(part);
		String dateNnow = sf.format(todaynow);
		return dateNnow;
	}

	protected int each_transfer(String name) throws InputMismatchException {
		eachAmount=0;
		try {
			System.out.printf("%s 이체 금액: ",name);
			this.eachAmount=sc.nextInt();
			
			if(this.eachAmount<0) {
				this.ErrorReInput(name);
			}
		} 
		catch (InputMismatchException e) {
			this.ErrorReInput(name);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//sc.close();
		
		return this.eachAmount;
	}
	
	private int ErrorReInput(String name) {
		System.out.println("잘못된 값을 입력하셨습니다.");
		System.out.println("다시 입력해주세요.");
		return this.each_transfer(name);
	}
	
	protected List<String> makeList(String menu) {
		this.sc=new Scanner(System.in);
		List<String> contents=new ArrayList<String>();
		String input=makeItem(menu);
		
		while(!input.equals("종료")) {
			if(input.equals("")) {
				System.out.println("값이 입력되지않았습니다.\n다시 입력해주세요");
				System.out.printf("현재 %s 리스트: %s\n\n", menu, contents.toString());
			}
			else {
				contents.add(input);
			}
			input=makeItem(menu);
		}
		
		if(input.equals("종료")) {
			System.out.println("입력을 종료합니다.");
		}
		
		return (ArrayList<String>) contents;
	}
	
	private String makeItem(String menu) {
		System.out.printf("추가할 %s을(를) 입력하세요: \n", menu);
		String input=this.sc.nextLine().intern();
		return input;
	}
	
}
