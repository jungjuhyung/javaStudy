package com.ict.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Ex01_Main {
	private static final int String = 0;

	public static void main(String[] args) {
		Ex01 p1 = new Ex01("이순신", 40, 100);
		Ex01 p2 = new Ex01("김유신", 20, 100);
		Ex01 p3 = new Ex01("홍길동", 13, 50);
		
		List<Ex01> list = new ArrayList<Ex01>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		// 컬렉션으로 처리하기
		System.out.println("=== 고객명단 순서대로 출력");
		for (Ex01 ex01 : list) {
			System.out.println(ex01.getName());
		}
		
		System.out.println("총 비용은 ~~~ 입니다.");
		int sum2 = 0;
		for (Ex01 ex01 : list) {
			sum2 = sum2+ex01.getPrice();
		}
		System.out.println("총 비용은 "+sum2+"입니다.");
	
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		for (Ex01 ex01 : list) {
			if (ex01.getAge()>=20) {
				System.out.println(ex01.getName());
			}
		}
		
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(오름차순) ===");
		List<String> list2 = new ArrayList<String>();
		for (Ex01 ex01 : list) {
			if (ex01.getAge()>=20) {
				list2.add(ex01.getName());
			}
		}
		Object[] arr = list2.toArray();
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("=========================");
		
		
		// Stream으로 처리하기
		System.out.println("=== 고객명단 순서대로 출력");
		// list.stream().forEach(i->System.out.println(i.getName()));
		list.stream().map(i->i.getName()).forEach(i->System.out.println(i+"고객"));
		
		// map은 특정값을 뽑아낼 사용
		// map은 ()에 조건을 쓰는 것이 아닌 특정 객체 또는 변수를 지정해서 가져온다.
		// 즉, 특정 객체 또는 변수를 가져와서 새로운 stream형태로 만듬
		// filter는 특정값을 지울 때 사용하면 편함
		// filter는 ()에 조건문을 작성해서 조건이 true인 요소 전체를 가저온다.
		// mapToInt는 int만 뽑아서 IntStream
		int sum = list.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println("총 비용은 "+sum+"입니다.");

		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		list.stream().filter(i-> i.getAge()>=20).
		map(i->i.getName()).forEach(i->System.out.println(i));
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(오름차순) ===");
		// sorted를 앞에 쓰지말고 map으로 뽑아내고 쓰자
		// 앞에 쓰면 Ex01 클래스를 오름차순했다는 오류가 발생한다.
		list.stream().filter(i-> i.getAge()>=20).
		map(i->i.getName()).sorted().forEach(i->System.out.println(i));
		
		
		
	}
}
