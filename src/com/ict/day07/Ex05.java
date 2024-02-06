package com.ict.day07;

public class Ex05 {
	public static void main(String[] args) {
		// String Class에서 배우지 못한 메서드들
		// String.getBytes() : byte[]
		// String.toCharArray() : char[]
		// split(String regex)            : String[]
		// split(String regex, int limit) : String[]
		
		// 1. .getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환시킨다.
		// char형의 문자 하나하나의 숫자를 알려준다.
		// 보통 입출력에 사용(대문자, 소문자, 숫자) // 영어 이외에는 안됨
		// 정보를 전달할 때 많이 사용함
		System.out.println("\n1번 시작-----------------");
		String s1 = "java";
		byte[] b1 = s1.getBytes();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
			
		}
		System.out.println("\n2번 시작-----------------");
		// 2. .toCharArray() : char[]
		// 문자열값을 하나하나 배열에 저장해준다.
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		
		System.out.println("\n3번 시작-----------------");
		// 3. .split(String regex)            : String[]
		// 	  .split(String regex, int limit) : String[]
		// String regex = 구분자(나눌 기준)
		// int limit = 나눌 배열의 크기
		
		String s2 = "사과, 딸기 망고, 오렌지, 두리안 용과";
		String[] s3 = s2.split(",");
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		
		String[] s4 = s2.split(" ");
		for (int i = 0; i < s4.length; i++) {
			System.out.println(s4[i]);
		}
		
		System.out.println("\n3-1번 시작----------------");
		// 나눌 배열의 크기를 지정하면 구분자로 나누다가 칸이 모자르면 마지막 배열칸에 남은 문자열 전체가 저장된다.
		String[] s5 = s2.split(" ", 3);
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		System.out.println("\n3-2번 시작----------------");
		// 나눌 배열의 크기를 초과해서 지정하는 경우 전부 나눠서 저장하고 추가 배열칸은 생성하지 않는다.
		String[] s6 = s2.split(" ", 15);
		for (int i = 0; i < s6.length; i++) {
			System.out.println(s6[i] + " 먹기");
		}
		
		
		
	}
}
