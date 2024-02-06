package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초일까?
		int tose = 3989;
		int hour = tose/3600;
		int min = tose%3600/60;
		int se = tose%3600%60;
		System.out.println(tose + "초는 " + hour+"시간 "+ min+"분 "+se+"초"+" 입니다.");
		
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0; // 나머지 저장
		
		// 시간을 구하자
		h = tose / (60*60);
		res = tose % (60*60);
		
		m = res/(60);
		s= res%(60);
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
	}
}
