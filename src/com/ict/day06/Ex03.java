package com.ict.day06;

public class Ex03 {
	public static void main(String[] args) {
		// 다중 for문에서 break와 continue
		// 모든 for문을 빠져나오는 것이 아닌 감싸여있는 하나의 for문을 빠져나온다.
		
		// 기본 다중for문
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n----------------");
		// 다중 for문 break(조건 : i ==3)
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==3) break;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n----------------");
		
		// 다중 for문 break(조건 : j ==3)
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) break;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n----------------");
		
		// 다중 for문 continue(조건 : i ==3)
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==3) continue;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n----------------");
		
		// 다중 for문 continue(조건 : j ==3)
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) continue;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("\n----------------");
		
		
		
	}
}
