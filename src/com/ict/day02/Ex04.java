package com.ict.day02;

public class Ex04 {
	public static void main(String[] args) {
		// 실수 : 소수점이 있는 숫자
		// float < double
		// 실수의 기본은 double
		
		// float는 숫자 뒤에 반드시 F 나 f를 붙인다.
		// 정수의 long과 다르게 float는 반드시 f나F를 붙여야 한다.
		float f1 = 3.14F;
		System.out.println(f1);
		float f2 = -24.0f;
		System.out.println(f2);
		
		double d1 = 3.14;
		System.out.println(d1);
		
		// 중요) float나 double은 부동소숫점으로 값을 표현하므로 소수점 이하의 값이 정확하게 표현이 안되는 오류가 발생
		// 해결) 나중에는 BigDecimal 클래스를 자료형으로 사용
		// 현재는 소수점 이하 몇 자리 버림, 올림, 반올림을 이용하여 교육
		// BigDecimal은 메모리를 많이 잡아먹기 때문에 연산이 느림으로 적절히 사용할 줄 알아야한다.
	}
}
