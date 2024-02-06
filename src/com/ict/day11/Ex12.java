package com.ict.day11;

public class Ex12 {
	public static void main(String[] args) {
		// this는 객체 내부 안에서 해당 객체 자신을 뜻한다.
		// 그래서 생성자 안에 있는 this 출력과
		// 참조변수가 참조하는 객체 주소가 같다.
		// 그래서 객체 내에서 this.을 사용해서 객체 내 데이터를 참조할 수 있다.
		// 그렇기 때문에 모든 전역변수에는 this를 붙일 수 있다.
		// 파이썬으로 넘어가면 무조건 this를 붙여야한다.
		Ex11 ex11= new Ex11();
		System.out.println("main : "+ex11);
		
		//Ex13 static 사용 가능 확인
		System.out.println(Ex13.num);
	}
}
