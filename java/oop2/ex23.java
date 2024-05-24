package oop2;

public class ex23 {

	public static void main(String[] args) {
		usercheck uc=new usercheck();
		ex23_box gold=new ex23_box();
		ex23_box2 silver=new ex23_box2();
		uc.check(gold);
		uc.check(silver);
		
	}

}
//유저 레벨 체크
class usercheck{
	public void check(user u) { //매개변수로 interface
		System.out.println(u.userlevel());
	}
	
}

class ex23_box2 implements user{
	@Override
	public String userlevel() {		
		String level="실버회원";
		return level;
	}
}


class ex23_box implements user{
	@Override
	public String userlevel() {		
		String level="골드회원";
		return level;
	}
}