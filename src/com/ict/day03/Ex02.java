package com.ict.day03;

public class Ex02 {
	public static void main(String[] args) {
		// 비교 연산자 : >, <, >=, <=, ==(같다), !=(다르다, 같지않다)
		// 비교 연산자를 사용할 수 있는 기본 자료형 : 문자형, 정수형, 실수형
		// 비교연산 결과는 boolean형으로 저장된다.
		// 비교했으면 무조건 결과값을 저장할 변수를 선언하고 저장해야한다.
		// 논리형은 기본적으로 조건식에 사용된다.
		
		// 정수 정수 비교
		int su1 = 90;
		int su2 = 80;
		// su1 > su2; 결과값을 저장할 변수선언이 없기에 오류
		boolean result = su1 > su2;
		System.out.println(result);
		
		// 실수 실수 비교
		double su3 = 97.4;
		double su4 = 89.0;
		result = su3 > su4;
		System.out.println(result);
		
		// 정수 실수 비교
		result = su1 > su4;
		// 비교이기 때문에 정수와 실수를 비교할 수 있다.
		// 형변환하는 범위비교에서는 실수가 무조건 크지만 비교연산자에서는 순수히 숫자의 크기를 비교하기 때문에 범위는 신경쓰지 않는다.
		System.out.println(result);
		
		// 문자 비교
		char su5 = 'a';
		char su6 = 'c';
		// 문자형도 숫자로 저장되기 때문에 비교가 가능하다.
		result = su5 > su6;
		System.out.println(result);
		
		su5 = 'a';
		su6 = 'A';
		result = su5 > su6;
		System.out.println(result);
		
		// 정수 문자 비교
		result = su1 > su5;
		System.out.println(result);
	}
}
