package com.ict.day06;

import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		// break와 break label
		// break : 현재 위치의 블록을 탈출
		// break label : 레이블이 지정한 블록을 탈출

		// label 지정 : 반복문 앞에 '이름' 붙이면 된다.

		// 1~10 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------");
		// 1~10 출력(break)
		for (int i = 1; i < 11; i++) {
			if (i == 6) break;
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------");

		// 1~10 출력(break label)
		// 반복문 앞에 label이름을 붙이고 이름 뒤에 :을 붙인다.
		// for문에는 break label를 붙일 이유가 없다.
		exit: for (int i = 1; i < 11; i++) {
			if (i == 6) break exit;
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------");
		System.out.println("다중 for문에서 break label 사용하기");
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n---------------------");
		// 다중 for문에서의 일반적인 break
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) break;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n---------------------");
		// 다중 for문에서의 break label
		exit:for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) break exit;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n---------------------");
		
		

	}
}
