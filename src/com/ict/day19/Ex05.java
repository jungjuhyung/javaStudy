package com.ict.day19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("김", "이", "박", "나", "최");
		// 순차처리, 직접처리로 main만 사용됨
		Stream<String> stream = list.stream();
		stream.forEach(i->prn(i));
		System.out.println("---------------");
		
		// 병렬처리
		// ForkJoinPool.commonPool-worker라는 내장 스레드 같은 애들이 같이 처리해준다.
		Stream<String> stream2 = list.parallelStream();
		stream2.forEach(i->prn(i));
		System.out.println("---------------");
		
	}
	
	public static void prn(String str) {
		try {
			Thread.sleep(1000);
			System.out.println(str+":"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
