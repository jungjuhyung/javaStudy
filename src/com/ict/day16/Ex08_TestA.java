package com.ict.day16;

// 스레드 만들어서 처리 할려면
public class Ex08_TestA extends Thread {
// start()를 생성하면 스레드 생성이 되지 않고
// main이 start()를 처리하고 종료된다.
//	@Override
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa : " + i + Thread.currentThread().getName());
//		}
//	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : " + i + Thread.currentThread().getName());
		}
	}
}
