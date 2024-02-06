package com.ict.day07;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = 0;
		int l = 1;
		String[] name = new String[l];
		int[] kor = new int[l];
		int[] eng = new int[l];
		int[] math = new int[l];
		esc:while (true) {
			System.out.print("이름을 입력해주세요 >> : ");
			name[k] = scan.next();
			System.out.print("국어점수를 입력해주세요 >> : ");
			kor[k] = scan.nextInt();
			System.out.print("영어점수를 입력해주세요 >> : ");
			eng[k] = scan.nextInt();
			System.out.print("수학점수를 입력해주세요 >> : ");
			math[k] = scan.nextInt();
			while (true) {
				System.out.print("다른 사람도 입력하시겠습니까? >> y/n: ");
				String res = scan.next();
				if (res.equalsIgnoreCase("y")) {
					++l;
					++k;
					name = Arrays.copyOf(name,l);
					kor = Arrays.copyOf(kor,l);
					eng = Arrays.copyOf(eng,l);
					math = Arrays.copyOf(math,l);
					continue esc;
				}else if (res.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("다시 입력해주세요.");
			}	
		}
		int[] sum = new int[l];
		double[] avg = new double[l];
		String[] hak = new String[l];
		int[] rank = new int[l];
		Arrays.fill(rank, 1);
		
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
		// 랭크는 총점이 다 구해져야하기 때문에 따로 for문을 돌린다.
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
