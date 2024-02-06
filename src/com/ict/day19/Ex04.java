package com.ict.day19;

import java.util.stream.IntStream;

public class Ex04 {
	public static void main(String[] args) {
		// 병렬처리하였기 때문에 순서대로 나오지 않고 무작위로 나온다.
		IntStream.range(0, 100).parallel().forEach(i->System.out.println("병렬처리: "+i));
		System.out.println("------------------------");
		// 직렬처리하면 순서대로 나온다.
		IntStream.range(0, 100).forEach(i->System.out.println("직렬처리: "+i));
		System.out.println("------------------------");
		
		System.out.println("직렬처리 합: "+IntStream.rangeClosed(0, 10).sum());
		System.out.println("병렬처리 합: "+IntStream.rangeClosed(0, 10).parallel().sum());
	}
}
