package com.ict.day14;

// Member 내부클래스
public class Ex02 {
	// 클래스명은 마음대로 가능
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;
	
	// 외부클래스 메서드
	public void sound() {
		// 외부클래스의 맴버들은 불러올 수 있다.
		// 내부클래스의 맴버들은 불러올 수 없다.
		// System.out.println(addr);
		System.out.println("외부클래스의 매서드");
	}
	
	// 생성자
	public Ex02() {
		System.out.println("외부 : "+this);
	}
	// 내부클래스
	public class Inner01{
		String addr = "서울 마포구 백범로";
		int room = 5;
		public Inner01() {
			System.out.println("내부 : "+this);
		}
		
		// 내부클래스 메서드
		public void play() {
			System.out.println(addr);
			System.out.println(room);
			// 외부클래스의 맴버를 마음대로 사용 가능(private도 가능)
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			// 외부클래스의 맴버메서드를 마음대로 사용가능
			sound();
		}
	}
}
