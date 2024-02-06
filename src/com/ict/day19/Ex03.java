package com.ict.day19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 병렬처리 : parallel
		List<String> list = Arrays.asList("사원1","사원2","사원3","사원4","사원5");
		
		// 병렬처리할 Stream 생성
		// .parallelStream() : 일반 stream을 병렬처리 stream으로 변경
		Stream<String> ps1 = list.parallelStream();
		Stream<String> ps2 = list.parallelStream();
		
		// 병렬처리 유무 체크 : .isParallel() => 병렬처리했으면 true 반환
		System.out.println("ps1 = "+ps1.isParallel());
		System.out.println("ps2 = "+ps2.isParallel());
		System.out.println("---------------");
		
		// .sequential() : 병렬처리를 직접처리로 변경
		// .sequential()를 사용하면 ps1이 자동으로 직렬로 바뀌고 ps3에는 또 다른 객체로 저장하는 것 같다.
		Stream<String> ps3 = ps1.sequential();
		System.out.println("ps1 = "+ps1.isParallel());
		System.out.println("ps2 = "+ps2.isParallel());
		System.out.println("ps3 = "+ps2.isParallel());
		
		
	}
}
