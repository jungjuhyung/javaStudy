package com.ict.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/*
	최상위 Collection interface를 상속받은
	List 인터페이스 : 삽입, 삭제, 추가가 자유롭다.
					크기를 미리 지정하지 않아도 된다.
	구현한 클레스 : Stack, Vector, ArrayList
	Vector : 멀티 스레드에서 동기화 지원
	**ArrayList : 멀티 스레드에서 동기화 미지원
*/
public class Ex02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Vector<String> vector = new Vector<String>();
		
		// 추가
		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		
		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민재");
		
		System.out.println(list);
		System.out.println(vector);
		
		// 둘리 삽입
		list.add(1, "둘리");
		vector.add(2, "둘리");
		System.out.println(list);
		System.out.println(vector);
		
		// 중복 가능
		list.add("손흥민");
		list.add("이강인");
		vector.add("손흥민");
		vector.add("이강인");
		System.out.println(list);
		System.out.println(vector);
		
		// 검색
		if (list.contains("이강인")) {
			System.out.println(list.indexOf("이강인"));
			System.out.println(list.get(list.indexOf("이강인")));
			// 둘리를 박지성으로 변경
			list.set(list.indexOf("둘리"), "박지성");
			// first, LastElement가 없다.
		}
		System.out.println(list);
		
		System.out.println("------------");
		if (vector.contains("이강인")) {
			System.out.println(vector.indexOf("이강인"));
			System.out.println(vector.get(vector.indexOf("이강인")));
			// 둘리를 박지성으로 변경
			vector.set(vector.indexOf("둘리"), "박지성");
			// 첫번째 마지막 데이터 반환
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		System.out.println(vector);
		System.out.println("------------");
		
		// 하나씩 꺼내서 출력(for, vector)
		for (String k : vector) {
			System.out.println(k+"골 ");
		}
		System.out.println("------------");
		// 하나씩 꺼내서 출력(iterator, list)
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str+" 선방");
			
		}
	
	}
}
