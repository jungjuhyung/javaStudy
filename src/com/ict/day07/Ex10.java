package com.ict.day07;

import java.util.Arrays;

public class Ex10 {
	public static void main(String[] args) {
		// 해당 배열에서 가장 큰 값과 가장 작은 값을 구하자
		int[] su = {-10, 0, 10, 25, -90, 95};
		
		// Arrays.sort() 오름차순으로 정렬
		// 인덱스값이 0이 가장 작은 것, su.length-1이 가장 큰값을 가지고 있다.
		Arrays.sort(su);
		System.out.println("가장 작은값 : " + su[0]);
		System.out.println("가장 큰값 : " + su[su.length-1]);
		
	}
}
