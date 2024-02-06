package com.ict.day06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 숫자를 받아서 홀수인지, 짝수인지 출력하자
		esc:while (true) {
			System.out.print("숫자를 입력해주세요 : ");
			int num = scan.nextInt();
			String res = "";
			if (num%2==0) {
				res = "짝수입니다.";
			}else {
				res = "홀수입니다.";
			}
			System.out.println(num+"은(는) "+res+"입니다.");
			while (true) {
				System.out.print("계속하시겠습니까? >> 1.예, 2.아니요");
				int res2 = scan.nextInt();
				if (res2==1) {
					continue esc;
				}else if (res2==2) {
					break esc;
				}else {
					System.out.println("다시입력해주세요.");
					continue;//안넣어도 됨
				}
			}
		}
		System.out.println("수고하셨습니다.");
	
		
	}
}
