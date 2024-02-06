package com.ict.day07;

public class Ex06 {
	public static void main(String[] args) {
		// 배열 정렬하기(알고리즘)
		int[] su = {3,4,9,8,2,1,7,10,5,6};
		
		int tmp = 0;// 자리변경을 위한 빈공간 만들기
		for (int i = 0; i < su.length-1; i++) {
			for (int j = i+1; j < su.length; j++) {
				if (su[i] > su[j]) {// i > j는 오름차순, i < j는 내림차순
					tmp = su[i]; // 빈공간에 값1 저장
					su[i] = su[j]; // 값1공간에 값2 저장
					su[j] = tmp;// 값2공간에 빈공간에 저장된 값1 저장
				}
			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
	}
}
