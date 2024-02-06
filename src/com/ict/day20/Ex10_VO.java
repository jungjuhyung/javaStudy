package com.ict.day20;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//객체의 점보를 담을 수 있는 맴버 변수로 구성
// 2. Externalizable 인터페이스 구현(추상 메서드가 있다.)
public class Ex10_VO implements Externalizable {
	private String name;
	private int age;
	private double weight;
	private boolean gender;
	
	public Ex10_VO() {}
	
	public Ex10_VO(String name, int age, double weight, boolean gender) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	// 직렬화 메서드와 역직렬화 메서드 작성 시 주의사항
	// 들어가는 맴버필드는 둘 다 같아야한다. 다르면 역직렬화할 때 오류
	// 들어가는 맴버필드의 순서도 같아야한다. 다르면 역직렬화할 때 오류
	
	// 직렬화 대상 넣기
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weight);
		out.writeObject(gender);
	}
	
	// 역직렬화 넣기
	// 전부 object로 나오기 때문에 캐스팅 해준다.
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = (int) in.readObject();
		weight = (double) in.readObject();
		gender = (boolean) in.readObject();
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
