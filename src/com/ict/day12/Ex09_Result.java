package com.ict.day12;

// 추상화는 이렇게 구체화하지 않고 골격만 만든 메서드를 자식 클래스에 상속시켜서
// 자식 클래스에서 재정의하라는 것이다.
// 팀장이 아래에 일을 맡길 때 사용 많이함
// 이렇게 하면 팀프로젝트에서 자료형이나 메서드명을 통일시킬 수 있다.
public class Ex09_Result extends Ex09_Cale {
	double result;
	@Override
	public void plus(double k1, double k2) {
		result = k1 + k2;
	}

	@Override
	public void minus(double k1, double k2) {
		
	}

	@Override
	public void multiplication(double k1, double k2) {
		
	}

	@Override
	public void division(double k1, double k2) {
		
	}

}
