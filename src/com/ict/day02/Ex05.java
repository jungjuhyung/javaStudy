package com.ict.day02;

public class Ex05 {
	public static void main(String[] args) {
		// 크기 비교(boolean만 제외)
		// char, byte, short, int, long, float, double
		// char을 굳이 크기 순으로 넣는다면 short, char, int 순으로 넣는다.
		// byte < short < char < int < long < float < double
		// 큰 자료형은 작은 자료형을 저장할 수 있고 반대는 성립하지 않는다.
		
		// 데이터 100이 int s1에 저장된다.
		int s1 = 100;
		// 변수 s1 안에 있는 데이터 100이 long s2에 저장된다.
		long s2 = s1;
		// 변수 s1 안에 있는 데이터 100이 double s3에 실수형으로 저장된다.
		double s3 = s1;
		// s1 자체가 s2에 저장되는 것이 아닌 s1에 저장된 100이 불러와저서 저장된다.
		// 이때 s1에 있는 값이 사라지는 것이 아니다.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		// s1의 값이 s3로 넘어가서 저장될 때는 해당 자료형(실수형)으로 저장된다. 그래서 100.0으로 출력된다.
		
		// char과 int 저장
		char s4 = 'a';
		int s5 = 'a';
		System.out.println(s4);
		System.out.println(s5);
		
	}
}
