package com.ict.day03;

public class Ex03 {
	public static void main(String[] args) {
		// 논리연산자 : &&(and, 논리곱, 교집합), ||(or, 논리합, 합집합), !(not, 논리부정)
		// 논리연산자 대상은 boolean형(비교연산, 논리연산자, 논리형)
		// 논리연산자 결과는 boolean형, 즉 저장할 변수 선언은 boolean형이다.
		
		// &&
		// 주어진 조건들이 모두 참(true)일 때 결과는 참(true)
		// 조건들 중에 거짓(false)이 하나라도 있으면 결과는 거짓(false)
		// 조건들 중에 거짓을 만난 이후에는 연산을 하지 않음
		// 조건을 제한할 때 많이 사용(교집합)
		// and 조건을 이용하면 범위를 지정할 수 있다.
		// a>=10 && a<=20
		// a는 10부터 20까지의 범위를 의미한다.
		
		int su1 = 10;
		int su2 = 7;
		boolean res;
		// (su1 >= 7) && (su2>= 5); 저장할 변수를 넣지 않으면 오류
		// true = true&&true
		res = (su1 >= 7) && (su2>= 5);
		System.out.println(res);
		// false = trut&&false
		res = (su1 >= 7) && (su2<= 5);
		System.out.println(res);
		// false = false&&true		
		res = (su1 <= 7) && (su2>= 5);
		System.out.println(res);
		// false = false&&false		
		res = (su1 <= 7) && (su2<= 5);
		System.out.println(res);
		
		System.out.println();
		
		// int su1 = 10, int su2 = 7
		res = ((su1 =su1 + 2) > su2) && (su1 ==(su2=su2 + 5));	
		System.out.println("결과 : " + res);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2); // true이기 때문에 뒤에도 계산되서 12가 나온다.
		System.out.println();
		
		su1 = 10;
		su2 = 7;
		res = ((su1 =su1 + 2) < su2) && (su1 ==(su2=su2 + 5));	
		System.out.println("결과 : " + res);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2); // java에서는 이미 앞에서 false가 나왔기 때문에 계산을 안하고 7이 나온다.
		
		int su3 = 34;
		// su3값은 20~30 사이의 값을 가진다. false
		res = su3 >= 20 && su3 <= 30;
		System.out.println(res);
		
		// su3값은 20~40 사이의 값을 가진다. true
		res = su3 >= 20 && su3 <= 40;
		System.out.println(res);
		
		// char c1이 소문자이냐?
		char c1 = 'G';
		res = c1 >= 'a' && c1 <= 'z';
		System.out.println(res); //false
		
		c1 = 'm';
		res = c1 >= 'a' && c1 <= 'z';
		System.out.println(res); //true
		
	}
}
