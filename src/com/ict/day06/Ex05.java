package com.ict.day06;

public class Ex05 {
	public static void main(String[] args) {
		// continue와 continue label
		// continue : continue 이하 수행문을 포기하고 해당 for문의 증감식으로 이동(while문은 거의 안씀)
		// continue label : continue 이하 수행문을 포기하고, 레비블이 있는 반복문의 증감식으로 이동
		
		// 1~10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n------------------");
		
		// 1~10까지 출력(continue)
		for (int i = 1; i < 11; i++) {
			if(i==6) continue;
			System.out.print(i + " ");
		}
		System.out.println("\n------------------");
		
		// 1~10까지 출력(continue label)
		esc:for (int i = 1; i < 11; i++) {
			if(i==6) continue esc;
			System.out.print(i + " ");
		}
		System.out.println("\n------------------");
		System.out.println("다중 for문에서 continue label 사용");
		// 기본 다중 for문
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n------------------");
		
		// 기본 다중 for문(continue)
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) continue;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n------------------");
		
		// 기본 다중 for문(continue label)
		esc:for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) continue esc;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n------------------");
		
		
		
		
	}
}
