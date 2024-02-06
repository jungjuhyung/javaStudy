package com.ict.day09;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 이김 3, 비김 4, 짐 5
		// 가위 바위 보 = 0,1,2
		Scanner scan = new Scanner(System.in);
		int res = 0;
		int win = 0;
		int total = 1;
		int[] ga = {4,5,3};
		int[] ba = {3,4,5};
		int[] bo = {5,3,4};
		esc:while (true) {
			System.out.print("내려는 가위바위보를 입력 >> ");
			int com = (int)(Math.random()*3);
			String user = scan.next();
			if (user.equals("가위")) {
				res = ga[com];
			}else if (user.equals("바위")) {
				res = ba[com];
			}else if (user.equals("보")) {
				res = bo[com];
			}else {
				System.out.println("다시입력해주세요");
				continue esc;
			}
			switch (res) {
			case 3:
				System.out.println("이겼습니다.");
				win++;
				break;
			case 4:
				System.out.println("비겼습니다.");
				break;
			case 5:
				System.out.println("졌습니다.");
				break;

			default:
				break;
			}
			while (true) {
				System.out.print("다시하시겠습니까? >>> (y/n)");
				String re = scan.next();
				if (re.equalsIgnoreCase("y")) {
					total++;
					continue esc;
				}else if (re.equalsIgnoreCase("n")) {
					System.out.println("수고하셨습니다.");
					break esc;
				}else {
					System.out.println("다시 입력해주세요.");
					continue;
				}
			}
			
		}
		System.out.println("총 "+total+"번 해서 "+win+"번 이겼습니다.");
		System.out.println("승률은 "+((int)(1000.0*win/total)/10.0)+"% 입니다.");
	}
}
