package com.ict.day03;

public class Ex05 {
	public static void main(String[] args) {
		// 대입 연산자 : 특정 값이나 객체의 주소를 변수에 기억시킬 때 사용
		// 변수를 호출하면 변수가 가지고 있는 데이터가 나온다.
		
		// 변수a = 데이터b 또는 변수b(변수를 저장할 때는 실제로는 그 값이 있는 주소를 저장한다)
		// a += b => a = a + b;
		// a -= b => a = a - b;
		// a *= b => a = a * b;
		// a /= b => a = a / b;
		// a %= b => a = a % b;
		
		int su1 = 7;
		su1 += 4; // su1 = su1 + 4; 와 같다.
		su1 -= 3; // su1 = su1 - 3; 과 같다.
		System.out.println(su1);
		
	}
}
