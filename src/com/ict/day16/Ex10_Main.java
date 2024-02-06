package com.ict.day16;

// 데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//				일반 스레드가 종료되면 데몬 스레드는 강제로 종료된다.
public class Ex10_Main {
	public static void main(String[] args) {
		Ex10 test = new Ex10();
		Thread thread = new Thread(test);
		// 아래 코드가 없으면 무한루프된다.
		// 아래 코드 한줄이 객체에 지정된 test쓰레드를 데몬 스레드로 만들어준다.
		// 데몬스레드로 설정하게 되면 자신을 제외한 실행되고 있는 스레드가 없을 때 종료되는 것이다.
		// 그래서 싱글 스레드에서는 main이 종료되면 같이 종료되지만 멀티 스레드에서는 다른 일반 스레드의 종료 여부도 판단한다.
		thread.setDaemon(true);
		thread.start();
		
		Ex11 test2 = new Ex11();
		Thread thread2 = new Thread(test2);
		thread.setDaemon(true);
		thread2.start();
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("수고하셨습니다.");
	}
}
