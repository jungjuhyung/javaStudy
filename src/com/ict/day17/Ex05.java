package com.ict.day17;

// 두개의 스레드를 생성하여 첫번째 스레드의 출력 1~50까지 출려하고,
// 두번째 스레드의 출력은 51~100까지 출력하고,
// 다시 첫번째 스레드가 101~150까지 출력하고,
// 두번째 스레드가 151~200 출력(synchronized 사용)
public class Ex05 implements Runnable {
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(++x + ":"+Thread.currentThread().getName());
//			if (x==50) {
//				try {
//					notify();
//					wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}else if (x==100) {
//				try {
//					notify();
//					wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}else if (x==150) {
//				try {
//					notify();
//					wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			switch (x) {
//			case 50:
//				try {
//					notify();
//					wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				break;
//			case 100:
//				try {
//					notify();
//					wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				break;
//			case 150:
//				try {
//					notify();
//					wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				break;
//			default:
//				break;
//			}
			if (x%50 ==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}
}
