package com.ict.day09;

public class Ex05 {
	public static void main(String[] args) {
		// Ex04 클래스 확인하기
		// Ex04 클래스를 객체로 만들어야
		// Ex04가 가지고 있는 필드와 메서드를 사용할 수 있다.
		// Ex04 클래스를 객체로 만들기
		Ex04 t = new Ex04();
		// 필드값 불러오기
		System.out.println(t.name);
		System.out.println(t.name);
		
		// Ex04의 play01 메서드를 호출
		// play01이 void이기 때문에 데이터를 가져오지 않는다.
		// 메서드가 되돌아오는 것을 확인
		// total은 Ex04의 전역변수
		System.out.println(1);
		System.out.println(t.total);
		t.play01();
		System.out.println(4);
		System.out.println(t.total);
		
		// Ex04의 play02 메서드 호출
		// play02의 sum은 지역 변수이다.
		// sum은 메서드를 호출할 때 생성되고 동작이 종료되면 사라진다.
		// System.out.println(t.sum); 오류, 지역변수 sum이기 때문이다
		
		// Ex04의 play03 메서드 호출
		// play03은 반환값이 있음
		// 반환값이 있으면 무조건 받아서 저장해야한다.
		int k = t.play03();
		System.out.println(k);
		
		
	}
}
