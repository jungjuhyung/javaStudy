package com.ict.day09;

public class Ex15 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	// 반환형이 있는 메서드
	public String play01(String k1) {
		name = k1;
		return name;
	}
	// 지역변수 total이라 메서드 실행이 끝나면 사라진다.
	public int play02(int kor, int eng, int math) {
		int total = kor + eng + math;
		return total;
	}
	
	// 전역변수 sum이라 메서드 실행이 끝나도 class내 전역변수에 저장되어있다.
	public int play03(int kor, int eng, int math) {
		sum = kor + eng + math;
		return sum;
	}
	
	
}
