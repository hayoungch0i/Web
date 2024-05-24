package oop2;

import java.util.Scanner;

//inter3,inter4 연계작업
public class bank {

	public static void main(String[] args) {
		allbank ab=new allbank();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.국민은행 2.신한은행 은행을 선택해주세요:");
		Integer bankno=sc.nextInt();
		switch(bankno) 
		{
		case 1: //국민
			ab.KB_bank();
		break;
		case 2: //신한
			ab.SH_bank();
		break;
		default:
			System.out.println("해당 은행 코드는 존재하지않습니다.");
		break;
		}
		sc.close();
	}

}


class allbank implements inter3,inter4{

	/*
	동일한 이름을 가진 변수명이라도 
	interface의 이름에 따라 다른값을 가져올수 있음(this 사용불가)
	그 외에는 this 사용 가능함
	*/
	Scanner sc2=new Scanner(System.in);
	String userpass="";
	String part="";
	int usermoney=0;
	Integer money=0;
	
	
	public allbank() { //즉시실행 
		this.money=inter3.money;
	}
	
	@Override
	public void SH_bank() { //inter4 신한은행, 수수료 필요
		System.out.printf("%s은행 패스워드 입력: %n",inter4.bankname);
		this.userpass=this.sc2.nextLine();
		if(this.userpass.equals(inter4.password)) {
			System.out.println("1.입금 2.출금");
			this.part=sc2.nextLine();
			if(this.part.equals("2")) {
				System.out.println("출금 금액을 입력해주세요:");
				this.usermoney=this.sc2.nextInt();
				this.sc2.close();
				this.out_money(true);
			}		
		}
		else {
			System.out.println("계좌 비밀번호가 틀립니다.");
		}
	}

	@Override
	public void KB_bank() { //inter3 국민은행, 수수료 없음
		System.out.printf("%s은행 패스워드 입력: %n",inter3.bankname);
		this.userpass=this.sc2.nextLine();
		if(this.userpass.equals(inter3.password)) {
			System.out.println("1.입금 2.출금");
			this. part=sc2.nextLine();
			if(this.part.equals("2")) {
				System.out.println("출금 금액을 입력해주세요:");
				this.usermoney=this.sc2.nextInt();
				this.sc2.close();
				this.out_money(true);
			}
		}
		else {
			System.out.println("계좌 비밀번호가 틀립니다.");
		}
		
	}//입금, 출금 return 메소드
	
	public Integer in_money() { //입금
		return 0;
	}
	@SuppressWarnings("all")
	public Integer out_money(boolean z) {//출금
		if (z==true) {//수수료 있음
			this.money=this.money-(this.usermoney+inter4.cg);
			System.out.println("최종금액은: "+this.money);
			
		}
		else {
			this.money=this.money-this.usermoney;
			System.out.println("최종 금액은 : "+this.money);
		}
		return 0;
	}
		
}
