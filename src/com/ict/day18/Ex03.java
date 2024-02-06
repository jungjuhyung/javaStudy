package com.ict.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 스트림 생성 : 기본 자료형 배열로부터 스트림 생성하기
		//			IntStream, DoubleStream, LongStream,...
		// 스트림 생성 : 컬렉션이나 배열을 Stream 으로 반환
		// 기본자료형 스트림 생성
		// 기본자료형 스트림은 <>을 작성할 필요가 없다.
		// 가변인자(인자의 갯수가 정해지지 않아서 마음대로 넣을 수 있음) // ...으로 표기됨
		// IntStream 참조변수 = IntStream.of(int... values) 
		// IntStream 참조변수 = IntStream.of(int[]) 
		// IntStream 참조변수 = Arrays.stream(int[]) 
		// IntStream 참조변수 = Arrays.stream(int[], 시작 index, 끝 index)
		
		Integer[] integersArr = {1,2,3,4,5};
		Stream<Integer> integerStream = Arrays.stream(integersArr);
		
		// 메서드 참조 람다 형식
		// 이렇게도 쓸 수 있지만 잘 안쓴다. "님"도 못붙이는 등 활용성이 떨어짐
		// integerStream.forEach(System.out :: print);
		integerStream.forEach(i -> System.out.println(i+"님"));
		System.out.println("\n---------------");
		// 최종단계 메서드를 한번 사용하면 두번 다시 해당 Stream 객체를 사용할 수 없다.
		// 다시 사용하고 싶다면 최종단계 메서드가 종료되고 같은 이름으로 다시 스트림을 만들면 된다.
		integerStream = Arrays.stream(integersArr);
		System.out.println(integerStream.count());
		System.out.println("\n---------------");
		
		// Stream에는 count는 있지만 sum, average는 없다.
		// IntStream에는 있음
		// integerStream = Arrays.stream(integersArr);
		// System.out.println("총 합 : "+ integerStream.sum());
		// System.out.println("총 평균 : "+ integerStream.average());
		
		// 기본자료형 배열을 스트림으로 만들기(오토박싱 된다)
		// IntStream 사용
		// sum과 average등이 지원된다.
		int[] intArr = {10,20,30,40,50};
		IntStream intStream1 = IntStream.of(10,20,30,40,50);
		IntStream intStream2 = IntStream.of(intArr);
		IntStream intStream3 =  Arrays.stream(intArr);
		IntStream intStream4 =  Arrays.stream(intArr,2,5);
		
		intStream1.forEach(i->System.out.print(i+
				"개 "));
		System.out.println("\n---------------");
		System.out.println("총 개수 : "+intStream2.count());
		System.out.println("\n---------------");
		System.out.println("총 합 : "+intStream3.sum());
		System.out.println("\n---------------");
		System.out.println("총 평균 : "+intStream4.average());
		System.out.println("\n---------------");
		List<Integer> k1 = new ArrayList<Integer>();
		k1.add(1);
		k1.add(3);
		k1.add(5);
		k1.add(7);
		k1.add(9);
		
	}
}
