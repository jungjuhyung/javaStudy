package com.ict.day10;

public class Ex09 {
	private String name = "";
	private int price = 0;
	
	// 변수의 접근제한자 private이므로 외부에서는 접근 불가
	// 내부에서는 접근 가능하다는 부분을 이용해서
	// 메서드를 만들어 접근해서 데이터를 삽입하거나 가져올 수 있다.
	
	// 세터 : 인자를 받아서 변수에 저장하는 메서드
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
