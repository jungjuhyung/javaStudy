package com.ict.day07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		// Arrays Class : 배열을 다루기 위한 다양한 메서드가 포함되어 있는 Class
		int[] arr = new int[100];
		// 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i*5;
			System.out.println("arr["+i+"] = "+(i*5));
		}
		System.out.println("\n1번 시작---------------------------");
		// 1. Arrays.binarySearch(배열, 찾으려는 값)
		// 해당 배열에서 값을 검색 한 후에 index값을 반환
		// 찾는 값이 없으면 -부호를 가진 값을 반환한다.
		int  res = Arrays.binarySearch(arr, 10);
		System.out.println("결과 : " + res);
		
		System.out.println("\n2번 시작---------------------------");
		// 2. Arrays.copyOf(배열, 새로 지정할 크기);
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = Arrays.copyOf(arr1, 3);
		
		// 배열 크기를 줄이고 복사
		// 크기 뒤의 값들은 사라짐
		System.out.println("arr2");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		// 배열 크기를 늘리고 복사
		// 빈 공간은 초기값으로 채워줌(int형은 0, Boolean형은 False)
		System.out.println("arr3");
		int[] arr3 = Arrays.copyOf(arr1, 10);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("\n3번 시작---------------------------");
		// 3. Array.copyOfRange(배열, 시작index, 끝index(포함안함))
		// 시작 위치와 끝 위치를 지정하여 해당 범위에 있는 배열을 가져오는 것(잘라내기)
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		System.out.println("\n4번 시작---------------------------");
		
		// 4. Arrays.fill(배열, 원하는 초기값);
		// 해당 배열을 원하는 초기값으로 전부 변경 또는 채우기
		int[] arr5 = new int[10];
		Arrays.fill(arr5, 3);
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		
		System.out.println("\n5번 시작---------------------------");

		// 5. Arrays.sort(배열) : void(따로 저장하지 말라는 뜻, 기존 배열명에 저장됨)
		// 해당 배열을 오름차순 정렬
		int[] arr6 = {7,4,3,1,5,6,2};
		Arrays.sort(arr6);
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
		
		System.out.println("\n5-1번 시작---------------------------");
		// 5-1. 오름차순에서 거꾸로 가져오기(내림차순)
		// 이건 arr6의 값을 내림차순으로 변경한 것이 아니라 내림차순으로 출력해서 보여주는 것 뿐이다.
		for (int i = arr6.length-1; i >= 0; i--) {
			System.out.println(arr6[i]);
		}
		
		System.out.println("\n5-2번 시작---------------------------");
		// 5-2. Arrays.sort(배열, Collections.reverseOrder()) : void
		// 내림차순으로 정렬
		// int를 정렬할 때는 int가 아닌 Integer로 자료형을 선언해줘야한다.
		// Collections.reverseOrder()는 나중에 추가로 배울 예정
		Integer[] arr7 = {7,4,3,1,5,6,2};
		Arrays.sort(arr7, Collections.reverseOrder());
		for (int i = 0; i < arr7.length; i++) {
			System.out.println(arr7[i]);
		}
		
		System.out.println("\n5-3번 시작---------------------------");
		// 5-3. 문자들의 오름차순
		// 문자의 정렬 순서 : 숫자, 키보드 특수문자, 대문자, 소문자, 한글
		// 문자열일 때는 문자열의 첫글자를 기준으로 오름차순해준다.
		String[] arr8 = {"Mango", "Apple", "apple", "7", "mango", "1",
				"banana", "Banana", "@", "가나다", "하바사"};
		Arrays.sort(arr8);
		for (int i = 0; i < arr8.length; i++) {
			System.out.println(arr8[i]);
		}
		
		// 6. Arrays.asList() : 배열을 리스트라는 컬렉션으로 변경할 때 사용
		//	  List의 toArray() : 리스트를 배열로 만들어서 사용
		// 나중에 배울 예정
		
		
		
	}
}
