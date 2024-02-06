package com.ict.day14;

import com.ict.day14.Ex04.Inner03;

public class Ex04_Main {
	public static void main(String[] args) {
		// 별도의 객체 생성 없이 사용 가능
		System.out.println(Inner03.room);
		Inner03.prn();
		// 별도로 객체 생성도 가능
		Inner03 test = new Inner03();
		test.prn();
		
	}
}
