package oop2;

import java.util.LinkedList;

//예외처리, 배열, setter/getter
public class ex11 {

	public static void main(String[] args) {
		ex11_box ex=new ex11_box();
		Object data[]= {"2000","500","1500","1.5","15.25","6000"};
		try {
			ex.setter(data);
			LinkedList<Integer> result=ex.getter();
			System.out.println(result);
		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

}

class ex11_box{
	LinkedList<Integer> redata=new LinkedList<Integer>();
	public void setter(Object[] call) throws Exception{
	int ea=call.length;
	int w=0;
			while(w<ea){
				try {
					//Integer no=Integer.valueOf((String)(call[w]));
					Integer no=Integer.parseInt((String) call[w]);
					System.out.println(no);
					this.redata.add((int)call[w]); //원시배열값을 클래스 배열로 데이터 삽입
				} catch (Exception e) { //예외 처리 오류 발생시 throw가 발생이 되면 반복문 정지
					Exception ex=new Exception("배열에 올바른 값이 아닙니다.");
					throw ex;
				}
				w++;
			}
	}
	
	public LinkedList<Integer> getter() throws Exception{
		return this.redata;
	}
	
	
}