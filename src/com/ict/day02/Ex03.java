package com.ict.day02;

public class Ex03 {
	public static void main(String[] args) {
		// 숫자는 정수형과 실수형으로 나눠진다.
		// 정수란 소수점이 없는 숫자
		// 실수란 소수점이 있는 숫자
		// 정수 < 실수
		// 정수 : byte<short<int(기본)<long
		// 실수 : float<double(기본)
		
		// byte : -128 ~ 127
		byte b1 = 100;
		System.out.println(b1);
		
		b1 =127;
		System.out.println(b1);
		
		// b1 = 120 + 9;(오류)
		// 이걸로 알 수 있는건 계산을 하고 저장을 하기때문에 오류가 발생한다는 것이다.
		// 변수에 저장할 때는 계산 후 결과값만으로 저장 유무를 결정한다.
		
		// short : -32,768 ~ 32,767
		// byte처럼 결과값이 범위를 넘으면 사용 불가
		
		// int : 기본적으로 정수를 사용할 때 호출하는 자료형
		int su = 35;
		System.out.println(su);
		
		// long : 정수 중에 가장 큰 범위를 가지고 있음
		// 즉, 큰 정수를 사용할 때 호출하는 자료형
		// 숫자 뒤에 l 또는 L을 붙인다.(생략가능), 생략가능하지만 붙이는게 오류 안나는 확률이 높음
		long num = 32L;
		long num2 = -3514L;
		long num3 = 32145l;
		long num4 = -56212l; // 1과 l이 햇갈릴 수 있으니 L을 넣는거 추천
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
	}
}
