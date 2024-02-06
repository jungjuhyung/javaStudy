package com.ict.day09;

public class Ex04 {
	// 인스턴스 맴버필드
	String name = "홍길동";
	int kor = 80;
	int eng = 95;
	int math = 85;
	int total = 0;
	// 메서드() : 기능, 동작
	// ** 해당 메서드를 호출하면 실행 후 호출한 곳으로 되돌아 간다.
	// 메서드 형식 : [접근제한자] [메서드종류] 반환형 메서드이름([인자]){ 실행할 내용 } // []는 생략가능
	// 메서드는 일반적으로 [접근제한자] public을 쓰고 메서드 종류를 작성하지 않는다.
	// ** 반환형 : 호출한 곳으로 되돌아갈 때 가지고 가는 데이터의 자료형
	//			데이터가 없는 경우는 void라는 예약어를 사용
	//			반환형이 있는 메서드 맨 마지막 줄에는 반드시 return 예약어를 사용
	
	
	// 인스턴스 맴버 메서드
	// 전역 변수에 저장
	// void에는 return만 쓰면 오류 안남(값을 쓰면 오류남)
	public void play01() {
		System.out.println(2);
		total = kor + eng + math;
		System.out.println(3);
		
		return;
	}
	// 지역 변수에 저장
	public void play02() {
		int sum = kor + eng + math;
	}
	
	// void가 아닌 메서드에는 반드시 return을 써줘야함
	public int play03() {
		int sum = kor + eng + math;
		return sum; // void가 아니면 return을 통해 데이터를 반환받음
	}
	
	public int play04() {
		total = kor + eng + math;
		return 0; // total값을 던져줄 수도 있다.
	}
	
	
	
	
}
