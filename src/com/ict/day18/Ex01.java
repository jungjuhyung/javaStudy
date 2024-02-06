package com.ict.day18;

public class Ex01 {
/*	
 	Stream : 컬렉션(배열포함)의 저장 요소를 하나씩 참조하여
 			람다식으로 처리할 수 있는 클래스
 			컬렉션, 배열 데이터 소스를 표준화 된 방법으로 다루기 위한 것
 	Stream 순서 : Stream 생성 => 중간처리 => 최종처리
 	1. Stream 생성 : 컬렉션 배열을 Stream Class로 변환 시키는 작업
 	2. 중간처리 : 여러번 반복 사용 가능, 결과가 스트림으로 나온다.
 			distinct() : 중복제거
 			filter(조건식) : 조건에 안맞는 요소 제외
 			limit(갯수) : 갯수만큼 자르기
 			skip(갯수) : 갯수만큼 건너뛰기
 			peek() : 작업 사이에 넣어서 중간 결과를 받을 때 주로 사용(요소 전체 반복)
 			sorted() : 오름차순 정렬
 			map() : 요소 변환
 			flatMap() : 요소 변환
 	3. 최종처리 : 한번만 실행 가능, 스트림 요소가 소모, 스트림이 닫기 되어서 스트림을 다시 호출할 수 없다,
 				결과가 스트림이 아니다.
 			forEach() : 요소 전체를 반복
 			count() : 갯수
 			max() : 최대
 			min() : 최소
 			
 			## 아래 두개는 보통 filter와 같이 사용됨
 			findAny() : 아무거나 하나 반환
 			findFirst() : 첫번째꺼 반환
 			
 			allMatch(조건식) : 모두 만족하면 true
 			anyMatch(조건식) : 하나라도 만족하면 true
 			nonMatch(조건식) : 모두 만족하지 않으면 true
 			
 			toArray() : 스트림의 모든 요소를 배열로 반환
 			reduce() : 스트림의 요소를 하나씩 줄여가면서 계산한다.
 						ex) sum(), count()
 			collect : 스트림의 요소를 수집한다.
 
 */
}
