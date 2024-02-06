package com.ict.day11;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// set을 이용해서 맴버필드의 값을 넣지 않고
		// 생성자를 이용해서 넣기
		
		Ex06 coff = new Ex06("커피음료", 1500);
		//coff.sName("커피음료");
		//coff.sPrice(1500);
		
		Ex06 ion = new Ex06("이온음료", 2300);
		//ion.sName("이온음료");
		//ion.sPrice(2300);
		
		Ex06 cola = new Ex06("탄산음료", 2000);
		//cola.sName("탄산음료");
		//cola.sPrice(2000);
		
		Ex06 juice = new Ex06("과일음료", 1800);
		//juice.sName("과일음료");
		//juice.sPrice(1800);
		
		Ex06[] arr = {coff, ion, cola, juice};
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>> ");
		int input = scan.nextInt();
		int output = 0;
		int sec = -1;
		// 가격 오름차순 정렬
		Ex06 tmp = new Ex06("",0);
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].gPrice() > arr[j].gPrice()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		//자판기
		// 살 수 없는 제품을 선택하면 -계산이 된다. 이것을 해결해야함
		esc:while (true) {
			sec = -1;
			if (input < arr[0].gPrice()) {
				System.out.println("금액이 부족합니다.");
				output = input;
				break esc;
			}else {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i].gName()+"\t");
				}
				System.out.println("반환");
				System.out.println();
				for (int i = 0; i < arr.length; i++) {
					if (input >= arr[i].gPrice()) {
						System.out.print("o\t");
					}else {
						System.out.print("x\t");
					}
				}
				System.out.println();
				System.out.print("선택하세요 >> ");
				String drink = scan.next();
				for (int i = 0; i < arr.length; i++) {
					String tt = arr[i].gName();
					if (tt.contains(drink)) {
						sec = i;
					}
				}
				if (sec >= 0) {
					if (input-arr[sec].getPrice() <0) {
						System.out.println("금액이 부족합니다. 다시 선택해주세요");
						continue esc;
					}else {
						output = input - arr[sec].gPrice();						
					}
				}else {
					output = input;
					break esc;
				}
				System.out.println("남은 금액 : "+output);
				if (output >= arr[0].gPrice()) {
					System.out.println("계속 구매하시겠습니까? >>> (y/n) : ");
					String res = scan.next();
					if (res.equalsIgnoreCase("y")) {
						input = output;
						continue esc;
					}else if (res.equalsIgnoreCase("n")) {
						break esc;
					}
				}else {
					System.out.println("금액이 부족합니다.");
					break esc;
				}
			}
		}
		System.out.println("잔돈  : "+output);
		System.out.println("안녕히 가세요");
	}
}
