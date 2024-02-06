package com.ict.day16;

public class Ex09_Main {
	public static void main(String[] args) {
		Ex09_TestA testA = new Ex09_TestA();
		Ex09_TestB testB = new Ex09_TestB();
		
		// Runnable interface는 start()가 없으므로 사용못함
		// testA.start();
		
		// Runnable을 상속받은 클래스를 인자로 넣자
		Thread t1 = new Thread(testA);
		t1.start(); // 이러면 testA의 run()을 찾아간다.
		
		// 익명
		// Thread 객체가 일회성
		// testB는 존재해야함
		new Thread(testB).start();
		
		// 익명 : 안드로이드 식
		// 스레드 자체가 일회성이다.
		// test클래스 조차 필요없다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("111: " + i+": " + Thread.currentThread().getName());
				}
			}
		}). start();
	}
}
