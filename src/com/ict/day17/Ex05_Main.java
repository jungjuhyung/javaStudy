package com.ict.day17;

public class Ex05_Main {
	public static void main(String[] args) {
		Ex05 test = new Ex05();
		new Thread(test, "첫번째").start();;
		new Thread(test, "두번째").start();;
		
	}
}
