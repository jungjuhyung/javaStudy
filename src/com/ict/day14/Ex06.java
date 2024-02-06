package com.ict.day14;
//interface로 Anonymous inner Type 이용
interface Ex06 {
	int DATA = 1000;
	public void printData();
}

class Ex06_test implements Ex06{
	@Override
	public void printData() {
		int data1 = DATA + 100; // 사용을 가능하나 DATA를 변경하는 것은 불가능
		System.out.println("data1 : "+data1);
		
	}
}

class Ex06_Test2{
	public void prn() {
		new Ex06() {
			int data2 = DATA + 100;
			@Override
			public void printData() {
				System.out.println("data2 : "+data2);
			}
		}.printData(); // 클래스 끝
	}
}