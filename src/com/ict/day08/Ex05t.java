package com.ict.day08;

import java.util.Scanner;

public class Ex05t {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생 수 :
		System.out.print("학생 수를 입력해주세요 >>> : ");
		int ning = scan.nextInt();
		int[][] arr = new int[ning][];
		// 번호, 국어, 영어, 수학
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호를 입력해주세요 >> : ");
			int num = scan.nextInt();
			System.out.print("국어점수를 입력해주세요 >> : ");
			int kor = scan.nextInt();
			System.out.print("영어점수를 입력해주세요 >> : ");
			int eng = scan.nextInt();
			System.out.print("수학점수를 입력해주세요 >> : ");
			int math = scan.nextInt();
			char hak = ' ';
			int sum = kor+eng+math;
			int avg = sum/3;
			if (avg >= 90) {
				hak = 'A';
			}else if (avg >= 80) {
				hak = 'B';				
			}else if (avg >= 70) {
				hak = 'C';
			}else {
				hak = 'F';
			}
			int res[] = {num, sum, avg, hak, 1};
			arr[i] = res;
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 총점, 평균, 학점
		
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) continue;
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		System.out.println(arr[0][4]);
		System.out.println(arr[1][4]);
		System.out.println(arr[2][4]);
		
		
		//정렬
		int[] tmp = new int[5]; // 이동할 때 사용할 빈 배열
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr[i].length; j++) {
				if (i==j) {continue;}
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j==3) {
					System.out.print((char)(arr[i][j]) + "\t");					
				}else {
					System.out.print(arr[i][j] + "\t");					
				}
			}
			System.out.println();
		}
		
		
		
	}
}
