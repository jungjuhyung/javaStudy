package com.ict.day12;

public class Ex01_main {
	public static void main(String[] args) {
		Ex01_sub t = new Ex01_sub();
		// 자식 객체를 생성할 때 부모객체가 먼저 만들어지고 자식객체가 만들어진다.
		// 참조변수는 자식객체의 주소를 먼저 가리킨다.
		// 그 후 부모 클래스의 this와 자식 클래스의 this는 참조변수의 주소를 참조한다.
		// 자식객체를 생성할 때 부모가 먼저 만들어져야함으로 부모객체를 생성하는 생성자가 존재함
		// 이를 super() 라고 표현
		// 필드나 메서드를 불러올 때 우선순위는 자식클래스이다.
		System.out.println(t);
		System.out.println("---------------");
		
		t.play();
		// 부모클래스의 맴버필드가 private가 아니면 접근 가능
		System.out.println(t.addr);
		System.out.println(t.age);
		
		// static은 객체, 상속 등과 상관없이 그냥 호출 가능
		// 클래스이름.맴버필드 or 클래스이름.맴버메서드
		
		System.out.println(Ex01_sup.car);
		System.out.println(Ex01_sup.GENDER);
	}
}
