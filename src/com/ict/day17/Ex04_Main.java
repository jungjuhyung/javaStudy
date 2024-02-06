package com.ict.day17;

//두개의 스레드를 생성하여 첫번째 스레드의 출력을 1~100까지 출력하고,
//두번째 스레드가 출력을 101~200까지 출력하라(synchronized 사용)
public class Ex04_Main {
	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();
		new Thread(ex04,"첫번째").start();;
		new Thread(ex04,"두번째").start();;
		
		
	}
}
