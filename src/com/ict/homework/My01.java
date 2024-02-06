package com.ict.homework;


public class My01 {
	String name = "gitar";
	int price = 20000;
	
	public My01() {
	}
	
	public My01(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void do1() {
		System.out.println("도");
	}
	public void re() {
		System.out.println("레");
	}
	public void mi() {
		System.out.println("미");
	}
	public void pa() {
		System.out.println("파");
	}
	public void sol() {
		System.out.println("솔");
	}
	public void la() {
		System.out.println("라");
	}
	public void si() {
		System.out.println("시");
	}
	
	public void do1(String s) {
		if (name.equalsIgnoreCase("p")) {
			System.out.println("p도");
		}
	}
	public void re(String s) {
		if (name.equalsIgnoreCase("p")) {
			System.out.println("p레");
		}
	}
	public void mi(String s) {
		if (name.equalsIgnoreCase("p")) {
			System.out.println("p미");
		}
	}
	public void pa(String s) {
		if (name.equalsIgnoreCase("p")) {
			System.out.println("p도");
		}
	}
	public void sol(String s) {
		if (name.equalsIgnoreCase("p")) {
			System.out.println("p파");
		}
	}
	public void la(String s) {
		if (name.equalsIgnoreCase("p")) {
			System.out.println("p솔");
		}
	}
	public void si(String s) {
		if (name.equalsIgnoreCase("p")) {
			System.out.println("p라");
		}
	}

	
}