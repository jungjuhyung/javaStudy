package com.ict.day14;

import java.util.Scanner;
// catch문으로 와서 catch문이 끝나면 아래 코드로 내려간다.
// catch문에도 continue , break를 사용할 수는 있으나 아래에 있는 코드에 주의하자
public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		esc:while (true) {
			try {
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
					
				} // 안 while
				
			} catch (NumberFormatException e) {
				System.out.println("문자를 입력하면 안됩니다.");
			}
			System.out.println("밖 while 전");
		} // 밖 while
		System.out.println("고생하셨습니다.");
	}
}
