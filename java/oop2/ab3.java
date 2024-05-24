package oop2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class ab3 {
	
	int number=50;
	public ab3(int a) {
		this.number=a;
				
	}
	
	public abstract String product();
	public abstract Integer basket();
	public void pay() {}
	
	
	
	//현재 시간 출력
	public String today() {
		Date day=new Date();
		SimpleDateFormat sim= new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); 
		SimpleDateFormat simE= new SimpleDateFormat("E",Locale.ENGLISH); 
		return sim.format(day) + simE.format(day);
	}
}
