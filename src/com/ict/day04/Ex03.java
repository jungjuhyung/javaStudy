package com.ict.day04;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 삼항 연산자 : 삼항 연산자 안에 삼항 연산자가 존재
		// 중첩 삼항연산자 또한 변수와 조건의 값들의 자료형이 모두 같아야한다.
		// 형식) 자료형 변수 = (조건식1)? ((조건식2)? 참일 때 : 거짓일 때) : 거짓일 때 값;
		// 형식) 자료형 변수 = (조건식1)? 참일 때 값 : ((조건식2)? 참일 때 : 거짓일 때); **많이 사용함
		// 형식) 자료형 변수 = (조건식1)? ((조건식2)? 참일 때 : 거짓일 때) : ((조건식3)? 참일 때 : 거짓일 때);
		
		// int k1이 90 이상이면 "A학점", 80 이상이면 "B학점", 나머지는 "F학점"
		int k1 = 76;
		String res = (k1 >= 90)? "A학점" : ((k1 >= 80)? "B학점" : "F학점");
		System.out.println("결과 : " + res);
		
		// char k2가 대문자인지, 소문자 인지, 기타 문자인지 판별하자
		char k2 = 'd';
		
		String res2 = (k2 >= 'A' && k2 <= 'Z')? "대문자" : ((k2 >= 'a' && k2 <= 'z')? "소문자" : "기타 문자");
		System.out.println(k2 + " : " + res2);
		
		// int k3가 1 또는 3이면 남자, 나머지 여자
		int k3 = 1;
		String res3 = (k3 == 1 || k3 == 3)? "남자" : "여자";
		System.out.println(k3 + " : " + res3);
		
		
		// int k4가 1 또는 3이면 남자, 나머지 k4가 2 또는 4이면 여자
		int k4 = 3;
		String res4 = (k4==1||k4==3)? "남자":((k4==2||k4==4)? "여자":"외계인");
		System.out.println(k4 + " : " + res4);
		
		// int k5가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
		// int k5가 2이면 1900년대 태어난 여자, 4이면 2000년대 태어난 여자
		int k5 = 3;
		String res5 = (k5==1||k5==3)? ((k5 == 1)? "1900년대 남자":"2000년대 남자"):
			          ((k5==2||k5==4)? ((k5==2)? "1900년대 여자":"2000년대 여자"):"외계인");
		System.out.println(k5 + " : " + res5);
		
		// 두 수 중 큰 수를 구하자
		int su1 = 4;
		int su2 = 9;
		int res6 = (su1 > su2)? su1 : su2;
		System.out.println("결과 : " + res6);
		
		int res7 = Math.max(su1, su2);
		
		
		
	}
}
