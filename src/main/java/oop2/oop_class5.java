package oop2;
//class+class
/*
1.현재 시간.날짜
2.로그인 정보
3.dto(setter,getter)
4.Session, Cookie
5.Database connection
*/
public class oop_class5 {

	public static void main(String[] args) {
		b_class bc=new b_class();
		bc.aaa("홍길동",01012345612); //int, Integer는 0으로 시작하면 시작값 loss
		
	}
}

class a_class{
	String user="";
	Integer tel=0;
	public void aaa(String nm, int no ) {
		this.user=nm;
		this.tel=no;
		System.out.println(this.user);
		System.out.println(this.tel);
	}
}

class b_class extends a_class{
	@Override
	public void aaa(String nm, int no ) {
		super.aaa(nm, no);
	}
	
}