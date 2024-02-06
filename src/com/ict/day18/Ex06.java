package com.ict.day18;

import java.util.stream.IntStream;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3};
		IntStream intStream1 = IntStream.of(arr);
		intStream1.forEach(i->System.out.println(i));
		System.out.println("\n------------");
		
		// distinct() : 중복제거
		IntStream intStream2 = IntStream.of(arr);
		intStream2.distinct().forEach(i->System.out.println(i));
		System.out.println("\n------------");
		
		// filter(조건)
		// IntStream.range는 입력된 시작값부터 입력된 끝값 전까지의 IntStream 생성
		// IntStream.rangeClosed는 입력된 끝값을 포함한다.
		// IntStream intStream4 = IntStream.rangeClosed(0, 10);
		// 짝수만 출력
		IntStream intStream3 = IntStream.range(0, 10);
		intStream3.filter(i->i%2==0).forEach(i->System.out.println(i));
		System.out.println("\n------------");
		
		// limit(갯수)
		// 인자만큼 자르기(위치값이 아님)
		IntStream intStream4 = IntStream.rangeClosed(0, 10); // 마지막 포함
		intStream4.limit(3).forEach(i->System.out.println(i));
		System.out.println("\n------------");
		
		// skip(long) : 앞에부터 int만큼 제외
		IntStream intStream5 = IntStream.rangeClosed(0, 10); // 마지막 포함
		intStream5.skip(3).forEach(i->System.out.println(i));
		System.out.println("\n------------");
	}
}
