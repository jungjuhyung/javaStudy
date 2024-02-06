package com.ict.day04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 키보드로 값을 받아서 홀수, 짝수 판별하기
		System.out.print("숫자 입렵 : ");
		int k1 = scan.nextInt();
		String res = (k1%2 == 0)? "짝수" : "홀수";
		System.out.println(k1 + " : " + res);
		
		// 입력 받은 점수가 60점 이상이면 합격, 불합격
		System.out.print("점수 : ");
		int k2 = scan.nextInt();
		String res2 = (k2 >= 60)? "합격" : "불합격";
		System.out.println(k2 + "점 : " + res2);
		
		
		
		
	}
}
