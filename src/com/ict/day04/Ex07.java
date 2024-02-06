package com.ict.day04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>>>메뉴>>>>>>>>>>>");
		System.out.println(">>>   1.카페모카(3500)   >>>");
		System.out.println(">>>   2.카페라떼(4000)   >>>");
		System.out.println(">>>   3.아메리카노(3000)  >>>");
		System.out.println(">>>   4.과일쥬스(4000)   >>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.print("메뉴를 선택하세요. >>> ");
		int menu = scan.nextInt();
		System.out.print("몇 잔 주문하시겠습니까? >>> ");
		int su = scan.nextInt();
		System.out.print("입금할 금액 >>> ");
		int input = scan.nextInt();
		int total = 0;
		int vat = 0;
		int output = 0;
		int dan = 0;
		String name = "";
		if (menu == 1) {
			dan = 3500;
			name = "카페모카";
			total = dan*su;
			vat = (int)(total*0.1);
			output = input - (total+vat);
			if (output>=0) {
				System.out.println("주문하신 음료 : " + name);
				System.out.println("총 금액 : " + (total+vat));
				System.out.println("잔돈  : " + output);
			}else {
				System.out.println("총 금액 : " + (total+vat));
				System.out.println("금액이 부족합니다");	
				}
		}else if (menu == 2) {
			dan = 4000;
			name = "카페라떼";
			total = dan*su;
			vat = (int)(total*0.1);
			output = input - (total+vat);
			if (output>=0) {
				System.out.println("주문하신 음료 : " + name);
				System.out.println("총 금액 : " + (total+vat));
				System.out.println("잔돈  : " + output);
			}else {
				System.out.println("총 금액 : " + (total+vat));
				System.out.println("금액이 부족합니다");	
				}
		}else if (menu == 3) {
			dan = 3000;
			name = "아메리카노";
			total = dan*su;
			vat = (int)(total*0.1);
			output = input - (total+vat);
			if (output>=0) {
				System.out.println("주문하신 음료 : " + name);
				System.out.println("총 금액 : " + (total+vat));
				System.out.println("잔돈  : " + output);
			}else {
				System.out.println("총 금액 : " + (total+vat));
				System.out.println("금액이 부족합니다");	
				}
		}else if (menu == 4) {
			dan = 4000;
			name = "과일주스";
			total = dan*su;
			vat = (int)(total*0.1);
			output = input - (total+vat);
			if (output>=0) {
				System.out.println("주문하신 음료 : " + name);
				System.out.println("총 금액 : " + (total+vat));
				System.out.println("잔돈  : " + output);
			}else {
				System.out.println("총 금액 : " + (total+vat));
				System.out.println("금액이 부족합니다");	
				}
		}else {
			System.out.println("메뉴를 다시 선택해주세요");
		}
		
		
	}
}
