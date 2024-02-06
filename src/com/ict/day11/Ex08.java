package com.ict.day11;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		Ex07[] arr = new Ex07[su];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = scan.next();

			System.out.print("국어 : ");
			int kor = scan.nextInt();

			System.out.print("영어 : ");
			int eng = scan.nextInt();

			System.out.print("수학 : ");
			int math = scan.nextInt();

			Ex07 p = new Ex07(name, kor, eng, math);
			// p.process();

			arr[i] = p;
		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				} else if (arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		// 정렬
		// Ex05 tmp = new Ex05(); 이렇게 class 참조변수를 하나 만들어서 빈공간으로 사용할 수도 있다.
		Ex07 tmp = new Ex07();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		// 배열에 저장된 class는 1차원 배열에 class주소가 저장되어있으므로
		// 배열명[1차원 배열위치값]. 이 각각 class객체를 참조할 수 있다.
		System.out.println("이 름\t총 점\t평균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name + "\t");
			System.out.print(arr[i].sum + "\t");
			System.out.print(arr[i].avg + "\t");
			System.out.print(arr[i].hak + "\t");
			System.out.print(arr[i].rank + "\n");
		}
	}
}
