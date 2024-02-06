package com.ict.day11;

public class Ex06 {
	private String name = "";
	private int price = 0;
	
	// 생성자 생성
	public Ex06(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// getter, setter
	public void sName(String k) {
		name = k;
	}
	public void sPrice(int k) {
		price = k;
	}
	// 겟터 : 변수를 반환하는 메서드
	public String gName() {
		return name;
	}
	public int gPrice() {
		return price;
	}
	// 위의 메뉴에 Source에 generator getter setter가 있다.
	public String getName() {
		return name;
	}
	// 지역변수와 전역변수 이름이 같으면 지역변수가 우선순위임
	// 따라서 this를 통해 전역변수를 지정해줌
	// 자세한 건 추후 배움
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
