package com.ict.day12;

public class Ex09_main {
	public static void main(String[] args) {
		// Ex09_Cale t = new Ex09_Cale(); 추상클래스를 이렇게 기존 형식으로 클래스를 만들면 오류난다.
		
		// new + ctrl + spacebar로 만들면 익명 내부 클래스 타입으로 만들수 있다.
		// 이러면 기존 형식 + 오버라이딩 된 메서드로 나온다.
		Ex09_Cale t2 = new Ex09_Cale() {
			
			@Override
			public void plus(double k1, double k2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void multiplication(double k1, double k2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void minus(double k1, double k2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void division(double k1, double k2) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
