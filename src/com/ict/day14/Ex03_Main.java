package com.ict.day14;

public class Ex03_Main {
	public static void main(String[] args) {
		// 별도로 내부클래스를 생성할 수 없다.
		// Inner02 t1 = new Inner02();
		
		// 맴버내부클래스 처럼 생성 할 수 없다.
		// Ex03 t1 = new Ex03();
		// Ex03.Inner02 t2 = t1.new Inner02();
		
		// 메서드 안에 존재하기 때문에 메서드를 생행해야 된다.
		Ex03 t1 = new Ex03();
		t1.play(); // 로컬 내부클래스가 생성되는 것이 아니라 생성 존건이 충족된것이다.
		// 여기서 메서드를 실행시키고 클래스 쪽으로 돌아가서 작성해야한다.
		
	}
}
