package com.ict.day13;

public class Ex11_Main {
	public static void main(String[] args) {
		toPlay2("홍길동");
		// toplay(Ex11_IBehavior ib); interface 자체는 객체 생성이 안되기 때문에 불가능
		
		// 인터페이스는 객체로 생성 못함
		// Ex11_IBehavior ibe = new Ex11_IBehavior();
		
		// 인터페이스를 상속받은 일반 클래스는 인터페이스 객체로 취급되어 인터페이스 인자로 사용할 수 있다.
		// 이렇게 다중상속이 가능하기 때문에 부모 인터페이스 주소를 참조하게 되고 자식끼리 대체해서 사용할 수 있다.
		Ex11_Soccer soccer = new Ex11_Soccer();
		toPlay(soccer);
		Ex11_BassGuitar bassGuitar = new Ex11_BassGuitar();
		toPlay(bassGuitar);
		
		// 인자에서 객체를 생성하면서 넣을 수 있다.
		// interface를 자료형으로 가진 인자는 interface를 상속받은 객체를 넣으라는 것이다.
		// 인자에 Ex11_IBehavior를 넣고 메서드 안에서 재정의 할 수도 있으나 나중에 배운다.
		toPlay(new Ex11_Soccer());
		toPlay(new Ex11_BassGuitar());
	}
	public static void toPlay(Ex11_IBehavior ib) {
		ib.play();
	}
	public static void toPlay2(String str) {
		System.out.println(str + "님 성공");
	}
}
