package com.ict.day16;

public class Ex08_Main {
	public static void main(String[] args) {
		System.out.println("main: "+Thread.currentThread().getName());
		// main이 끝나면 JVM으로 돌아간다.
		// JVM에 가면 프로그램이 끝난다.
		// 이러면 TestA는 프로그램이 종료되도 작동하고 있다.
		// 이러한 상황은 상황에 맞춰 쓰게 된다.
		// 백그라운드 앱 같은 경우가 이에 해당됨
		// main은 testA의 run만 실행시키고 다시 돌아온다.
		// 그래서 수고하셨습니다. 실행 후 먼저 종료되는 거임
		Ex08_TestA testA = new Ex08_TestA();
		Ex08_TestB testB = new Ex08_TestB();
		Ex08_TestC testC = new Ex08_TestC();
		
		testA.start();
		testB.start();
		testC.start();
		System.out.println("수고하셨습니다.");
		
		
		
		
	}
}
