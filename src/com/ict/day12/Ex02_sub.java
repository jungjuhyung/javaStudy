package com.ict.day12;

import java.util.Random;

// Random 같이 공용 클래스는 객체를 생성해서 사용하는 경우가 많다.
// 아래와 같이 직접 상속시키면 다른 공용클래스를 상속시킬수 없어서
// 접근성 및 유연성이 떨어진다.
public class Ex02_sub extends Random {
	int su = 0;
	public void play() {
		su = nextInt(10)+1;
		System.out.println(su);
	}
}
