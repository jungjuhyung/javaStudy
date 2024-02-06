package com.ict.day14;

// static 내부 클래스
// 전반적인 static의 특성을 그대로 사용한다.
public class Ex04 {
	String name = "홍길동";
	private int age = 24;
	static int cnt = 14;
	
	public void play() {
		int money = 10000;
		System.out.println("외부 필드값 : "+ money);
	}
	public static void like() {
		System.out.println("like");
	}
	public static class Inner03{
		String addr = "서울 마포구";
		// 내부 클래스의 맴버 중에 static이 있으면 내부 class에 static을 붙여야한다.
		// 클래스에 static을 붙인 순간 외부 클래스의 instance 필드값 및 메서드는 사용불가
		static int room = 5;
		
		public static void prn() {
			// System.out.println(name);
			// System.out.println(age);
			// System.out.println(addr);
			// 메서드도 static처리하면 static 변수 및 객체 생성 없이 호출 가능
			System.out.println(room);
			System.out.println(cnt);
			// play();
			like();
		}
	}
}
