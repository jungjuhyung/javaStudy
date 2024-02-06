package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// 최상위 Collection의 하위 인터페이스 Set
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복불가, 특정기준으로 정렬이 안됨(들어간 순서대로 나오지 않음)
		// 		(단, TreeSet은 항상 오름차순을 유지한다.)
		//		주머니 구조라고 생각하자	
		// 형식 : HashSet<제네릭=객체타입=클래스> 참조변수 = new HashSet<[제네릭]>(); #[]는 생략가능
		// 		TreeSet<제네릭=객체타입=클래스> 참조변수 = new TreeSet<[제네릭]>(); #[]는 생략가능
		
		// 1. 컬렉션 생성
		// <E>에는 무조건 클래스가 들어가야한다.
		// 기본자료형은 안됨 그래서 기본자료형을 클래스로 만든 wrapper class를 넣어야함
		// int라면 Interger를 넣어야함
		// java 8.0부터 뒤의 <>는 생략가능
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Double> h2 = new HashSet<Double>();
		TreeSet<String> h3 = new TreeSet<String>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		
		// 2. 컬렉션에 객체 넣기(add(E e))
		Integer k1 = new Integer(10); // 오버로딩 생성자라서 int, String 둘다 가능
		Integer k2 = new Integer("10");
		
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		h1.add(50); // 이를 오토박싱이라고 한다. : 기본자료형을 객체로 변경
		// h1.add("60"); 생성자를 안쓰고 넣으면 String형은 넣을 수 없다. 생성자 안에서만 pause가 돌아가는 듯?
		
		// 중복된 값은 false로 찍히며 h1에는 나오지 않는다.
		System.out.println(h1.add(10));
		
		// 주소가 나오지 않고 들어있는 값이 나온다.
		// 들어간 순서대로 나오지 않고 무작위로 들어간다.
		// 들어가서 저장될 때는 그 순서가 유지되는 것 같다.
		System.out.println(h1);
		
		// 출력은 배열처럼 보이지만 배열이 아니기때문에 for문에서 일반적으로 사용불가
		//for (int i = 0; i < h1.size(); i++) {
			// System.out.println(h1[i]);
		//}
		// 개선된 for문은 사용 가능
		// for 자동완성에서 foreach 사용
		// : 기준 오른쪽은 컬렉션 및 배열, 왼쪽은 해당 자료형(제네릭)과 변수명을 쓴다.
		// 처음부터 끝까지 한개씩 증가하면서 꺼내서 k에 저장한다는 뜻이다
		// 특정 범위를 지정할 수 없고 무조건 처음부터 끝까지 작동한다.
		for (Integer k : h1) {
			System.out.println(k+1000);
		}
		
		System.out.println("--------------");
		// 컬렉션 Iterator는 개선된 while문을 사용해서 확인한다.
		// while 자동완성에서 두번째꺼 사용
		// hasNext()는 꺼낼 객체가 있는지 확인하며 boolean형 반환
		// next()는 해당 위치의 객체를 꺼내고 다음위치로 이동하는 메서드
		Iterator<Integer> it = h1.iterator(); // 컬랙션에 순서대로 접근하는 메서드
		while (it.hasNext()) {
			int s = it.next();
			System.out.println(s+5000);
		}
		// HashSet<Double> h2 = new HashSet<Double>();
		h2.add(10.0);
		h2.add(21.5);
		// h2.add(10); 객체이기 때문에 기본자료형의 프로모션이 안된다.
		double d1 = 3.1;
		double d2 = 10;
		
		
		
	}
}
