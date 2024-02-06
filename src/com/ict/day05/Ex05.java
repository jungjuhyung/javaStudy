package com.ict.day05;

public class Ex05 {
	public static void main(String[] args) {
		// while문 : for문과 같은 반복문
		// 형식2)
		// 초기식 또는 현재변수 //for문과 다르게 초기식이 밖에 있음
		// while(true){
		// 		if(빠져나갈 조건) break; // 블록이 없어도 된다.
		//		실행할 내용;
		//		증감식;
		//	}
		// *while의 끝을 만나면 무한루프하면서 if문의 조건을 만족하면 break로 빠져나감
		
		// 0~10까지 출력
		int k1 = 0;
		while (true) {
			if(k1>=11) break; //부등호와 break할 조건을 잘 생각해야한다.
			System.out.println(k1);
			k1++;
		}
		System.out.println("-------------------------");
		// 10~20까지 수 중 짝수 출력
		int k2 = 10;
		while (true) {
			if (k2 >= 21) {
				break;
			}else if (k2%2==0) {
				System.out.println(k2);
			}
			k2++;	
		}
		System.out.println("----------------------");
		// a~h까지 출력
		char k3 = 'a';
		while (true) {
			if(k3 >= 'i') break;
			System.out.println(k3);
			k3++;
		}
	}
}
