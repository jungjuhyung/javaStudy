package com.ict.day06;

public class Ex02 {
	public static void main(String[] args) {
		// break 와 continue
		// break : 현재 위치의 블록(for, while, switch)을 탈출할 때 사용하는 예약어
		
		// continue : continue는 이하 수행문을 포기하고 다음회차로 진행하는 예약어(for, while)
		//		continue는 특정 회차, 특정 코드를 스킵할 때 많이 사용
		//		보통 for문은 증감식으로 돌아가고, while문은 조건식으로 간다/ 때문에 while에서는 잘 안씀
		// break와 continue는 보통 if문과 같이 쓴다.
		
		// 1~10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n-----------------");
		// 1~10까지 출력 6에서 break 사용(방법1:위에 사용)
		for (int i = 1; i < 11; i++) {
			if(i==6) break;
			System.out.print(i + " ");
		}
		System.out.println("\n-----------------");

		// 1~10까지 출력 6에서 break 사용(방법2 : 아래에 사용)
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if(i==6) break;
		}
		System.out.println("\n-----------------");

		// 1~10까지 출력 6에서 continue 사용(방법1:위에 사용)
		for (int i = 1; i < 11; i++) {
			if(i==6) continue;
			System.out.print(i + " ");
		}
		System.out.println("\n-----------------");

		// 1~10까지 출력 6에서 continue 사용(방법2 : 아래에 사용)
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if(i==6) continue;
		}
		System.out.println("\n-----------------");
		// 1~10까지 짝수만 출력하자(continue 이용)
		for (int i = 1; i < 11; i++) {
			if(i%2==1) continue;
			System.out.print(i+" ");
		}
		
	}
}
