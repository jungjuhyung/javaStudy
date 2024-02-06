package com.ict.day17;

public class Ex02_Main {
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		// 이럴 때 Ex02의 run()은 임계영역이 된다.
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
		new Thread(test, "tiger").start();
		new Thread(test, "lion").start();
		
		System.out.println("main : "+Thread.currentThread().getName());
	}
}
