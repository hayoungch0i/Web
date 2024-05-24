package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class exam9 {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> alldata= new ArrayList<ArrayList<String>>();
		System.out.println("회원가입을 실시합니다.");
		System.out.println("몇명의 정보를 입력하시겠습니까:");
		Scanner sc=null;
		int num=(sc=new Scanner(System.in)).nextInt();
		int i=1;
		while(num>0) {
			ArrayList<String> perdata=new ArrayList<String>();
			System.out.println(i+"번째 회원가입");
			register p=new register();
			perdata=p.signup(perdata);
			alldata.add(perdata);
			num--;
			i++;
		}
		System.out.println(alldata);
		sc.close();
	}

}

class register{

	Scanner sc=new Scanner(System.in);
	String detail[]= {"ID","Password","name","E-mail"};
	
	public ArrayList<String> signup(ArrayList<String> person){
		String pdata[] = new String[detail.length];
		for(int i=0;i<detail.length;i++) {
			System.out.printf("Input %s: ",detail[i]);
			pdata[i]=sc.nextLine();
			person.add(pdata[i]);
		}
		sc.close();
		return person;
	}
	
	
	
	
}