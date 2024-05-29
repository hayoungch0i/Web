package oop2;
//module class
public class oc1_box {
		//private는 외부에서 값을 변경하지 못함.
		private String user="홍길동";
		//protected는 같은 패키지에서는 핸들링이 가능함
		protected int age=35;
		//public은 모든 패키지에서 변경 및 핸들링이 가능함
		public boolean agree=true;
		
		protected void abc() {
			System.out.println(this.user);
			System.out.println(this.age);
		}
}
