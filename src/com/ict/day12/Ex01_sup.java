package com.ict.day12;

// sup = 부모 클래스
public class Ex01_sup {
	// class는 기본적으로 object class를 상속받고 있음
	String name = "홍길동";
	int age = 57;
	String addr = "서울 방학동";
	private String dog = "댕댕이";
	static int car = 1;
	static final boolean GENDER = true;
	
	public Ex01_sup() {
		System.out.println("부모 생성자 : "+this);
	}
}
