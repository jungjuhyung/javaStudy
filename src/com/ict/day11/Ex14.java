package com.ict.day11;

public class Ex14 {
	public static void main(String[] args) {
		// 객체 생성과 상관없이 호출 가능
		// 생성자는 su++, num++이다.
		System.out.println(Ex13.num);
		System.out.println(Ex13.play2());
		
		// static private age이기 때문에 사용불가
		// System.out.println(Ex13.age);
		
		// static 변수나 메서드는 static 메모리에 따로 저장된다.
		// 이는 heap 메모리처럼 새로 생성되는 것이 아닌 값이 계속 유지되며 저장된다.
		// instance처럼 객체생성과 동시에 새로 만들어지는 것이 아닌 static 메모리에 계속 저장되어있다.
		Ex13 t1 = new Ex13();
		System.out.println(t1.su);
		System.out.println(t1.num);
		System.out.println(Ex13.num);
		
		Ex13 t2 = new Ex13();
		System.out.println(t2.su);
		System.out.println(t2.num);
		System.out.println(Ex13.num);
		
		Ex13 t3 = new Ex13();
		System.out.println(t3.su);
		System.out.println(t3.num);
		System.out.println(Ex13.num);
		
		
	}
}
