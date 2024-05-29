package oop;

//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;

//foreach: 배열 전용으로 사용하는 반복문이며, 클래스 배열에 주로 많이 사용함
public class web8 {

	public static void main(String[] args) {
		LinkedList<Integer> arr=new LinkedList<Integer>();
		arr.addFirst(50);
		arr.addFirst(150);
		arr.addFirst(250);
		arr.addFirst(350);
		
		for(Integer a : arr) { //foreach: for(받는 변수 : 클래스 배열 객체명)
			System.out.println(a);	
		};		
		new web8_box().abc();

	}

}
//LIST배열: 상위배열(interface), ArrayList와 LinkedList 모두 사용할 수 있는 배열
class web8_box{
	public void abc() {
		//List<String>ls=new ArrayList<String>();
		//List<String>ls2=new LinkedList<String>();
		
	}
}