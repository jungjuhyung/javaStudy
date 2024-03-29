package com.ict.day11;

import java.util.Calendar;

public class Ex19 {
	public static void main(String[] args) {
		// Calendar Class
		// Calendar Class는 다양한 static fanal 상수가 있으므로 해당 필드값을 가져오는 경우가 많다.
		// 필드값을 가져오기 위해 get을 많이 쓴다.
		// new 예약어와 생성자를 사용하지 않고 객체 생성하면 현재 pc의 날짜와 시간 지정
		Calendar now = Calendar.getInstance();
		System.out.println(now); // 복잡한 데이터가 나옴(대부분 필드값을 나열해놓음)
		System.out.println(now.getTime());
		System.out.println(now.getTimeZone());
		
		// 년월일시분초
		System.out.println(now.get(Calendar.YEAR)+"년");
		System.out.println(now.get(Calendar.MONTH)+1+"월"); // Calendar도 0~11을 반환하기 때문에 +1 해줘야한다.
		System.out.println(now.get(Calendar.DATE)+"일");
		System.out.println(now.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(now.get(Calendar.HOUR)+"시"); // 12시간제
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+"시"); // 12시간제
		System.out.println(now.get(Calendar.MINUTE)+"분");
		System.out.println(now.get(Calendar.SECOND)+"초");
		
		// AM = 0, PM = 1
		int res = now.get(Calendar.AM_PM);
		if (res == 0) {
			System.out.println("AM " + now.get(Calendar.HOUR)+"시");
		}else if (res == 1) {
			System.out.println("PM " + now.get(Calendar.HOUR)+"시");
		}
		
		// 요일 : Calendar는 1~7값을 반환하며 일요일 시작
		int res2 = now.get(Calendar.DAY_OF_WEEK);
		switch (res2) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		default:
			break;
		}
		
		// set 메서드로 날짜 설정
		// 월 넣을 때도 -1해서 넣어야한다.
		// now.set(2023, 11, 28);
		System.out.println(now.getTime());
		
		// 밀리초로 197년 1월 1일 0시 0분 부터 흐른 시간 구하기
		// 단위는 1/1000초이다.
		System.out.println("1970년 1월 1일 00시 00분부터 흐른 초 : "+now.getTimeInMillis());
		
		Calendar now2 = Calendar.getInstance();
		now2.set(Calendar.YEAR, 2023);
		now2.set(Calendar.MONTH, Calendar.DECEMBER);
		now2.set(Calendar.DAY_OF_MONTH, 28);
		
		// 두 날짜 차이 구하기
		long diff = now.getTimeInMillis()-now2.getTimeInMillis();
		System.out.println(diff);
		// 두 날짜 차이 24시간 단위로 바꾸기
		System.out.println(diff/(60*60*24*1000));
		
		// n일 뒤의 날짜 지정하기
		now.add(Calendar.DATE, 5);
		System.out.println(now.getTime());
	}
}
