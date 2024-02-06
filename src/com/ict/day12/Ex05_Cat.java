package com.ict.day12;

public class Ex05_Cat extends Ex05_Animal {
	int tail = 10;
	
	// 부모 메서드를 가져와서 자식 클래스가 마음대로 변경할 수 있다.
	// 이를 오버라이딩이라고 한다.
	// @Override를 기본적으로 붙여주는게 좋다.
	// @가 붙이는 것을 java에서 "어노테이션"이라고 한다.
	// @Override => 부모클래스의 메서드를 자식클래스가 가져와서 재정의한다.
	// 같은 메서드를 써도 cat객체를 생성하면 야옹
	// dog객체를 생성하면 멍멍이라는 반응이 나온다.
	// 이것이 오버라이드이며 다형성 특징을 가진다고 한다.
	// 이때 부모의 sound메서드는 동작하지 않게되면서 정보가 은닉되었다고 한다.
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	public void play() {
		System.out.println("놀기");
	}
}
