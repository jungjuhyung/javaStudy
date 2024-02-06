package com.ict.day14;

// import com.ict.day14.Ex02.Inner01;

public class Ex02_Main {
	public static void main(String[] args) {
		// Member내부클래스는 별도로 객체 생성 안됨
		// Inner01 t1 = new Inner01();
		
		// 외부클래스를 통해서 내부클래스 객체를 생성
		Ex02 t1 = new Ex02();
		// 내부클래스 선언 및 객체생성 형식
		//Inner01 t2 = t1.new Inner01(); 이런 양식으로 작성하려면 위의 import를 해야한다.
		// t2 주소에는 반드시 $가 존재한다. 즉, 주소에 $표시가 있으면 내부클래스임을 알 수 있다.
		Ex02.Inner01 t2 = t1.new Inner01();
		System.out.println("------------");
		
		// t1에 접근 가능하다는 것은 내부class를 작성할 때 외부클래스 데이터를 사용할 수 있다는 것이다
		// 다른 클래스에서 객체생성해서 불러올 때는 내부클래스는 자기{}안에 있는 필드만 불러올 수 있다.
		// 이때 내부클래스의 필드데이터에 외부클래스 필드데이터가 있다면 사용가능
		t2.play();
		
	}
}
