package oop;

public class oop8 {

	public static void main(String[] args) {
		oop8_for oop8_f=new oop8_for();
		oop8_f.oop8_7();
	}
}

class oop8_for{
	public void oop8_1to5(){
		int i=5;
		for(i=5;i>=1;i--) {
			//System.out.println(i);
			//break;
		}
	}
	
	public void oop8_8() {
		int i=1;
		for(i=1;i<10;i++) {
			//System.out.printf("8*%d=%d\n",i,i*8);
		}
	}
	
	public void oop8_7() { //무한루프+break
		int i=1;
		for(i=1;i<51;) {
			break;
		}
		System.out.println(i);
	}
	
	public void oop8_cont() {
		int j=1;
		for(j=1;j<21;j++) {
			if(j==10 || j==14 ||j==17){ //해당 조건에 맞을 경우 출력 없이 다음 단계로 진행
				continue; //해당 코드 실행 시 반복문 아래 코드는 실행 안됨
			}
			System.out.println(j);
		}
	}
}