package com.ict.day12;

public class Ex04_main {
	public static void main(String[] args) {
		Ex04_Game t1 = new Ex04_Game();
		t1.play();
		
		System.out.println("---------------");
		Ex04_MP3 t2 = new Ex04_MP3();
		t2.sound();
		
		System.out.println("---------------");
		Ex04_DCa t3 = new Ex04_DCa();
		t3.picture();
		
		t1.sound();
		t1.sms();
		t1.call();
		// 만약 부모의 부모와 부모가 같은 필드값을 가지고 있다면
		// 가까운 부모가 우선 순위가 높다.
		System.out.println(t1.number);
	}
}
