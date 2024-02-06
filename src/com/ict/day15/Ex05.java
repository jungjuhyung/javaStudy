package com.ict.day15;

import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		// 배열 6자리 랜덤 채우기 (중복 안됨)
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int su = (int)(Math.random()*10);
			arr[i] = su;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
