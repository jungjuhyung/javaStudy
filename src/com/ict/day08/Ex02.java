package com.ict.day08;

import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		// 산언과 생성을 하나로
		// 자료형[][] 객체명 = new 자료형[1차원 배열 수][1차원 배열이 참조하는 배열의 수]
		// 고정 길이일때만 사용하는 형식으로 가변길이일 때 사용하면 runtime error 난다.
		System.out.println("고정 길이일때만 사용");
		char[][] ch = new char[3][2];
		ch[0][0] = 'a';
		ch[0][1] = 'A';
		
		ch[1][0] = 'b';
		ch[1][1] = 'B';
		
		ch[2][0] = 'c';
		ch[2][1] = 'C';
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		System.out.println("\n고정길이, 가변길이 모두 사용");
		// 고정, 가변 길이 모두 사용
		// 기본처럼 2차원 배열의 공간을 만들고 안에 값을 저장하는 것이 아닌
		// 2차원 배열의 빈공간을 만들고 미리 만들어진 1차원 배열의 주소값을 넣어주는 것이다.
		int[][] su = new int[3][2];
		
		int[] k1 = {10, 20};
		int[] k2 = {100, 200};
		int[] k3 = {1000, 2000};
		
		su[0] = k1;
		su[1] = k2;
		su[2] = k3;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		System.out.println("\n---------------------------");
		// 선언과 생성, 데이터 저장을 한번에 처리
		// int[] num ={100, 200, 300};
		int[][] num = {{1,2},{10,20},{100,200}};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		
		
	}
}
