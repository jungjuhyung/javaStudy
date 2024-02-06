package com.ict.day13;
enum Type2{
	WALK("워킹화", 250),
	RUN("런닝화", 255),
	TRACK("트레킹화", 265),
	HIK("하이키화", 275);
	
	private final String name;
	private final int size;	
	
	// 전부 static final이기 때문에 setter를 만들어도 수정할 수 없다.
	// 따라서 getter만 생성함
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}

	// 생성자 역할을 하는 할 수 있다.
	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}
}

public class Ex14 {
	public static void main(String[] args) {
		Type2[] arr = Type2.values(); // enum 안에 있는 값만 가져오는 것
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+":"+arr[i].getSize());
		}
	}
}
