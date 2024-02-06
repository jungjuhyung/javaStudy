package com.ict.day04;

public class Ex01 {
	public static void main(String[] args) {
		// 삼항 연산자
		// 형식 : 자료형 저장변수 = (조건식)? 참일 때 실행할 문장 : 거짓일 때 실행할 문장;
		// java의 삼항 연산자에서는 변수, 참값, 거짓값의 자료형이 같아야한다.
		
		// int k1이 홀수인지 짝수인지 판별하자
		// 힌트 : 어떤 수를 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		
		int k1 = 7;
		int res = k1 % 2;
		// 아래의 코드는 정확하게는 나머지가 1이면 홀수이고 나머지!!!가 짝수라는 뜻이다.
		// 수학에서는 1이면 홀수 0이면 짝수가 홀수 짝수의 정의이기 때문에 아래의 코드는 정확하게 짝수 홀수를 의미하는 코드는 아니다
		String result = (res == 1)? "홀수" : "짝수";
		System.out.println(k1 + " : " + result);
		
		// int k2가 60이상이면 합격, 아니면 불합격
		int k2 = 57;
		result = (k2 >= 60)? "합격":"불합격";
		System.out.println(k2 + " : " + result);
		
		// k3가 1이면 가격에 0.1 할인한다. (얼마에 살 수 있냐)
		int k3 = 1;
		int price = 1000;
		int result2 = (k3 == 1)? (int)(price-(price*0.1)):price; // 방법1
		result2 = (k3 == 1)? price-(price/10):price; // 방법2
		result2 = (k3 == 1)? (int)(price*0.9):price; // 방법3
		System.out.println(k3 + " : " + result2);
		
		// char k4 = 대문자인지, 대문자가 아닌지 판별하자.
		char k4 = 'Q';
		String res3 = (k4 >='A' && k4<='Z')? "대문자":"대문자 아님"; // 결과가 참과 그 이외이기 때문에 "소문자"가 아닌 "대문자 아님"으로 표기
		System.out.println(k4 + " : " + res3);
		
		// 근무시간이 8시간 까지는 시간당 9860이고
		// 8시간 초과한 시간만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간이다.
		// 얼마를 받아야 하는가?
		int k5 = 12;
		int dan =9860;
		int res4 = (k5<=8)? dan*8 : dan*8 + (int)(dan*1.5*(k5-8));
		System.out.println(k5 + "시간 : " + res4);
		
	}
}
