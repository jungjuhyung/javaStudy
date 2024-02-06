package com.ict.day05;

import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩(다중) for문 : for문 안에 또 다른 for문이 존재하는 것
		for (int i = 0; i < 4; i++) {
			System.out.println("명령문1");
			for (int j = 0; j < 6; j++) {
				System.out.println("i="+i+", j="+j);
			}
			System.out.println("명령문2");
		} 
		System.out.println("--------------------------");
		// 구구단 세로로 쭉
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		System.out.println("--------------------------");
		//가로로 구구단 일렬
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		// 세로로 구구단 일렬
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		// 다중for문을 이용한 0탑 쌓기
		for (int i = 0; i < 4; i++) {
			for (int l = 0; l < 4; l++) {
				System.out.print(0);
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		// 규칙있는 1이 들어간 0탑 쌓기
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i==j) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		
		
	}
}
