package com.ict.day02;

public class Ex08 {
	public static void main(String[] args) {
		// 산술 연산자 : +, -, *, /
		// 대상 : char, int, long, double, float
		// 		문자형, 정수형, 실수형
		int su1 = 19;
		int su2 = 4;
		int result = 0; // 결과를 저장하기 위한 변수, 따라서 0값을 저장
		result = su1 + su2;
		System.out.println("결과 : " + result);
		System.out.println("결과 : 9 + 4 = " + result);
		// "" 안에서는 변수로 작용하지 않고 문자열로 인식되기 때문에 아래와 같이 작성해야 변수가 변할 때마다 바뀔 수 있다.
		System.out.println("결과 : "+su1+"+"+su2+"="+result);
		
		// 빼기
		result = su1 - su2;
		System.out.println("결과 : " + result);
		System.out.println("결과 : "+su1+"-"+su2+"="+result);

		// 곱하기
		result = su1 * su2;
		System.out.println("결과 : " + result);
		System.out.println("결과 : "+su1+"*"+su2+"="+result);

		//나누기(int 자료형이기 때문에 나누었을 때 소수점이 표시되지 않고 이런 값은 나눈 몫으로 볼 수 있다.)
		result = su1 / su2;
		System.out.println("결과 : " + result);
		System.out.println("결과 : "+su1+"/"+su2+"="+result);

		// 이렇게 하면 이미 int와 int가 계산된 int값이 double로 저장되는 것이기 때문에
		// 프로모션 형변환이 되어서 .0만 붙어서 저장된다.
		double result2 = su1 / su2;
		System.out.println("결과 : " + result2);
		System.out.println("결과 : "+su1+"/"+su2+"="+result2);
		
		// 정수와 실수가 산술연산을 하면 결과는 실수가 된다.(큰 자료형과 작은 자료형을 계산하면 계산값이 큰자료형을 따른다)
		double result3 = (double)su1 / su2; // 또는 double result3 = (1.0*su1) / su2;
		// 1.0이 우선순위로 계산해야하는 것을 주의해야한다.
		System.out.println("결과 : " + result3);
		System.out.println("결과 : " + result3);
		System.out.println("결과 : "+su1+"/"+su2+"="+result3);
		
		// 나머지
		result = su1 % su2;
		System.out.println("결과 : "+su1+"%"+su2+"="+result);
	}
}
