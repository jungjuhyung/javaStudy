package com.ict.day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		// Collection interface를 상속받지 않음
		// Map interface : Key와 Value를 1:1 매핑하는 구조
		//					Key는 중복 될 수 없다.(정확히는 들어가면서 기존 Value 삭제)
		//					Key를 호출하면 Value가 나온다.
		//					Key를 별도로 관리 => keySet()
		//					add()로 추가 못함
		// 					put(Key, Value)로 추가
		// 관련 클래스 : HashMap, Hashable(잘 안쓰므로 패스)
		
		// Key가 숫자인 경우
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "한국");
		map1.put(1, "중국");
		map1.put(2, "미국");
		map1.put(3, "태국");
		map1.put(10, "영국");
		map1.put(13, "일본");
		System.out.println(map1); // {}으로 나오며 Key=Value가 묶여서 나옴
		
		// Key 중복(덮어쓰기 됨)
		map1.put(1, "호주");
		// Value 중복(상관없음)
		map1.put(16, "한국");
		System.out.println(map1); // {}으로 나오며 Key=Value가 묶여서 나옴
		
		System.out.println("------------");
		// Key만 구하기
		// 꺼내기(map인채로는 for문 같은 구조 사용불가)
		// 무조건 keySet() 사용해야 된다.
		// Key값을 set class에 넣는다.
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println("------------");
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = it.next();
			// k는 Key가 되었다.
			System.out.println(map1.get(k));
			
		}
		System.out.println("------------");
		// Value만 구하기
		Collection<String> var = map1.values();
		System.out.println(var);
		
		
		System.out.println("------------");
		// Key, Value 같이 구하기
		// entrySet() 메서드는 Key와 Value 모두 필요한 경우
		Set<Entry<Integer, String>> set1 = map1.entrySet();
		Iterator<Entry<Integer, String>> it2 = set1.iterator();
		while (it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
