package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		// 스트림 생성 : 컬렉션이나 배열을 Stream 으로 반환
		// 객체, 배열로부터 스트림 생성
		// 가변인자(인자의 갯수가 정해지지 않아서 마음대로 넣을 수 있음) // ...으로 표기됨
		// stream<T> STream.of(T... values) 
		// stream<T> STream.of(T[]) 
		// stream<T> Arrays.stream(T[]) 
		// stream<T> Arrays.stream(T[], 시작 index, 끝 index) 
		String[] arr = {"홍길동", "고길동", "이길동", "박길동","나길동"};
		
		
		// 가변인자라서 마음대로 넣을 수 있음
		Stream<String> stream01 =Stream.of("홍자바", "고자바", "이자바", "박자바", "나자바");
		Stream<String> stream02 =Stream.of(arr);
		Stream<String> stream03 =Arrays.stream(arr);
		Stream<String> stream04 =Arrays.stream(arr,1,4);
		
		// 컬렉션을 stream화 할 때는 컬렉션에 있는 stream()를 사용한다.
		List<String> list = Arrays.asList("둘리", "도우너", "고길동", "마이콜", "희동이");
		Stream<String> stream05 = list.stream();
		
		
		stream01.forEach(i->System.out.print(i +"님 "));
		System.out.println("\n-------");
		stream02.forEach(i->System.out.print(i+"님 "));
		System.out.println("\n-------");
		stream03.forEach(i->System.out.print(i+"님 "));
		System.out.println("\n-------");
		stream04.forEach(i->System.out.print(i+"님 "));
		System.out.println("\n-------");
		stream05.forEach(i->System.out.print(i+"님 "));
		System.out.println("\n-------");
	}
}
