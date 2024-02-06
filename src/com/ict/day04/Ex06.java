package com.ict.day04;

public class Ex06 {
	public static void main(String[] args) {
		// 다중 if문
		// 형식)
		// if(조건식1){
		//		조건식1이 참일 때 실행;
		//		조건식1이 참일 때 실행;
		//		조건식1이 참일 때 실행;
		//	}else if(조건식2){
		//		조건식1에는 거짓이면서 조건식2에는 참일때 실행;
		//		조건식1에는 거짓이면서 조건식2에는 참일때 실행;
		//		조건식1에는 거짓이면서 조건식2에는 참일때 실행;
		//	}else if(조건식3){
		//		조건식1,2에는 거짓이면서 조건식3에는 참일때 실행;
		//		조건식1,2에는 거짓이면서 조건식3에는 참일때 실행;
		//		조건식1,2에는 거짓이면서 조건식3에는 참일때 실행;
		//	}else{ // 마지막 else는 없어도 작동하긴 한다.
		//		조건식1,2,3이 모두 거짓일 때 실행; // 위를 뺀 나머지 개념
		//	}
		
		// int k1의 정수가 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F학점
		int k1 = 55;
		String res = "";
		if (k1 >= 90) {
			res = "A학점";
		} else if(k1 >= 80) {
			res = "B학점";
		} else if(k1 >= 70) {
			res = "C학점";
		} else {
			res = "F학점";
		}
		System.out.println(k1 + "점은 " + res + " 입니다.");
		
		// char k2가 대문자인지, 소문자인지, 숫자인지. 기타문자인지 판별
		char k2 = '+';
		String res2 = "";
		if (k2>='A' && k2<='Z') {
			res2 = "대문자";
		} else if(k2>='a' && k2<='z') {
			res2 = "소문자";
		} else if(k2>='0'&&k2<='9') {
			res2 = "숫자";
		} else {
			res2 = "기타문자";
		}
		System.out.println(k2 + "는 " + res2 + " 입니다.");
		
		// char k3가 A,a이면 아프리카 B,b이면 브라질 C,c이면 캐나다 나머지 한국
		char k3 = 'a';
		String res3 = "";
		if (k3=='A' || k3=='a') {
			res3 = "아프리카";
		} else if(k3=='B' || k3=='b') {
			res3 = "브라질";
		} else if(k3=='C' || k3=='c') {
			res3 = "캐나다";
		} else {
			res3 = "한국";
		}
		System.out.println(k3 + "는 " + res3 + " 입니다.");
		
		// menu가 1이면 카페모카 3500, 2이면 카페라때 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다
		// 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10% 포함, 친구와 같은 음료만 선택 가능)
		int k4 = 1;
		int cup = 2;
		int money = 10000;
		int moca = 3500;
		int rate = 4000;
		int ame = 3000;
		int fru = 3500;
		int res4 = 0;
		if (k4==1) {
			res4 = money-(int)(moca*cup*1.1);
		} else if(k4==2) {
			res4 = money-(int)(rate*cup*1.1);;
		} else if(k4==3) {
			res4 = money-(int)(ame*cup*1.1);;
		} else if(k4==4) {
			res4 = money-(int)(fru*cup*1.1);;
		} else {
			System.out.println("메뉴를 다시 선택해주세요");
		}
		System.out.println("잔돈은 "+ res4 + "원 입니다.");
		System.out.println();
		
		// 위 문제 다른방법
		int menu = 3;
		int input = 10000;
		int su = 2;
		int dan = 0;
		int total = 0;
		int vat = 0;
		int output = 0;
		String drink = "";
		
		if (menu == 1) {
			drink = "카페모카";
			dan = 3500;
		}else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		}else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		}else if (menu == 4) {
			drink = "과일쥬스";
			dan = 3500;
		}
		total = dan*su;
		vat = (int)(total*0.1);
		output = input - (total+vat);
		System.out.println("지불 금액 : " + input);
		System.out.println("선택 음료 : " + drink);
		System.out.println("음료 단가 : " + dan);
		System.out.println("음료 개수 : " + su);
		System.out.println("총 금액 : " + (total+vat));
		System.out.println("잔 돈 : " + output);
		
	}
}
