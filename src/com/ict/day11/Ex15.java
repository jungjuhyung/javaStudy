package com.ict.day11;

public class Ex15 {
	// 인스턴스 맴버필드는 객체 생성할 때 생성자를 통해 데이터를 초기화한다.
	
	// static 초기화
	/*
		static{
			초기화 내용;
		}
	 */
	int s1 = 100;
	private int p1 = 300;
	static int s2;
	static int s3;
	
	public static int k2 = 300;
	static int k3 = 300;
	private static int k4 = 5000;
	
	// static 초기화 블록은 블록 기준 위에 있는 필드만 초기화해준다.
	// 초기화 블록 밑에 있는 필드값은 초기화되지 않는다.
	// m2의 값이 바뀌는 것은 m2는 선언만 해주었기 때문이다.
	// 선언만 한 것과 선언하고 값을 저장한 것의 차이가 있다.
	// 초기화 블록은 위치와 상관 없이 필드로 선언된 변수들의 값을 다 초기화한다.
	// 그러나 블록 밑에서 선언과 저장을 해버리면 초기화가 끝나고 저장하는 것이기 때문에 바뀌지 않는다.
	static {
		k3 = 20000;
		s2 = 50000;
		j2 = 40000;
		m2 = 60000;
	}
	
	static int m2;
	static int j2 = 400;
	public Ex15() {
		k3++;
	}
}
