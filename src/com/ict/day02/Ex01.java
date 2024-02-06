package com.ict.day02;

public class Ex01 {
	public static void main(String[] args) {
		// 주석(//) : 컴파일러는 해당 줄을 무시하고 사람에게는 보이는 줄(해당 코딩의 설명글을 표시하는 줄)
		// 논리형 : boolean으로 사용, true 또는 false를 말한다.
		
		// 변수와, 상수는 데이터 하나를 저장하는 영역이다.
		// 변수는 같은 저장 영역에 다른 값이 들어오면 기존 값을 삭제하고 최신 값을 저장한다.
		// 상수는 한번 저장되면 다른 값이 들어와도 기존 값을 유지한다.
		// 변수 앞에 어떤 데이터를 저장할 수 있는지 맨 처음에 표시한다.(선언)
		// 한번 선언한 변수는 선언한 자료형만 담게 된다.
		// 선언은 보통 최초 한번만 한다.
		
		// 논리형을 변수에 기억 시키는 방법
		// 1. boolean 변수이름; (선언)
				//데이터가 변수에 저장된다 라는 뜻
				//boolean 형에서 사용할 수 있는 데이터는 true 또는 false이다.
		// 2. 변수이름 = 데이터(표현범위); (저장=기억=대입)
		boolean b1 ;
		b1 = true ;
		// 변수를 호출하면 변수 안에 있는 데이터가 나온다.
		System.out.println(b1);
		// false를 다시 b1에 저장하자
		b1 = false ;
		System.out.println(b1);
		
		// 다른 변수 b2 만들기
		// 자료형(boolean) 변수이름 = 데이터;
		// 선언과 저장을 한번에 
		boolean b2 = true;
		// b2 내용 보기
		System.out.println(b2);
		// b2 데이터를 false로 변경하기
		b2 = false;
		// b2 내용보기
		System.out.println(b2);
		
		//  boolean은 true, false 이외에는 오류가 발생한다.
	}
	
}
