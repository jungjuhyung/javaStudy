package com.ict.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 Key값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		Set<String> set1 =  map.keySet();
		esc:while (true) {
			System.out.print("수도를 원하는 나라를 입력해주세요 >>> ");
			String con = scan.next();
			if (set1.contains(con)) {
				System.out.println(con+"의 수도는 "+ map.get(con)+"입니다.");
			}else {
				System.out.println("데이터에 없는 나라입니다.");
			}
			while (true) {
				System.out.print("계속 하시겠습니까?(y/n) >>>");
				String user = scan.next();
				if (user.equalsIgnoreCase("y")) {
					continue esc;
				}else if (user.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("다시 입력해주세요");
				}
				
			}
			
		}
		System.out.println("감사합니다.");
	}
}
