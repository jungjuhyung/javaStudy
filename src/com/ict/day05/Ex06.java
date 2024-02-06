package com.ict.day05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 입력 : ");
			String res = "";
			int su = sc.nextInt();
			if (su % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println(su + "는 " + res + "입니다.");
			System.out.print("계속하시겠습니까? (1. yes, 2.no) : ");
			int res2 = sc.nextInt();
			if(res2 == 2) break;

		}

	}
}
