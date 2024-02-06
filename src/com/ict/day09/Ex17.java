package com.ict.day09;

public class Ex17 {
	String name;
	int age;
	double result;
	int res;
	
	public void plus(int k1, int k2) {
		res = k1 + k2;
	}
	public void sub(int k1, int k2) {
		res = k1 -k2;
	}
	public int mul(int k1, int k2) {
		int mul1 = k1*k2;
		return mul1;
	}
	public double div(int k1, int k2) {
		double div1 = (int)(10.0*k1/k2)/10.0;
		return div1;
	}
	
}
