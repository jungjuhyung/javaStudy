package com.ict.day17;

// 두 개의 문자열을 받아서 하나의 문자열로 만들기
interface Ex10 {
	public void makeString(String s1, String s2);
}
// 일반적인 방법
// 일반 클래스가 인터페이스를 상속 받아서 오버라이딩 하는 것

class Ex10_1 implements Ex10{
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
	}
}