package com.ict.day09;

public class Ex02 {
	public static void main(String[] args) {
		// 실행은 무조건 main메서드가 있어야한다.
		// Ex01에서 생성한 Class의 값들을 사용해보기
		// Ex01 클래스에 static 변수와 상수가 있다.
		// 객체 생성 없이 호출 할 수 있다.
		// Ex01.eng; 오류, 반환값이 있기 때문에 저장변수를 선언해야한다.
		int k1 = Ex01.eng;
		int k2 = Ex01.COMPUTER;
		System.out.println("eng : " + k1);
		System.out.println("com : " + k2);
		
		// Ex01 클래스를 객체로 만들자
		// 해당 클래스에 생성자가 없으면 무조건 기본생성자로 만든다.
		// 클래스이름() => 인자가 없는 생성자를 기본생성자라고 한다.
		Ex01 t = new Ex01();
		System.out.println(t);
		System.out.println(t.name);
		System.out.println(t.kor);
		System.out.println(t.MATH);
		
		System.out.println("--------------");
		// static은 객체생성 안하면 클래스이름으로 호출
		// 객체생성 하면 참조변수로도 호출할 수 있다.
		// static은 클래스이름으로 호출하는 것이 권장사항
		System.out.println(t.eng);
		System.out.println(t.COMPUTER);
		
		// 변수와 상수
		t.kor = 90; //Ex01 class의 80값을 90으로 바꿈
		System.out.println(t.kor);
		// t.MATH = 100; 오류, 상수는 오류남
		
		
	}
}
