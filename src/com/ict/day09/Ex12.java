package com.ict.day09;

public class Ex12 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	// 메서드가 실행된 후 호출한 곳으로 되돌아간다는 것을 유의
	// 호출된 메서드가 돌아온 후에 그 아래 코드도 실행할 수 있다.
	public void play02(String k1, int kor, int eng, int math) {
		name = k1;
		sum = kor + eng + math;
		// 메서드는 다른 메서드를 호출 할 수있다.
		play03();
	}
	
	public void play03() {
		avg = (int)(sum/3.0*10)/10.0;
		play04();
	}
	
	public void play04() {
		if (avg>=90) {
			hak = "A학점";
		}else if (avg >=80) {
			hak = "B학점";
		}else if (avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		play05();
	}
	
	public void play05() {
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+hak);
	}
}
