package com.ict.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Ex0124h_Main {
	public static void main(String[] args) {
		List<Ex0124h> bookList = new ArrayList<>();
		
		bookList.add(new Ex0124h("자바", 25000));
		bookList.add(new Ex0124h("파이썬", 15000));
		bookList.add(new Ex0124h("안드로이드", 30000));
		
		// 스트림으로 풀기
		// 모든 책의 가격 합
		// 책의 가격이 20000원 이상인 책의 이름 정렬 출력
		
		int sum = bookList.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println("모든 책의 가겨 : "+sum);
		
		bookList.stream().filter(i->i.getPrice()>=20000)
		.map(i->i.getName()).sorted().forEach(i->System.out.println(i));

	}
}
