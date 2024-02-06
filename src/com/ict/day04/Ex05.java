package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		// if ~ else문
		// 삼항 연산자와 비슷하게 처리
		// 즉, 조건식이 참일 때와 거짓일 때 가각 나눠서 처리한다.
		// 주의사항 : 한줄은 블록 생략 가능
		// if ~ else문은 자료형은 조건문 내에서 따로 설정이 가능하다.
		// if(조건식){
		//		조건식이 참일 때 실행;
		//		조건식이 참일 때 실행;
		//		조건식이 참일 때 실행;
		//		}
		// else{
		//		조건식이 거짓일 때 실행;
		//		조건식이 거짓일 때 실행;
		//		조건식이 거짓일 때 실행;
		//	}
		
		// int k1이 홀수인지 짝수인지 판별하자
		// 힌트 : 어떤 수를 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		int k1 = 8;
		String res = "";
		if (k1%2==0) {
			res="짝수";
		} else {
			res="홀수";
		}
		System.out.println("k1은 " + res + " 입니다.");
		
		// int k2가 60 이상이면 합격 아니면 불합격
		int k2 = 50;
		String res2 = "";
		if (k2 >= 60) {
			res2="합격";
		} else {
			res2="불합격";
		}
		System.out.println("k2은 " + res2 + " 입니다.");
		
		// k3가 1이면 가격에 0.1 할인(10%)한다.(얼마에 살 수 있나)
		int k3 = 2;
		int price = 1000;
		int res3 = 0;
		if (k3==1) {
			res3 = (int)(price*0.9);
		} else {
			res3= price;
		}
		System.out.println(res3 + "원에 살 수 있습니다.");
		
		// char k4 = 대문자인지, 대문자가 아닌지 판별하기
		char k4 = 'a';
		String res4 = "";
		if (k4>='A' && k4<='Z') {
			res4="대문자";
		} else {
			res4="대문자 아님";
		}
		System.out.println(k4 + "는 " + res4 + " 입니다.");
		
		// 근무시간이 8시간 까지는 시간당 9860이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		int time = 10;
		int gijun = 8;
		int dan = 9860;
		int res5 = 0;
		if (time>gijun) {
			res5 = dan*gijun+ (int)(dan*(time-gijun)*1.5);
		} else {
			res5= time*dan;
		}
		System.out.println(time + "시간동안 일한 금액은 " + res5 + "원 입니다.");
		
	}
}
