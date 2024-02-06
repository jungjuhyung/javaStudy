package com.ict.day19;

public class Ex01 {
	private String name;
	private int age;
	private int price;
	
	public Ex01() {}

	public Ex01(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	// toString은 object를 상속받았기 때문에 오버라이딩 가능
	// 보통 해당 클래스의 맴버필드값을 한번에 보여주고 싶을때 해당 메서드를 사용
	// ctrl+spacebar로 바로 생성가능
	@Override
	public String toString() {
		return "name: "+name+"age: "+age+"price: "+price;
	}
	
	
	
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
