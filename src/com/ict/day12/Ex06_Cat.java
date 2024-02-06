package com.ict.day12;

public class Ex06_Cat extends Ex06_Animal {
	
	public void play() {
		age = age + 10; // 12
	}
	public void play2() {
		// 상수를 사용하는 것은 가능
		age = month + 10;
		//데이터를 변경하는 것은 불가능
		// month = month +10;
	}
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
		sleep(); // 가져와서 사용하는 것은 가능
	}
	// sleep메서드는 final이 붙어있기 때문에 오류가 난다.
	// final메서드는 오버라이드 불가
//	@Override
//	public void sleep() {
//		System.out.println("야옹~ 야옹~");
//	}
	
}
