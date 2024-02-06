package com.ict.day09;

public class Ex03 {
	public static void main(String[] args) {
		// Math Class 주요 메서드
		// 수학에서 자주 사용하는 상수들과 static 함수들을 미리 구현해놓은 클래스
		
		//E, PI
		System.out.println(Math.E); // 자연 로그 밑 값 : 2.718...
		System.out.println(Math.PI); // 원주율 : 3.14...
		
		// 메서드 모두 static이다.
		// 생성자는 없다 => 객체 생성으로 접근할 수 없다.
		// Math.메서드() 로 접근 가능
		
		// 1. Math.random() : double
		// 0.0 ~ 1.0 미만의 임의의 난수 발생
		System.out.println(Math.random());
		int k1 = (int)Math.random(); //무조건 0;
		int k2 = (int)(Math.random()*10); // 0~9
		int k3 = (int)(Math.random()*3); // 0~2
		
		System.out.println("\n--------------------");
		// 2-1. Math.ceil() : double
		// 올림
		// 가장 큰 정수로 나옴
		System.out.println(Math.ceil(10.0)); // 10
		System.out.println(Math.ceil(10.1231)); // 11
		System.out.println(Math.ceil(-10.0)); // -10 // 가장 큰 정수로 가기때문에 이렇게 나옴
		System.out.println(Math.ceil(-10.1231)); // -10
		
		System.out.println("\n--------------------");
		
		// 2-2. Math.floor() : double
		// 내림
		// 가장 작은 정수로 나옴
		System.out.println(Math.floor(10.0)); // 10
		System.out.println(Math.floor(10.984)); // 10
		System.out.println(Math.floor(-10.0)); // -10
		System.out.println(Math.floor(-10.984)); // -11
		
		System.out.println("\n--------------------");
		// 2-3. Math.round() : long, int
		// 반올림
		// 소수 첫째자리에서 반올림함
		// double형이 아닌 long, int로 나옴
		System.out.println(Math.round(10.0)); // 10
		System.out.println(Math.round(10.4)); // 10
		System.out.println(Math.round(10.5)); // 11
		
		System.out.println("\n--------------------");
		// 3. Math.abs() : int, long, float, double
		// 절대값
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-10.1231));
		
		System.out.println("\n--------------------");
		// 4-1. Math.max(수1, 수2) : 큰 값
		// 최대값
		// 두 수의 자료형이 다르면 알아서 프로모션 해줌
		System.out.println(Math.max(10, 15.16516));
		
		System.out.println("\n--------------------");
		// 4-2. Math.mean(수1, 수2) : 작은 값
		// 최소값
		// 두 수의 자료형이 다르면 알아서 프로모션 해줌
		System.out.println(Math.min(10, 15.16516));
		
		
		
		
		
		
		
		
	}
}
