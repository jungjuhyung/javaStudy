package com.ict.day02;

public class Ex06 {
	public static void main(String[] args) {
		// 형변환 : 자동 형 변환, 강제 형 변환
		// 자동 형 변환 = 프로모션 : 작은 자료형이 큰 자료형으로 변환하는 것(저장하는 것)
		
		int s1 = 10;
		long s2 = s1;
		// int가 long에 속하는 범위이기 때문에 long자료형의 L을 굳이 안붙이고 생략해도 된다.
		// 혹여 L을 안붙여도 그것은 int형이기 때문이다.
		// 언제나  java의 기본규칙으로는 오류이나 그렇지 허용범위이기 때문에 오류로 포함되지 않는다.
		long s3 = 10;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// 강제 형 변환 = 디모션 : 큰 자료형이 작은 자료형으로 변환할 때 오류가 발생하여서
		// 					강제로 변경시키는 방법(데이터가 손실될 가능성이 있다.)
		
		double d1 = 35.14;
		int d2 = (int) d1;
		// 형변환 한다는 것을 casting 한다고 한다.
		// 강제 형변환에서 중요한 것은 왼쪽이 기준이 된다는 것이다.
		System.out.println(d1);
		System.out.println(d2);
		// 소수점이 버림되어서(데이터 손실) 저장되었다.
		
		float f1 = (float)(5426.142);
		// float은 double보다 범위가 작기 때문에 무조건 F를 붙여야한다.
		// 왼쪽이 기준이 되기 때문에 (float)로 감싸는 것이다.
		System.out.println(f1);
		
		// char가 0~65,535 사이값은 받을 수 있다.
		char k2 = 105;
		System.out.println(k2);
		// 그러나 char에 int 변수를 통해 넣으면 자료형 범위가 작기 때문에 오류가 난다.
		int k3 = 105;
		// char k4 = k3;
		// 따라서 강제 형변환을 해준다.
		char k4 = (char)(k3);
		System.out.println(k4);
		
	}

}
