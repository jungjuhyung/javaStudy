package com.ict.day09;

public class Ex06 {
	String name = "홍길동";
	static int kor = 80;
	static int eng = 95;
	static int math = 95;
	int total = 0;
	
	// static 메서드
	// static 메서드가 전역변수를 사용하기 위해서는 전역변수 또한 static이어야 한다.
	// 일반 메서드의 지역변수는 메서드를 호출하면 만들어진다.
	// 그럼 static 메서드는 또한 클래스 객체 생성 안해도 불러올 수 있다.
	// 지역변수에는 static을 붙일 수 없다.
	public static void play01() {
		int sum = kor + eng + math;
		System.out.println(kor);
		System.out.println(sum);
	}
	
	public static int play02() {
		int sum = kor + eng + math;
		return sum;
	}
	
	
	
	
}
