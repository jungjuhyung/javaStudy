package com.ict.day18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("딸기","가지", "바나나", "멜론", "수박");
		// min.max는 (Comparator<? super T)를 인자로 받는다. Comparator를 상속 받는 인자라는 뜻
		// 정렬 후 큰값과 작은값 반환
		// naturalOrder()는 기본 정렬
		Optional<String> o_min = str.stream().min(Comparator.naturalOrder());
		Optional<String> o_max = str.stream().max(Comparator.naturalOrder());
		
		// .findAny() : 요소 중 아무거나 하나 반환
		// .findFirst() : 요소 중 첫번째꺼 반환
		Optional<String> o_findAny = str.stream().findAny();
		Optional<String> o_findfirst = str.stream().findFirst();
		
		System.out.println(o_min.get());
		System.out.println(o_max.get());
		System.out.println(o_findAny.get());
		System.out.println(o_findfirst.get());
		
		List<Integer> num = Arrays.asList(10,1,2,3,4,5,6,7);
		Optional<Integer> i_min = num.stream().min(Comparator.naturalOrder());
		Optional<Integer> i_max = num.stream().max(Comparator.naturalOrder());
		Optional<Integer> i_findAny = num.stream().findAny();
		Optional<Integer> i_findfirst = num.stream().findFirst();
		
		System.out.println(i_min.get());
		System.out.println(i_max.get());
		System.out.println(i_findAny.get());
		System.out.println(i_findfirst.get());
		
	}
}
