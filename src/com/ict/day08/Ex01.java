package com.ict.day08;

public class Ex01 {
	public static void main(String[] args) {
		// 다차원 배열 : 1차원 배열이 여러개 모인 것
		// 종류 : 기본 자료형 배열, 객체형 배열(참조 자료형 배열)
		// 		고정길이 배열, 가변길이 배열
		// 고정길이 배열
		// 1. 선언 : 자료형[][] 객체명 또는 자료형 객체명[][]
		int[][] su;
		
		// 2. 생성 : 이름 = new 자료형[1차원 배열 크기][1차원배열이 참조하는 배열의 크기]
		su = new int[2][3];
		
		// 3. 데이터 저장
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		
		su[1][0] = 100;
		su[1][1] = 200;
		su[1][2] = 300;
		
		// 주소확인
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		
		// 출력
		System.out.println(su[0][0]);
		System.out.println(su[0][1]);
		System.out.println(su[0][2]);

		System.out.println(su[1][0]);
		System.out.println(su[1][1]);
		System.out.println(su[1][2]);
		System.out.println("\n----------------------");
		// 다중 배열에서 2차원 이상의 배열의 크기를 설정해줄 때는 객체명[i].length로 설정해주면 고정형, 가변형 상관없이 사용가능
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		
		
		
		
	}
}
