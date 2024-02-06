package com.ict.day09;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int user = 0;
		int total = 1;
		int win = 0;
		esc:while (true) {
			int com = (int)(Math.random()*3);
			System.out.print("내려는 가위바위보를 내주세요>>> : ");
			String k1 = scan.next();
			if (k1.equals("가위")) {
				user = 0;
			}else if (k1.equals("바위")) {
				user = 1;
			}else if (k1.equals("보")) {
				user = 2;
			}else {
				System.out.print("다시 입력해주세요.");
				continue esc;
			}
			if (user==0) {
				switch (com) {
				case 0:
					System.out.println("비겼습니다.");
					break;
				case 1:
					System.out.println("졌습니다.");
					break;
				case 2:
					System.out.println("이겼습니다.");
					win++;
					break;
				default:
					break;
				}
			}else if (user==1) {
				switch (com) {
				case 0:
					System.out.println("이겼습니다.");
					win++;
					break;
				case 1:
					System.out.println("비겼습니다.");
					break;
				case 2:
					System.out.println("졌겼습니다.");
					break;
				default:
					break;
				}
			}else if (user==2) {
				switch (com) {
				case 0:
					System.out.println("졌습니다.");
					break;
				case 1:
					System.out.println("이겼습니다.");
					win++;
					break;
				case 2:
					System.out.println("비겼습니다.");
					break;
				default:
					break;
				}
			}
			while (true) {
				System.out.print("계속하시겠습니까? (예/아니요) >>>");
				String res = scan.next();
				if (res.equalsIgnoreCase("예")) {
					total++;
					continue esc;
				}else if (res.equalsIgnoreCase("아니요")) {
					break esc;
				}else {
					System.out.println("다시입력해주세요");
					continue;
				}
				
			}
		}
		System.out.println("총 "+total+"번 중에 "+win+"번 이겼습니다.");
		System.out.println("승률" + (int)(10.0*win/total)/10.0+"% 입니다. 고생하셨습니다.");
		
	}
}
