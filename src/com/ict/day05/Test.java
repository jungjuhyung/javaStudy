package com.ict.day05;

public class Test {
	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+…과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
		// i가 199일 때 100을 넘음
		int sum = 0;
		int su = 0;
		for (int i = 1; sum < 100; i++) {
			if (i % 2 == 0) {
				su = i * -1;
			} else{
				su = i;
			}
			sum = sum + su;
			if (sum>=100) {
			System.out.println("i가 "+i+"일 때 100이상입니다.");
			}
		}
	}
}
