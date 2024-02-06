package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 전체 몇 번을 실행해서 짝수가 몇번 나왔는지 표현하고 싶다.
		// 전체 횟수와 짝수 횟수, 짝수 확률(소수점 첫번째까지) 구하기
		int total = 1;
		int two = 0;
		esc:while (true) {
			// total++ 이 이 부분에 있어도 됨
			System.out.print("숫자를 입력해주세요 : ");
			int num = scan.nextInt();
			String res = "";
			if (num%2==0) {
				res = "짝수입니다.";
				two++;
			}else {
				res = "홀수입니다.";
			}
			System.out.println(num+"은(는) "+res+"입니다.");
			while (true) {
				System.out.print("계속하시겠습니까? >> 1.예, 2.아니요 : ");
				int res2 = scan.nextInt();
				if (res2==1) {
					total++;
					continue esc;
				}else if (res2==2) {
					break esc;
				}else {
					System.out.println("다시입력해주세요.");
				}
			}
		}
		System.out.println("수고하셨습니다.");
		double per = (int)(1000.0*two/total)/10.0;
		System.out.println("총 "+total+"번 입력하였고 짝수는 "+two+"번이며 짝수의 확률은 "+per+"% 입니다.");
		
		
		
		
		
		
	}
}
