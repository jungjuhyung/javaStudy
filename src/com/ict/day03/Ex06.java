package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가
		// 국어 90, 영어 80, 수학 80 이다.
		// 총점과 평균을 구하자
		// 출력은 이름, 총점, 평균만 출력하자(단, 평균은 소수점 첫째자리 까지 구하자)
		
		String name = "홍길동";
		double kr = 90;
		double en = 80;
		double mat = 80;
		// 아래 총합, 평균을 구하는 것을 요구사항=처리=비지니스로직 이라고 한다.
		double sum = kr + en + mat;
		double mean = sum/3;
		// 자릿수를 바꾸고 정수->실수로 함으로써 다시 나온다.
		double mean2 = (int)(mean*10)/10.0;
		System.out.println("이름 : " + name + ", " + "총점 : " + (int)sum + ", " + "평균 : " + mean2);
		
		// 소수점 2번째까지 표시(미국 달러의 0.01센트와 비슷)
		double mean3 = (int)(mean*100)/100.0;
		System.out.println("이름 : " + name + ", " + "총점 : " + (int)sum + ", " + "평균 : " + mean3);
		
		// 곱하고 나누기의 순서를 바꿔서 일의 자리 숫자 없애기(버림)(한국돈의 10원 단위와 비슷)
		int k1 = 198745;
		int k2 = k1/10*10;
		System.out.println(k2);		
		
	}
}
