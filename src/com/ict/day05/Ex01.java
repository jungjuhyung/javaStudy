package com.ict.day05;

public class Ex01 {
	public static void main(String[] args) {
		// swich case : 다중 if ~ else문과 같은 조건문
		// if문 조건식 boolean형, 즉 비교연산, 논리연산, boolean형 일때
		// switch문 인자값이 int 이하, char, String 일 때 사용
		//			long, 실수형일 때 사용 불가
		// 형식: swich(인자값 = int, char, String){
		//			case 조건값1 : 인자값과 조건값1이 같을때 수행할 문장 ; break;
		//			case 조건값2 : 인자값과 조건값2가 같을때 수행할 문장 ;
		//						 인자값과 조건값2가 같을 때 수행할 문장 ; break;
		//			case 조건값3 : 인자값과 조건값3이 같을때 수행할 문장 ; break;
		//			default : 조건값1,2,3 모두 같지 않을 때 수행할 문장;
		//		}
		// **주희사항 : break가 없으면 break를 만날때까지 밑에 모든 실행문을 실행한다.(case조건값을 넘어서도 실행됨)
		// break문의 역할은 현재 실행중인 범위({}블록)를 벗어나는 역할을 한다.
		// default는 생략 가능
		
		// int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일주스
		// if문 안에서 sysout을 쓰면 안좋지만 switch문과 비교하기 위해 사용
		int k1 = 3;
		String drink = "";
		if (k1 == 1) {
			System.out.println("카페모카");
		}else if (k1 == 2) {
			System.out.println("카페라떼");
		}else if (k1 == 3) {		
			System.out.println("아메리카노");
		}else if (k1 == 4) {
			System.out.println("과일쥬스");
		}
		
		switch (k1) {
		case 1: System.out.println("카페모카"); break;
		case 2: System.out.println("카페라떼"); break;
		case 3: System.out.println("아메리카노"); break;
		case 4: System.out.println("과일쥬스"); break;
		}
		System.out.println();
		
		// break 지우고 해보기
		switch (k1) {
		case 1: System.out.println("카페모카");
		case 2: System.out.println("카페라떼");
		case 3: System.out.println("아메리카노");
		case 4: System.out.println("과일쥬스");
		}
		
		// char k2이 A이면 아프리카, B이면 브라질, C이면 캐나다 나머지 한국
		char k2 = 'A';
		String name = "";
		switch (k2) {
		case 'A':
			name = "아프리카";
			break;
		case 'B':
			name = "브라질";
			break;
		case 'C':
			name = "캐나다";
			break;
		default:
			name = "한국";
			break;
		}
		System.out.println(k2 + "는 " + name + "입니다.");
		
		// char k2이 A거나a이면 아프리카, B거나b이면 브라질, C거나c이면 캐나다 나머지 한국
		// 조건이 범위형이면 switch case 제어문을 쓰기 어렵다.
		char k3 = 'C';
		String res = "";
		switch (k3) {
		case 'A':
			res = "아프리카";
			break;
		case 'a':
			res = "아프리카";
			break;
		case 'B':
			res = "브라질";
			break;
		case 'b':
			res = "브라질";
			break;
		case 'C':
			res = "캐나다";
			break;
		case 'c':
			res = "캐나다";
			break;
		default:
			res = "한국";
			break;
		}
		System.out.println(k3 + "는 " + res + "입니다.");
		System.out.println();
		
		// break를 이용하여 최대한 코드 줄이기(or 관계와 비슷)
		char k4 = 'c';
		String res2 = "";
		switch (k4) {
		case 'A':
		case 'a':
			res2 = "아프리카";
			break;
		case 'B':
		case 'b':
			res2 = "브라질";
			break;
		case 'C':
		case 'c':
			res2 = "캐나다";
			break;
		default:
			res2 = "한국";
			break;
		}
		System.out.println(k4 + "는 " + res2 + "입니다.");
		
		// String k5가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄 미국이면 워싱턴
		String k5 = "한국";
		String res3 = "";
		switch (k5) {
		case "한국":
			res3 = "서울";
			break;
		case "중국":
			res3 = "베이징";
			break;
		case "일본":
			res3 = "도쿄";
			break;
		case "미국":
			res3 = "워싱턴";
			break;
		default:
			break;
		}
		System.out.println(k5+"의 수도는 "+res3+"입니다.");
		
		// switch문 범위가 넓어지면 사용하지 말자(if문 사용하자)
		// int k6의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 F
		
		int k6 =93;
		String res4;
//		switch (k6){
//			case 100 : break;
//			case 99 : break;
//			case 98 : break;
//
//			default:
//				break;
//		}
		// 이렇게 할 수 있지만 if로 하면 편하다
		switch ((int)(k6/10)) {
		case 10:
		case 9: res4 = "A"; break;
		case 8: res4 = "B"; break;
		case 7: res4 = "C"; break;
		default: res4 = "F"; break;
		}
		System.out.println("결과 : " + res4);
		
	}
}
