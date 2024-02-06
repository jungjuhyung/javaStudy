package com.ict.day12;

// 상속관계(is a 관계) : 자식클래스가 부모클래스의 맴버필드와 맴버메서드를
//					마음대로 사용할 수 있는 클래스들 간의 관계
// 작은 범위가 큰범위에 포함될 순 있지만 큰 범위가 작은 범위에 포함될 수 없는 관계
// 형식) 자식클래스 extends 부모클래스
// 자식클래스에 extends 부모클래스를 붙이라는 뜻이다.
// 특징) 모든 클래스는 하나의 부모클래스를 갖는다.
//		없으면 object가 부모클래스이다.
//		모든 클래스는 Object를 부모클래스를 가지고 있다.
//		다중 상속을 지원하지 않는다.(부모클래스가 하나만 존재한다.)




// sub = 자식 클래스
public class Ex01_sub extends Ex01_sup {
	String name = "홍반장";
	int age = 13;
	private double weight = 81.9;
	
	public Ex01_sub() {
		System.out.println("자식 생성자 : "+this);
	}
	public void play() {
		// 변수 우선 순위
		// 지역변수>전역변수(this)>부모변수(super)
		String name = "홍두깨";
		System.out.println(name); // 홍두깨
		System.out.println(this.name); // 홍반장
		System.out.println(super.name); // 홍길동
		
		System.out.println(age); // 13, 지역변수 age가 없기 때문에 전역변수 age 사용
		System.out.println(this.age); // 13
		
		System.out.println(addr); // 상속되었기 때문에 사용가능
		System.out.println(this.addr); // 변수addr이 하나밖에 없어서 사용가능
		System.out.println(super.addr); // 상속되었기 때문에 사용가능
		
		// System.out.println(dog); 부모의 private는 사용불가
		System.out.println(weight); // 자기자신의 private이기에 사용 가능
	}
}
