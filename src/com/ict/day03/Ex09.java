package com.ict.day03;

public class Ex09 {
	public static void main(String[] args) {
		// 카페모카 6500원이다.
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가?(단, 부가세 10% 포함)
		String coff = "카페모카";
		int cafe = 6500;
		int money = 15000;
		double buga = 10.0;
		int order = 2;
		int segm = (int)(buga*cafe*order/100);
		System.out.println(coff+" "+order+"잔을 구매하고 남은 잔돈은 "+(money - cafe*order -segm)+ "원" + " 입니다.");
		
		
	}
}
