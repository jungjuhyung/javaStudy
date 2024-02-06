package com.ict.day09;

public class Ex01 {
	// final이 붙어있으면 상수이다.
	// 보통 static final로 사용한다.
	// 아래 4개가 만들 수 있는 맴버필드값의 전부이다.
	// 아래 변수들을 전역변수라고 함
	// 클래스 : 맴버필드, 맴버메소드, 생성자
	// 맴버필드 : 데이터, 상태값, 속성, 특징
	// 			변수 : 언제든지 변할 수 있는 상태값
	//			상수 : 한번 지정되면 변경할 수 없는 상태값 // 반드시 final이 붙는다.
	
	// 인스턴스 변수와 상수는 클래스가 객체로 생성될 때 함께 생성되는 변수와 상수
	// 호출 : 참조변수.맴버필드, 참조변수.맴버메서드
	
	// static 변수와 상수는 객체 생성과 상관없이 먼저 만들어져있는 변수와 상수이다.(static 표시가 있음)
	// 호출 : 클래스이름.맴버필드, 클래스이름.맴버메서드
	
	String name = "홍길동";	// instance 변수
	int kor = 80;			// instance 변수
	static int eng = 85;	// static 변수
	final int MATH = 90;	// instance 상수
	static final int COMPUTER = 95;	// static 상수
}
