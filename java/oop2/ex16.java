package oop2;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		comment cm=new comment();
		System.out.println(Arrays.toString(cm.addComment()));
		cm.sc.close();
	}

}

class comment{
	Scanner sc=new Scanner(System.in);
	
	public String[] addComment() {
		String[] commentNtime=new String[2];
		System.out.println("[댓글 입력]");
		System.out.printf("내용을 입력해주세요: ");
		String comments= sc.nextLine();
		commentNtime[0]=comments;
		Date dayTime=new Date();
		SimpleDateFormat todayNow=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		commentNtime[1]=todayNow.format(dayTime);
		return commentNtime;
	}
	
}