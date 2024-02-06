package com.ict.day18;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// 정수배열을 Stream으로 활용하기
		int[] arr = {1,2,3,4,5};
		int sumVal = Arrays.stream(arr).sum();
		// count의 반환형은 Long이다.
		int count = (int) Arrays.stream(arr).count();
		
		System.out.println("합계 : " + sumVal);
		System.out.println("갯수 : " + count);
	}
}
