package com.ict.day11;

public class Ex09 {
	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";
	
	// 생성자
	// 생성자 오버로딩 하고 있음
	// 생성자는 다른 생성자를 호출할 수 있다.
	public Ex09() {
		System.out.println("기본생성자 사용");
		name = "호돌이";
		addr = "LA";
	}
	public Ex09(String name) {
		this.name = name;
	}
	public Ex09(String name, int age) {
		// 생성자가 다른 생성자를 호출할 때는
		// 생성자 무조건 맨 첫줄에 this([인자])를 사용한다.
		// 생성자 호출은 첫줄에 한번만 할 수 있지만
		// 호출한 다른 생성자의 첫줄을 통해 여러번 호출할 수 있다.
		this(); // 생성자는 생성자명을 쓰는게 아닌 this()를 사용한다.
		this.name = name;
		this.age = age;
	}
	public Ex09(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
