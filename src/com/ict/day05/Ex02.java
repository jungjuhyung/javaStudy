package com.ict.day05;

import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리한다.
		//		   조건식이 true일 때 실행, 거짓이면 실행하지 않음
		// 형식)
		// for(초기식; 조건식; 증감식){
		//		조건식이 참일때 실행할 문장;
		//		조건식이 참일때 실행할 문장;
		//	}
		
		// 1. for문을 처음 만나면 초기식을 이동
		// 2. 초기식을 가지고 조건식으로 이동
		// 3. 조건식이 true이면 실행, false이면 실행하지 않음
		// 4. true일 때 실행하다가 for문의 끝을 만나면 다시 증감식으로 간다.
		// 5. 증감식에서 증가하거나 감소 후 다시 조건식으로 간다.
		// 6. 3번으로 돌아가서 반복
		
		// java에서는 블록 안에서 변수를 만들고 선언하면 해당 블록에서만 사용 가능
		// 해당 블록을 벗어나면 변수는 사라진다.
		// for문의 초기식에서 변수를 만들어 사용한다.
		// 초기식에서 만든 변수는 for문을 벗어나면 사용할 수 없다.(즉, 사라진다.)
		
		for (int i = 0; i < 10; i++){ //증감연산자가 뒤에 있기 때문에 증감식때는 0이다.
			System.out.println(i);
			System.out.println("hi");
			System.out.println("안녕하세요");
		}
		// System.out.println(i); for문 밖을 벗어났기 때문에 i를 사용할 수 없다.
		int k1;
		for (k1 = 0; k1 < 10; k1++) {
			System.out.println("hi");
		}
		System.out.println(k1); // for문은 증감식으로 돌아가서 조건식에서 false일 때 나오기 때문에
		// 밖에서 선언한 k1이 for문 밖에서 출력하면 10이 나오고 for문 내에서는 0~9까지 true로 반복한다.
		
		System.out.println("-------------------");
		//10~20 출력
		for (int i = 10; i < 21; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		// 10~20까지 짝수만 출력
		for (int i = 10; i < 21; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("-------------------");
		// 10~20까지 짝수만 출력(다른 방법)
		for (int i = 10; i < 21; i=i+2) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		// 10~20까지 홀수만 출력
		for (int i = 10; i < 21; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println("-------------------");
		// 10~20까지 홀수만 출력(다른방법)
		for (int i = 11; i < 20; i=i+2) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		// 5단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * " + i + " = " +(5*i));
		}
		System.out.println("-------------------");
		//0000
		//0000
		//0000
		//0000 찍기
		for (int i = 0; i < 4; i++) {
			System.out.println("0000");
		}
		System.out.println("------------------");
		// 다른방법2
		for (int i = 0; i < 4; i++) {
			for (int l = 0; l < 4; l++) {
				System.out.print(0);
			}
			System.out.println();
		}
		System.out.println("----------------");
		// 다른방법3
		for (int i = 1; i < 17; i++) {
			System.out.print(0);
			if (i%4 ==0) {
				System.out.println();
			}
		}
		// 0~10의 누적합(합계 구하기)
		int sum = 0; // 이전 값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum = sum + i; // 기억값 = 이전기억값 + 현재값
		}
		System.out.println("누적합 : " + sum);
		
		// 0~10 홀수의 합계, 짝수의 합계를 각각 구하자
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < 11; i++) {
			if (i%2==0) {
				sum2 = sum2 + i;
			}else if (i%2==1) {
				sum3 = sum3 + i;
			}
		}
		System.out.println("짝수의 합 : " + sum2);
		System.out.println("홀수의 합 : " + sum3);
		
		// 7! (7*6*5*4*3*2*1)
		int total = 1;
		for (int i = 1; i < 8; i++) {
			total = total * i;
		}
		System.out.println("7! = " + total);
		
		// 7! (7*6*5*4*3*2*1) 감소로 풀기
		int mul = 1;
		for (int i = 7; i > 0; i--) {
			mul = mul * i;
		}
		System.out.println("7! = " + mul);
		
		
	}
}
