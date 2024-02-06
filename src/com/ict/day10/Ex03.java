package com.ict.day10;

public class Ex03 {
	// 오버로딩(중복정의) : 한 클래스 안에서 같은 이름을 가진 메서드가 여러개 정의 되어 있는 것
	//				(반드시, 인자의 자료형이나 개수가 달라야 한다.)
	public double plus(int s1, int s2) {
		double sum = s1 + s2;
		return sum;
	}
	public double plus(double s1, int s2) {
		double sum = s1 + s2;
		return sum;
	}
	public double plus(int s1, double s2) {
		double sum = s1 + s2;
		return sum;
	}
	public double plus(double s1, double s2) {
		double sum = s1 + s2;
		return sum;
	}
	public double plus(String s1, String s2) {
		double k1 = Double.parseDouble(s1);
		double k2 = Double.parseDouble(s2);
		double sum = k1 + k2;
		return sum;
	}
	public double plus(String s1, int s2) {
		double k1 = Double.parseDouble(s1);
		double sum = k1 + s2;
		return sum;
	}
	public double plus(int s1, String s2) {
		double k1 = Double.parseDouble(s2);
		// 같은 클레스 안에서 같이 있는 메서드를 호출할 때는 메서드명만 입력해도 된다.
		double sum = plus(s1, k1);
		return sum;
	}
}
