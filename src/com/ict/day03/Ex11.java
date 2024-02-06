package com.ict.day03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 키보드로 입력 받는다.
		// 총점과 평균을 구하자
		// 출력은 이름, 총점, 평균만 출력하자(단, 평균은 소수점 두번째자리 까지 구하자)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		System.out.print("국어 점수를 입력해주세요 : ");
		double kr = scan.nextDouble();
		System.out.print("영어 점수를 입력해주세요 : ");
		double en = scan.nextDouble();
		System.out.print("수학 점수 입력해주세요 : ");
		double math = scan.nextDouble();
		
		int total = (int)(kr + en + math);
		double avg = (int)(total/3.0*100)/100.0;
		System.out.println(name + " 학생의 시험 점수 총합은 " + total+"점이고 평균은 " + avg + "점 입니다.");
		
	}
}
