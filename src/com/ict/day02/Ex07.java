package com.ict.day02;

public class Ex07 {
	public static void main(String[] args) {
		// String : 문자열을 처리하기 위한 클래스이다.
		// String은 클레스를 자료형으로 사용하는 참조 자료형이나 기본 자료형처럼 사용할 수 있다.
		// 현재 단계에서는 일반 자료형처럼 사용하는 기본만 배우고 뒤에 클래스를 배울 때 심화로 배울 예정
		// 데이터에는 반드시 "내용"(쌍따옴표) 사용
		// String 이름 = "내용";
		
		// +연산자를 사용할 수 있다.
		// 실제로 더하는 것이 아니라 문자열과 문자열을 연결하는 역할을 한다.
		// +연산을 하면 무조건 결과는 문자열(String)이다.
		
		String s1 = "Hello";
		
		// String s2 = 10;
		// String s3 = 3.14;
		// String s4 = 'a';
		// 이들 전부 오류이다. 강제 형변환이 가능하지만 잘하지 않는다.
		
		String s5 = "a";
		System.out.println(s1);
		System.out.println(s5);
		
		// String에는 오직 +연산자만 쓸수 있다.
		String k1 = "1000";
		int k2 = 1000;
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k1+100);
		System.out.println(k2+100);
		
		// int k3 = 105 + "105"; 문자열을 더하면 어떠한 자료형에 더하던 문자열이 되기 때문에 int에 저장할 수 없다.
		// string은 다른 일반 자료형과 크기를 비교할 수는 없다.
		String k4 = 105 + "105";
		System.out.println(k4);
		
		int su1 = 20;
		int su2 =4;
		System.out.println(su1 + su2);
		System.out.println("합계 : " + su1 + su2);
		// 위의 경우 연산자의 우선순위가 없기에 왼쪽부터 +연산을 하게 되는데 그러면 계속 문자열끼리의 연산이 되기 때문에 204가 나온다.
		System.out.println("합계 : " + (su1 + su2));
		// 이렇게 괄호를 넣어서 연산의 우선 순위를 정해주면 정상적으로 나온다.
	}
}
