package com.ict.day10;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 t = new Ex11();
		
		// 홍길동 이름을 둘리로 변경하자
		System.out.println(t.getName());
		t.setName("둘리");
		System.out.println(t.getName());
		t.setAge(15000);
	}
}
