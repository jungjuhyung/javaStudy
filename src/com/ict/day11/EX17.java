package com.ict.day11;

import java.util.Random;

public class EX17 {
	public static void main(String[] args) {
		// random 처리 방법
		
		// 1. Math.random()
		// 1-1. Math 전체 메서드가 static이므로 객체 생성없음
		//		Math.메서드이름([인자])
		//		Math.random() // 0.0 ~ 1.0 미만
		System.out.println(Math.random());
		// 1-2. 특정범위 : (int)(Math.random()*숫자) : 0 ~ (숫자-1)
		System.out.println((int)(Math.random()*5)); // 0 ~ 4
		
		// 2. Random Class
		// static 메서드가 아님으로 객체 생성함
		Random ran = new Random();
		
		// 각종 자료형의 난수 발생 : 자료형 범위 안에서 난수 발생
		System.out.println("boolean : " + ran.nextBoolean());
		System.out.println("int : "+ran.nextInt());
		System.out.println("long : "+ran.nextLong());
		// float, double는 0.1 ~ 1.0미만의 범위에서 나옴 => Math.random()과 같음
		System.out.println("float : "+ran.nextFloat());
		System.out.println("double : "+ran.nextDouble());
		
		// 특정 범위 안에서 난수 발생
		// 특점 범위는 무조건 0 ~ 범위 전까지 난수 발생(정수)
		
		// 1. .nextInt(범위) : 0 ~ 범위 전까지 난수 발생
		// 2. (int)(nextDouble()*범위) : 0 ~ 범위 전까지 난수 발생 => Math.random()과 같음
		System.out.println(ran.nextInt(7)); // 0~6
		System.out.println((int)(ran.nextDouble(7))); // 0~6
		
		
		
	}
}
