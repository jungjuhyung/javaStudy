package com.ict.day14;

// 추상클래스로 Anonymous inner Type
abstract class Ex05 {
	int data = 1000;
	public abstract void printData();
}

// 일반적인 상속
// **중요 웹에서 많이 사용
class Ex05_Test extends Ex05{
	@Override
	public void printData() {
		System.out.println("data1 : "+(data+100));
	}
	
}

class Ex05_Test2{
	// 상속 받지 않고 바로 객체 생성
	Ex05 ex05 = new Ex05() {
		@Override
		public void printData() {
			System.out.println("data2 : "+(data+100));
		}
	};
}
class Ex05_Test3{
	public void prn() {
		Ex05 ex05 = new Ex05() {
			@Override
			public void printData() {
				System.out.println("data3 : "+(data+100));
			}
		}; // 클래스
		ex05.printData();
	} // 메서드
}

// **중요 앱에서 가장 많이 사용
class Ex05_Test4{
	public void prn() {
		new Ex05() {
			@Override
			public void printData() {
				System.out.println("data4 : "+(data+100));
			}
		}.printData();; // 클래스
		
	} // 메서드
}



