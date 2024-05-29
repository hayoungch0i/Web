package oop;
//2차 배열을 이용한 데이터 응용편
public class array5 {

	public static void main(String[] args) {
		ay5_box ab=new ay5_box();
		ab.abc();

	}

}

class ay5_box{
	final String data[][]= {
			{"hong","kim","park"},
			{"a1234","b1234","c1234"},
			{"1000","1500","2000"}
	};
	//회원정보 데이터를 배열화하며 상수로 적용함
	public void abc() {
		String pw="b1234";
		int gp=this.data.length;
		int ea=this.data[0].length;
		int i=0, j=0;
		int count=0;
		for(i=0;i<ea;i++) {
			for(j=0;j<gp;j++){
				System.out.println(this.data[j][i]);
			}
			if(pw=="b1234") {
				System.out.println("로그인 하셨습니다\n");
				System.out.println(this.data[2][i]);
				count++;
				break;
			}
		}
		if (count==0) {
		System.out.println("아이디 및 패스워드를 제대로 입력해주세요.");
		}
	}
}