package com.ict.day18;

import java.util.function.BinaryOperator;

// reduce(초기값, 수행할 기능)
// reduce(T indentity, BinaryOperator<T> accumulator)
// 수행할 기능에 BinaryOperator가 있기 때문에 클래스가 BinaryOperator를 상속받아야 쓸수 있다.
public class Ex09 implements BinaryOperator<String> {
	@Override
	// 인자는 2개지만 더 들어와도 알아서 모든 요소를 변환해서 비교한다.
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}else {
			return s2;
		}
		
	}

}
