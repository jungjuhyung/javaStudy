package com.ict.day12;

public class Ex07_Cat extends Ex07_Animal{
	int id = 124123;
	public Ex07_Cat() {
		// super(); 첫줄에 생략되어 있다.
		// super : 부모클래스의 주소를 참조
		// super([인자]) : 부모클래스의 생성자
		// 부모에 기본생성자가 없고 다른 생성자가 있으며
		// 자식클래스에서 super()를 생략하면 오류난다.
		// this()와 super()는 공존할 수 없다. 둘 중 하나만 써야한다.
		// this()로 가리킨 생성자에 super()가 있으면 오류가 안난다.
		super("짜오", 3); // 강제로 부모생성자의 형식에 맞춰야한다.
		System.out.println("자식생성자");
	}
	// 생성자가 몇개이던 모든 자식 생성자는 부모생성자(super())가 있어야한다.
	public Ex07_Cat(String name) {
		super(name, 7);
	}
}
