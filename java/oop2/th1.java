package oop2;
//멀티 스레드 환경
/*
Thread란 기본으로 1Thread로 작동
thread 클래스를 해당 클래스로 상속 시킨 후 thread 선언하여 start() 메소드 활용시
멀티 쓰레드로 작업환경이 변경됩니다.
단 웹 기본 속성은 단일 스레드 입니다.
*/
public class th1 {

	public static void main(String[] args) {
		//단일 스레드 구성요소
		/*th1_box th=new th1_box();
		th.aaa();
		th.bbb();
		int w=0;
		do {
			th1_box thb=new th1_box();
			th.ccc(w);
			w++;
		}while(w<21);*/
		
		//멀티 쓰레드 호출 및 구성 방식
		int w=0;
		do {
			th2_box thb=new th2_box(w);
			//thb.zzz(W); //미작동
			Thread th =new Thread(thb);
			th.start(); //run(): 메소드를 호출하여 실행
			w++;
		}while(w<50);
	}
}

class th2_box extends Thread{
	int no=0;
	public th2_box(int n) {
		this.no=n;
	}
	
	@Override
	public void run() {//멀티 쓰레드 클래스를 사용         
		super.run();
	}
	public void zzz(int n) {
		System.out.println("c:"+n);
	}
	
}

//단일 스레드로 구성, 
class th1_box{
	public void ccc(int z) {
		System.out.println("c:"+z);
	}
	
	public void aaa() {
		int w=0;
		do {
			System.out.println("a:"+w);
			w++;
		}while(w<21);
	}
}
class th{
	public void aaa() {
		int w=0;
		do {
			System.out.println("a:"+w);
			w++;
		}while(w<21);
	}
}