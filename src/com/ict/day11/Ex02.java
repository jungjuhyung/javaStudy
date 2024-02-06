package com.ict.day11;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 객체 생성
		// Ex01에 생성자가 없기 때문에 기본 생성자를 사용
		// Ex01의 생성자를 만들자
		// 메서드와 같이 가서 작동하고 돌아온다.
		// 반환형이 없기 때문에 돌려받는 데이터가 없다.
		// 생성자가 없으면 기본생성자로 실행
		// 생성자가 있으면 무조건 해당 생성자 양식을 따라야함
		// 생성자가 여러개이면(기본 생성자 포함) 인자에 따라 찾아감
		Ex01 ex01 = new Ex01("도우너", 11);
		
		// 이름, 나이, 주소 출력
		System.out.println(ex01.getName());
		System.out.println(ex01.getAge());
		System.out.println(ex01.getAddr());
		
		// 이름을 임꺽정, 나이를 34, 주소를 함경도
		ex01.setName("임꺽정");
		ex01.setAge(34);
		ex01.setAddr("함경도");
		System.out.println(ex01.getName());
		System.out.println(ex01.getAge());
		System.out.println(ex01.getAddr());
	
	}
}
