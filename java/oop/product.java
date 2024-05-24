package oop;

//상품 출력 파트(datalist.java와 연계)
public class product{

	public static void main(String[] args) {
		new_product npd=new new_product();
		npd.np();
	}
}

//신규상품 출력 파트
class new_product{
	datalist dl=new datalist();
	/*
	응용문제: 이벤트 상품으로 출력하는 파트-> 이벤트 상품 중 할인율이 20%이상인 상품만 출력
	문자를 숫자로 변경시 null,"",오류날수 있음
	*/
	
	public void np() {
		String arr[][]=this.dl.product();
		int gp=arr.length;
		int ea=arr[0].length;
		int w=0;
		
		while(w<gp) {
			//System.out.println(Arrays.toString(arr[w]));
			if(arr[w][1]=="Y") { //할인중인 제품만
				if(Integer.parseInt(arr[w][4])>=20) {
					int z=0;
					while(z<ea) {
						System.out.println(arr[w][z]); //최종 상품 출력
						z++;
					}
				}	
			}	
			w++;
		}
	
	}

}
