package com.ict.day17;

public class Ex03 implements Runnable {
	int x = 0;
	
	// 동기화 처리할 때 현재 실행중인 스레드를 강제로 대기상태로 변경시키는 메서드가 wait()
	// wait() 된 스레드를 풀어주는 예약어가 notify(), notifyAll()
	// notify()는 특별한 기준을 부여할 수 없으며 JVM에 의해 대기상태를 풀어줄 스레드를 결정한다.
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + ":" + Thread.currentThread().getName());
			if (x==11) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify(); // 이걸로 대기상태를 풀어주고 준비상태로 가면 나머지 작업을 시행하고 준비상태로 돌아간다.
			}
		}
	}
}
