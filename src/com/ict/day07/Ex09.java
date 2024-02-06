package com.ict.day07;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름을 입력해주세요 >> : ");
			name[i] = scan.next();
			System.out.print("국어 점수를 입력해주세요 >> : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 점수를 입력해주세요 >> : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 점수를 입력해주세요 >> : ");
			math[i] = scan.nextInt();
		}
		int[] sum = {0,0,0,0,0};
		double[] avg = {0.0,0.0,0.0,0.0,0.0};
		String[] hak = {"", "", "", "", ""};
		int[] rank = {1,1,1,1,1};
		
		// 총점, 평균(소수점 첫째자리), 학점 구하기
		for (int i = 0; i < rank.length; i++) {
			sum[i] = kor[i]+eng[i]+math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			}else if (avg[i] >= 80) {
				hak[i] = "B학점";
			}else if (avg[i] >= 70) {
				hak[i] = "C학점";
			}else {
				hak[i] = "F학점";
			}
		}
		// 랭크는 평균이 다 구해져야하기 때문에 따로 for문을 돌린다.
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (i==j) {
					continue;
				}else if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.print(rank[i]+"등"+ "\n");
		}
		
		
		
	}
}
