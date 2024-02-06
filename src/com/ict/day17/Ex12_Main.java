package com.ict.day17;

public class Ex12_Main {
	public static void main(String[] args) {
		//Ex12 t = s -> System.out.println(s+"님 환영");
		Ex12 t = returnString();
		t.showString("hello");
		
		// 매개변수로 람다식 받기
		showMyString(t);
		showMyString(s ->System.out.println(s+"님 와"));
		// 원래 java 방식
		showMyString(new Ex12() {
			@Override
			public void showString(String str) {
				System.out.println(str+"님 방가방가");
			}
		});
		
		Ex12 t2 = returnString();
		t2.showString("Lamda");
		
	}
	// 메개변수로 전달하는 람다식
	public static void showMyString(Ex12 k) {
		k.showString("world");
	}
	
	// 반환값으로 쓰는 람다식
	public static Ex12 returnString() {
		return s-> System.out.println(s+"님 환영");
	}
	// 반환값 원래 java 방식
	public static Ex12 returnString2() {
		return new Ex12() {

			@Override
			public void showString(String str) {
				System.out.println(str+"님 hi");
			}
		};
	}
	
}
