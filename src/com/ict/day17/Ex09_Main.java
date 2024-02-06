package com.ict.day17;

public class Ex09_Main {
	public static void main(String[] args) {
		// 두 수 중 큰 수 리턴
		Ex09 t1 = new Ex09() {
			@Override
			public int getMax(int num1, int num2) {
				int k;
				if (num1>num2) {
					k = num1;
				}else {
					return num2;
				}
				return k;
			}
		};
		Ex09 t2 = new Ex09() {
			@Override
			public int getMax(int num1, int num2) {
				if (num1>num2) {
					return num1;
				}else {
					return num2;
				}
			}
		};
		System.out.println(t1.getMax(100, 200));
		System.out.println(t2.getMax(200, 100));
		System.out.println("---------");
		
		// 람다식으로 해보기
		// Ex09 interface에는 추상메서드 한개만 있기 때문에 getMax를 안 쓸 수 있다.
		Ex09 t3 = (int num1, int num2) -> {
			if (num1>num2) {
				return num1;
			}else {
				return num2;
			}
		};
		System.out.println(t3.getMax(5000, 1000));
		
		// 람다식 추가로 축약해보기
		// return이 if~else if로 한문장이기 때문에 {} 생략
		Ex09 t4 = (num1, num2) -> num1 >= num2? num1 : num2;
		System.out.println(t4.getMax(1000, 5000));
	}
}
