package oop2;
//interface => class와 비슷한 성질=모든 메소드를 그룹화
//interface에서는 private, protected 사용하지 못함

public interface inter1 {
	public String names(); //기본 메소드에 {}가 없음
	public Integer age();
	
	//default 선언자: interface에서 유일하게 기본 메소드를 활용할 수 있는 선언문
	default void setbox(String id) {
		
	}
	
	default String getbox() {
		return null;
	}
	
}
