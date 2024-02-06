package com.ict.day12;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식클래스를 객체 생성하면 부모클래스가 먼저 생성된다.
		Ex03_sub t1 = new Ex03_sub();
		
		// is a 관계이기 때문에 부모가 더 범위가 크다
		// 따라서 선언을 부모 클래스로 해도 된다.
		// 선언과 생성자의 이름이 안맞는 경우가 있으면 선언부분의 클래스는 부모클래스이다.
		// 부모		// 자식
		Ex03_sup t2 = new Ex03_sub(); // Ex03_sub(자식) is a Ex03_sup(부모) 관계
		// 자식			// 부모
		// Ex03_sub t3 = new Ex03_sup; 반대는 오류난다.
		
	}
}
