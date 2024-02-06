package com.ict.day20;

import java.io.Serializable;

// 값이 있는 객체(Class)를 Value Object(VO)라고 한다.
// 객체의 점보를 담을 수 있는 맴버 변수로 구성
// 1. Serializable 인터페이스를 구현(추상메서드가 없다.)
// 	특징 : 맴버필드가 모두 객체 직렬화 대상이 된다.
//			직렬화 대상에서 제외시키려면 맴버 앞에 transient 예약어 사용
//			제외시킨 대상은 초기값으로 나온다. 객체=null, boolean=false
// input측과 output 측의 **패키지명와 클래스명까지 같아야만 서로 보낼수 있고 읽을 수 있다.
public class Ex09_VO implements Serializable {
	private String name;
	private int age;
	transient private double weight;
	transient private boolean gender;
	
	public Ex09_VO() {}

	public Ex09_VO(String name, int age, double weight, boolean gender) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
