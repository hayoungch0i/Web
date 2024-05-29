package oop2;
//멀티 쓰레드(interface) 활용
//웹 개발시 유일하게 멀티 스레드를 사용하는 경우: API 서버
public class th2 {

	public static void main(String[] args) {
		for(int f=0;f<100;f++) {
			th2_class th=new th2_class();
			th.abc(10);
			Thread tr= new Thread(th); //interface도 동일하게 thread 호출
			try {
				//tr.sleep(5000);
				tr.start();	
			}
			catch (Exception e) {
				System.out.println("쓰레드 문제 발생");
			}
		}
	}
}

class th2_class implements Runnable{
	int n=0;
	public void abc(int z) {
		this.n=z;
	}

	@Override
	public void run() { //run 메소드에 코드 작성시 결과값은 다르게 출력됩니다.
		try{
			Thread.sleep(1000); //Thread.sleep(): 휴식시간=1000당 1초
		}
		catch (Exception e) {
			System.out.println("Thread 오류 바래");
		}	
	}
}
