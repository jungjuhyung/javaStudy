package com.ict.day14;

public class Ex07_Main {
	public static void main(String[] args) {
		Ex07_Land t1 = new Ex07_Land();
		// 인자를 Ex07이라는 interface를 가지고 있다.
		// 이 방법은 interface를 상속한 class가 없기 때문에
		// 일시적으로 interface를 가져와서 일회용 오버라이딩 한것
		t1.autoPlay(new Ex07() {
			@Override
			public void play() {
				System.out.println("회전목마");
			}
		});
		System.out.println("----------");
		// Ex07을 상속받은 Car와 Baseball 중
		// 하나를 생성하기
		// t1.autoPlay(new Ex07_Car());
		t1.autoPlay(new Ex07_Bassball());
		System.out.println("----------");
		
		// int k가 1이면 운전하기 2이면 야구하기
		int k = 1;
		if (k==1) {
			t1.autoPlay(new Ex07_Car());
		}else if (k==2) {
			t1.autoPlay(new Ex07_Bassball());			
		}
		System.out.println("----------");
		
		if (k==1) {
			t1.autoPlay(new Ex07() {
				@Override
				public void play() {
					System.out.println("운전하기2");	
				}
			});
		}else if (k==2) {
			t1.autoPlay(new Ex07() {
				@Override
				public void play() {
					System.out.println("야구하기2");
				}
			});			
		}
		System.out.println("----------");
		// Ex07 interface를 자료형으로 하는 빈깡통 만듬
		// 그 안에 자식 class를 넣을 수 있음
		// 그러면 같은 이름의 오버라이딩 된 메서드를 사용가능
		Ex07 ex07 = null;
		if (k==1) {
			ex07 = new Ex07_Car();
		}else if (k==2) {
			ex07 = new Ex07_Bassball();
		}
		ex07.play();
	}
}
