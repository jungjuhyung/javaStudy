package com.ict.day12;

// 추상클래스 : 하나 이상의 추상메서드를 가지고 있는 클래스
// 			일반적인 변수와 상수, 메서드도 가질 수 있다.
// 			반드시 abstract가 붙는다.
// 			추상클래스는 new 예약어를 사용해서 기존 형식의 인스턴스 객체를 만들 수 없다.
//			정확히는 익명 내부클레스 타입으로는 생성 가능하다(기존 형식을 가지면서 오버라이딩 되서 나옴)
public abstract class Ex08_Animal {
	int leg = 4;
	boolean live = true;

	public void play() {
		System.out.println("열심히 달린다.");
	}
	// 추상메서드 : body({})를 가지고 있는 않은 메서드
	// 			즉, 구체적으로 실행하는 실체가 없다.(실행하는 수행문이 없다.)
	// 반드시 class와 메서드에 같이 abstract를 붙여줘야한다.
	public abstract void sound();
}
