package com.ict.day07;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		esc:while (true) {
			System.out.print("숫자 입력 : ");
			String su = scan.next();
			// 숫자가 아닌 것을 넣으면 오류 발생(나중에 try ~catch 처리)
			int s1 = Integer.parseInt(su);
			String res = "";
			if (s1%2 == 0) {
				res = "짝수";
			}else {
				res = "홀수";
			}
			System.out.println(su +"는 "+res+"입니다.");
			while (true) {
				System.out.print("계속 하시겠습니까? >>> yes or no : ");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("yes")) {
					continue esc;
				}else if (msg.equalsIgnoreCase("no")) {
					break esc;
				}else {
					System.out.println("다시 입력해주세요");
				}
				
			}
		}
		System.out.println("고생하셨습니다.");
		
		
	}
}
