package com.ict.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex12 {
	public static void main(String[] args) {
		// collect : Stream을 컬렉션으로 변환
		Stream<String> s = Stream.of("a", "b", "c","b","z");
		HashSet<String> set1 = s.collect(Collectors.toCollection(()->new HashSet<String>()));
		// 중복은 안들어가진 것을 확인 가능
		set1.add("h");
		set1.add("w");
		System.out.println(set1);
		
		// Map 인터페이스 Stream
		
		// 길이가 같은 것끼리 연결해서 Map 컬렉션 생성
		Stream<String> str = Stream.of("나","우리","너","모두","노래해요");
		Map<Integer, String> res01 = 
				str.collect(Collectors.groupingBy(i->i.length(), Collectors.joining()));
		System.out.println(res01);
		
		//해결해보기
//		Stream<String> str2 = Stream.of("나","우리","너","모두","노래해요");
//		Map<Integer, String> res02 = 
//				str2.collect(Collectors.toMap(i-> str.toList().indexOf(i.), j->j));
//		System.out.println(res02);
		
		// 홀수와 짝수 묶어서 합계 구하기
		List<Integer> list = Arrays.asList
				(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20});
		Map<String, Integer> map = list.stream()
				// 홀수와 짝수 그룹핑
				.collect(Collectors.groupingBy(i->(i%2==0)?"even":"odd",
						// 누적합
						Collectors.reducing(0,(i1,i2)->i1+i2)));
		
		System.out.println(map);
		
	}
}
