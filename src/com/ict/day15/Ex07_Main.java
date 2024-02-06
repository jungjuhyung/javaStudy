package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Ex07> set1 = new HashSet<Ex07>();
		esc: while (true) {
			Ex07 ex07 = new Ex07();
			System.out.print("이름 : ");
			ex07.setName(scan.next());
			System.out.print("국어 : ");
			ex07.setKor(scan.nextInt());
			System.out.print("영어 : ");
			ex07.setEng(scan.nextInt());
			System.out.print("수학 : ");
			ex07.setMath(scan.nextInt());
			ex07.s_sum();
			set1.add(ex07);
			while (true) {
				System.out.print("계속하시겠습니까? (y/n) >>> ");
				String user = scan.next();
				if (user.equalsIgnoreCase("y")) {
					continue esc;
				} else if (user.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("제대로 입력해주세요");
				}
			}
		}
		// 순위
		for (Ex07 k : set1) {
			for (Ex07 l : set1) {
				if (k.getSum() == l.getSum()) {
					continue;
				} else if (k.getSum() < l.getSum()) {
					k.setRank(k.getRank() + 1);
				}
			}
		}
		// 정렬(hash는 위치값이 없기 때문에 정렬이 안됨)

		// 정렬과 출력을 한번에
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 1; i < set1.size()+1; i++) {
			for (Ex07 ex07 : set1) {
				if (ex07.getRank() == i) {
					System.out.print(ex07.getName() + "\t");
					System.out.print(ex07.getSum() + "\t");
					System.out.print(ex07.getAvg() + "\t");
					System.out.print(ex07.getHak() + "\t");
					System.out.print(ex07.getRank() + "\t");
					System.out.println();
				}
			}
		}

		// 출력
		Iterator<Ex07> it = set1.iterator();
		System.out.println("이름\t총점\t평균\t학점\t순위");
		while (it.hasNext()) {
			Ex07 ex07 = (Ex07) it.next();
			System.out.print(ex07.getName() + "\t");
			System.out.print(ex07.getSum() + "\t");
			System.out.print(ex07.getAvg() + "\t");
			System.out.print(ex07.getHak() + "\t");
			System.out.print(ex07.getRank() + "\t");
			System.out.println();

		}
	}
}
