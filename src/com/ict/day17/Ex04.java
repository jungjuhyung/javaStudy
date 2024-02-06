package com.ict.day17;

import java.util.Iterator;

// 두개의 스레드를 생성하여 첫번째 스레드의 출력을 1~100까지 출력하고,
// 두번째 스레드가 출력을 101~200까지 출력하라(synchronized 사용)
public class Ex04 implements Runnable {
	int x = 0;

// 둘다 사용 가능하다.
//	@Override
//	public synchronized void run() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println(++x + ":"+Thread.currentThread().getName());
//			
//		}	
//	}
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println(++x + ":" + Thread.currentThread().getName());

			}
		}

	}

}
