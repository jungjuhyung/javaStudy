package com.ict.day13;

public class Ex10_Main {
	public static void main(String[] args) {
		// 인터페이스 객체 생성 안됨
		// Ex06_Add t1 = new Ex06_Add();
		
		// 추상클래스 객체 생성 안됨
		// Ex08_Oper t2 = new Ex08_Oper();
		
		// 일반 클래스
		// 인터페이스, 추상을 전부 재정의한 Ex09는 일반 클래스이고 사용이 가능하다.
		Ex09_Calc t3 = new Ex09_Calc();
		double res = t3.plus(10, 4);
		System.out.println(res);
	}
}
