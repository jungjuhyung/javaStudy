package com.ict.day19;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex02_Main {
	public static void main(String[] args) {
		Stream<Ex02> stream = Ex02.visits_list.stream();
		
		// collect는 최종 연산에서 수집하는것
		// Collectors와 같이 사용된다.
		// collect의 인자로 Collector의 메서드를 사용하여 수집할 조건을 설정한다.
		double avg =stream.collect(Collectors.averagingInt(i->i.getVisits()));
		System.out.println("전체 방문한 사람 평균 횟수 : "+avg);
		
		stream = Ex02.visits_list.stream();
		// OptionalDouble 자료형이기 때문에 .getAsDouble()을 써야한다.
		double avg2 = stream.mapToInt(i->i.getVisits()).average().getAsDouble();
		System.out.println("전체 방문한 사람 평균 횟수 : "+avg2);
		
		// 회원 이름만 리스트로 만들어서 출력
		stream = Ex02.visits_list.stream();
		List<String> name = stream.map(i->i.getName()).collect(Collectors.toList());
		// List<String> name = stream.map(i->i.getName()).toList(); 버전이 더 높다.
		System.out.println("회원 이름 : "+name);
		
		// Collectors.counting()은 grouping된 key값의 갯수를 카운트하여 value값으로 반환
		System.out.println("타입별 인원수 : ");
		stream = Ex02.visits_list.stream();
		Map<Type, Long> map = stream.collect(Collectors.
				groupingBy(i->i.getType(), Collectors.counting()));
		System.out.println(map);
		
		
		
		
		
	}
}
