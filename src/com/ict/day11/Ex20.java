package com.ict.day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex20 {
	public static void main(String[] args) {
		// java 8.0 이상에서만 사용가능
		// LocalDate는 날짜 정보만 제공
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);
		
		LocalDate cDate2 = LocalDate.of(2023,12,28);
		System.out.println(cDate2);
		
		// 날짜 비교
		// 두 날짜간의 기간이 1년이 안됨
		System.out.println(ChronoUnit.YEARS.between(cDate, cDate2)); // 0
		// 두 날짜간의 기간이 한달이 안됨
		System.out.println(ChronoUnit.MONTHS.between(cDate, cDate2)); // 0
		// 두 날짜간의 기간이 15일됨
		System.out.println(ChronoUnit.DAYS.between(cDate, cDate2));
		
		// LocalTime은 시간 정보만 제공
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		
		LocalTime cTime2 = LocalTime.of(9, 00); // 시, 분 설정해주기/분에는 59까지만 넣을 수 있음
		System.out.println(cTime2);
		
		// LocalDateTime은 시간 날짜 정보 제공
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		LocalDateTime cdt2 = LocalDateTime.of(cDate2, cTime2);
		System.out.println(cdt2);
		
		// 더하기 plus**(), 빼기 minus**()
		System.out.println(cdt.plusYears(7)); // 해당 날짜 변수에 7년 더하기
		System.out.println(cdt.plusMonths(7)); // 해당 날짜 변수에 7개월 더하기
		System.out.println(cdt.plusDays(7)); // 해당 날짜 변수에 7일 더하기
		System.out.println(cdt.plusHours(7)); // 해당 날짜 변수에 7시간 더하기
	}
}
