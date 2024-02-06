package com.ict.day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex18 {
	public static void main(String[] args) {
		// 날짜 관련 클래스
		// 1. Date Class
		// 2. Calendar Class
		// 3. LocalDate Class
		
		// 1. Date Class
		// 생성자를 통해 주소가 아닌 날짜가 나오게뜸 만듬
		Date date = new Date();
		System.out.println(date);
		
		// 기본 형태 변환
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf.format(date));
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yy-M-dd H:m:s");
		System.out.println(sf2.format(date));
		
		// 년, 월, 일, 시, 분, 초, 요일 => 시스템상의 년,월,일,시,분,초로 나옴
		// 시스템상의 시간을 바꾸면 바뀐다.
		// 모든 컴퓨터는 1900년 1월 1일 00시 00분 00초를 기준으로 시작함
		System.out.println(date.getYear()); // 현재연도 - 1900으로 계산되서 124가 나옴
		System.out.println(date.getYear()+1900+"년"); // 1900을 더해줘야 현재가 나옴
		System.out.println(date.getMonth()+1+"월"); // 0 ~ 11까지 반환하기 때문에 +1해줘야함
		System.out.println(date.getDate()+"일");
		System.out.println(date.getHours()+"시");
		System.out.println(date.getMinutes()+"분");
		System.out.println(date.getSeconds()+"초");
		
		int k = date.getDay(); // 0~6을 반환, 일요일부터 시작
		switch (k) {
		case 0:System.out.println("일요일"); break;
		case 1:System.out.println("월요일"); break;
		case 2:System.out.println("화요일"); break;
		case 3:System.out.println("수요일"); break;
		case 4:System.out.println("목요일"); break;
		case 5:System.out.println("금요일"); break;
		case 6:System.out.println("토요일"); break;
		default:
			break;
		}
	}
}
