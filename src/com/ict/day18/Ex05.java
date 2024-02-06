package com.ict.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList를 Stream으로 만들기
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(i->System.out.print(i+" "));
		System.out.println("\n-------------------");
		
		// 중간처리 : 정렬 : .sorted(), 오름차순
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(i->System.out.print(i+" "));
		System.out.println("\n-------------------");
		
		// 중간처리 : 정렬 : .sorted(Comparator.reverseOrder()), 내림차순
		// 정렬방식은 유니코드 순이다. (숫자->대문자->소문자->한글)
		Stream<String> stream3 = sList.stream();
		stream3.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
		System.out.println("\n-------------------");
		
		// strea.of에 String[]을 inner타입으로 생성해서 넣기
		Stream<String> stream4 = Stream.of(new String[]{"bb","0","a","CC","54","dd","BB","aaa"});
		stream4.sorted().forEach(i->System.out.print(i+" "));
		System.out.println("\n-------------------");
		Stream<String> stream5 = Stream.of(new String[]{"bb","0","a","CC","54","dd","BB","aaa"});
		stream5.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
		System.out.println("\n-------------------");
		
		// 대문자, 소문자 구분없이 알파벳으로 먼저 정렬되는 방식
		// 같은 문자의 대문자, 소문자의 위치는 위치값이 앞에 있는 문자가 먼저 나온다.
		Stream<String> stream6 = Stream.of(new String[]{"bb","0","A","CC","54","dd","BB","aaa"});
		stream6.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i->System.out.print(i+" "));
		System.out.println("\n-------------------");
		
		// 대문자, 소문자 구분없이 알파벳으로 먼저 정렬되는 방식 역순
		// 같은 문자의 대문자, 소문자의 위치는 위치값이 앞에 있는 문자가 먼저 나온다.
		Stream<String> stream7 = Stream.of(new String[]{"bb","0","A","CC","54","dd","BB","aaa"});
		stream7.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(i->System.out.print(i+" "));
		System.out.println("\n-------------------");
		
	}
}
