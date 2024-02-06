package com.ict.homework;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

//배열에 중복이 되지 않은 랜덤의 3개의 값을 가진 것을 생성(컴퓨터가 가지고 있는것)
// 0~9중 랜덤
//사람이 3개의 숫자를 이야기함, 모두 다 틀리면 아웃
//
//위치와 값이 같으면 스트라이크, 위치는 틀리지만 값이 있으면 볼
//
//3아웃이거나 10번 안에 못맞추면 패배, 10번 안에 맞추면 승리
public class Ex03m {
	public static void main(String[] args) {
		// 변수 선언 및 컴퓨터 넣는거
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int out = 0;
		int total = 1;
		int[] com = new int[3];
		int[] user = new int[3];
		com[0] = ran.nextInt(10);
		esc:for (int i = 1; i < com.length; i++) {
			com[i] = ran.nextInt(10);
			for (int j = i-1; j > -1 ; j--) {
				if (com[i]==com[j]) {
					i--;
					continue esc;
				}
			}
		}
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i]+" ");
		}
		// 사용자 및 비교
		System.out.println();
		while (true) {
			int strike = 0;
			int ball = 0;
			System.out.print("첫번째 숫자를 입력해주세요 : ");
			int user1 = scan.nextInt();
			user[0] = user1;
			System.out.print("두번째 숫자를 입력해주세요 : ");
			int user2 = scan.nextInt();
			user[1] = user2;
			System.out.print("세번째 숫자를 입력해주세요 : ");
			int user3 = scan.nextInt();
			user[2] = user3;

			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (i == j) {
						if (user[i] == com[j]) {
							strike++;
							continue;
						}
					} else if (user[i] == com[j]) {
						ball++;
					}
				}
			}
			if (strike == 0 & ball == 0) {
				out++;
			}
			System.out.println("총 "+total+"번 "+strike + "스트라이크 " + ball + "볼 " + out + "아웃");
			if (out==3|total==10) {
				System.out.println("패배하였습니다.");
				break;
			}else if (strike == 3) {
				System.out.println("승리하였습니다.");
				break;
			}else {
				total++;
				continue;
			}
		}
	}
}

