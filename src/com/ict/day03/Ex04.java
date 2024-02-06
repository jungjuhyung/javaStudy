package com.ict.day03;

public class Ex04 {
	public static void main(String[] args) {
		// ||(or, 논리합, 합집합)
		// 주어진 조건들 중에서 하나라도 참(true)이면 결과는 참(true)
		// 참(true)을 만나면 이후 연산을 하지 않는다.
		// 조건을 늘릴 때 많이 사용(합집합)
		int su1 = 10;
		int su2 = 7;
		boolean res;
		
		// true = true||true
		res = (su1 >= 7) || (su2>= 5);
		System.out.println(res);
		
		// true = true||false
		res = (su1 >= 7) || (su2<= 5);
		System.out.println(res);
		
		// true = false||true
		res = (su1 <= 7) || (su2>= 5);
		System.out.println(res);
		
		// false = false||false
		res = (su1 <= 7) || (su2<= 5);
		System.out.println(res);
		
		System.out.println();
		
		su1 = 10;
		su2 = 7;
		res = ((su1 = su1 + 2) > su2) || (su2 == su2 + 5);
		System.out.println("결과 : " + res); // true
		System.out.println("su1 : " + su1); // 12
		System.out.println("su2 : " + su2); // 선행조건의 결과가 true이기 때문에 뒤의 su2+5를 계산하지 않고 7이 나온다.
		
		// not(!, 논리부정)
		// 주어진 논리값을 반대로 출력
		// true => false, false => true
		// 이러한 것을 "토글"이라고 한다. ex) tv같은 것의 전원on/off할 때 사용(같은 행동이지만 true/false가 반복됨)
		res = true;
		System.out.println(res); // true
		System.out.println(!res); // false
		System.out.println(!!res); //true
		System.out.println(!!!res); // false
		
	}
}
