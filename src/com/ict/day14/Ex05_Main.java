package com.ict.day14;

public class Ex05_Main {
	public static void main(String[] args) {
		// 추상클래스를 상속받은 경우
		Ex05_Test t1 = new Ex05_Test();
		t1.printData();
		
		// 이너타입으로 넣은 경우
		Ex05_Test2 t2 = new Ex05_Test2();
		t2.ex05.printData();
		
		// 이렇게만 하면 생성이 printData()이 안나오기 때문에
		// 로컬 내부클래스처럼 돌아가서 작성해야한다.
		Ex05_Test3 t3 = new Ex05_Test3();
		t3.prn();
		
		// 여기서 참조변수를 없애고 바로 class.메서드명으로 해서 줄일 수 있다.
		Ex05_Test4 t4 = new Ex05_Test4();
		t4.prn();
	}
}
