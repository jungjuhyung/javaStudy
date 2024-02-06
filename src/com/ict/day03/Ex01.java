package com.ict.day03;

public class Ex01 {
	public static void main(String[] args) {
		// 증감 연산자 : 1 증가 또는 1 감소 하는 연산자
		// ++(--) 변수 : 현재 변수가 가지고 있는 값에 1을 증가(감소)하고 나머지를 실행(우선 순위가 1순위임)
		// 변수 ++(--) : 현재 변수를 가지고 실행 한 후 그 명령 구문이 끝날 때(;) 1을 증가(감소)한다.
		
		int su1 = 10;
		int su2 = 10;
		System.out.println(++su1);
		System.out.println(su2++);
		// 이렇게 되면 println이 실행되고 +1이 되기 때문에 10으로 보임
		System.out.println(su1);
		System.out.println(su2);
		// 위의 su2에서 ;이후 +1이 되었기 때문에 11로 나옴
	}
}
