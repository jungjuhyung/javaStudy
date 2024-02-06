package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex10 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		Stream<Integer> stream1 = numbers.stream();
		
		
		// reduce는 stream에 있는 요소 전부를 사용해서 실행한다.
		// 수행 기능만 들어가면 반환형이 Optional<T>이다.
		Optional<Integer> sum = stream1.reduce((i,j) -> Integer.sum(i,j));
		System.out.println("합계 : "+sum);
		System.out.println("\n---------------");
		
		// reduce의 초기값 + 수행기능
		// 초기값이 들어가면 반환형이 해당 객체타입으로 나온다.
		List<Integer> number2 = Arrays.asList(10,20,30,40,50);
		Stream<Integer> stream2 = numbers.stream();
		int sum2 = stream2.reduce(1000, (i,j) -> Integer.sum(i,j));
		System.out.println("합계 : "+sum2);
		System.out.println("\n---------------");
		
		int[] num = {10,20,30,40,50};
		IntStream intStream = IntStream.of(num);
		int total = intStream.sum();
		System.out.println("합계 : "+total);
		System.out.println("\n---------------");
		
		// 누적합 구하기
		Stream<Integer> numbers3 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> total2 = numbers3.reduce((x,y)->x+y);
		System.out.println("합계 : "+total2);
		
	}
}
