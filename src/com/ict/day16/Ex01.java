package com.ict.day16;

import java.util.Iterator;
import java.util.Stack;

/*
 	최상위 Collection interface를 상속받은
	List 인터페이스 : 삽입, 삭제, 추가가 자유롭다.
					크기를 미리 지정하지 않아도 된다.
	구현한 클레스 : Stack, Vector, ArrayList
	구조 : LIFO(Last In First Out)
			마지막에 들어온 데이터가 먼저 나가는 형태
	추가 메서드 : add, push, addElement
	삽입 메서드 : add(index, E)
	pop : 맨 위에 존재하는 객체 반환 및 삭제
	peek : 맨 위에 존재하는 객체 반환 및 삭제 안됨
	contains(Element e) : boolean => 포함여부 boolean형 반환
	search : 검색(오른쪽 1부터)
	**indexOf : 검색(왼쪽 0부터) => 배열처럼 왼쪽부터 0시작
	elementAt(index) : 해당 요소 반환
	**get(index) : 해당 요소 반환
	firstElement() : 맨 처음 요소 반환
	LastElement() : 맨 마지막 요소 반환
	setElement(Element, index) : 해당 위치의 데이터와 치환
 */


public class Ex01 {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		// 삽입 및 추가
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		
		
		s1.add(1, "고길동"); // 해당 인덱스 자리에 들어가고 기존 데이터를 포함한 뒤는 한칸씩 밀림
		s1.add(3, "희동이");
		System.out.println(s1);
		
		// 마지막 객체 보기 : pop(삭제), peek, LastElement
		String res = s1.peek();
		System.out.println("가지고 온 객체 : "+res);
		System.out.println(s1);
		
		res = s1.pop();
		System.out.println("가지고 온 객체 : "+res);
		System.out.println(s1);
		
		res = s1.lastElement();
		System.out.println("가지고 온 객체 : "+res);
		System.out.println(s1);
		
		if (s1.contains("둘리")) {
			// 위치값 검색
			System.out.println(s1.indexOf("희동이")); // 3, 배열처럼 왼쪽부터 0시작
			System.out.println(s1.search("희동이")); // 1, search는 오른쪽부터 1시작
			// 위치값을 이용해서 Element 반환
			System.out.println(s1.get(1));
			System.out.println(s1.elementAt(1));
			
			// 처음 마지막 요소 반환
			System.out.println(s1.firstElement());
			System.out.println(s1.lastElement());
		}else {
			System.out.println("존재하지 않습니다.");
		}
		// 고길동을 도우너로 변경하자
		if (s1.contains("고길동")) {
			s1.setElementAt("도우너", s1.indexOf("고길동"));
		}
		System.out.println(s1);
		
		// 중복 가능
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		System.out.println(s1);
		System.out.println(s1.size());
		
		// 하나씩 꺼내기(개선 for문)
		for (String k : s1) {
			System.err.println(k+"님 !!!");
		}
		System.out.println("------------");
		// 하나씩 꺼내기(iterator)
		Iterator<String> it = s1.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str+"짱 ^^");
			
		}
		System.out.println("------------");
		// 하나씩 꺼낸다(pop을 이용함, 마지막부터 나옴, LIPO)
		while (! s1.isEmpty()) {
			String k = s1.pop();
			System.out.println(k+", 크기는 "+s1.size()+"이다.");
		}
		
	}
}
