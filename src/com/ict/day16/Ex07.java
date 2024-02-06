package com.ict.day16;
// 스레드(일꾼) : 현재 실행중인 프로그램 내에서 실행되는 세부 작업 단위
// 싱글 스레드 : 스레드가 하나, 일꾼이 하나(지금까지 해왔던 클래스 실행이 전부 싱글 스레드이다.)
// 멀티 스레드 : 스레드가 여러개, 일꾼이 여러개, 병행처리 한다.
// 자바에서의 스레드 생성 : start() => run()
// 스레드는 start=>run 될 때마다 새로 생성되고 작업이 끝나면 사라진다.
// 1. Thread 클래스 상속 받기 : start(), run() 메서드가 모두 있다.
// 2. Runnable 인터페이스 상속 : run()만 존재 (추상메서드)

// 스레드 생성자 : Thread(), Thread(Runnable 인퍼페이스를 상속받은 객체)
// 				Thread(스레드 이름), Thread(Runnable 인퍼페이스를 상속받은 객체, 스레드 이름)
public class Ex07 {
	public void play() {
		System.out.println("2: "+Thread.currentThread().getName());
	}
	public void start() {
		System.out.println("4: "+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		// 현재 사용중인 스레드의 이름 반환
		// 지금까지 main메서드 혼자 작업한 것이다.
		System.out.println("1: "+Thread.currentThread().getName()); // main
		
		Ex07 test = new Ex07();
		test.play();
		System.out.println("3: "+Thread.currentThread().getName());
		
		test.start();
		System.out.println("5: "+Thread.currentThread().getName());
		
		System.out.println("수고하셨습니다.");
	}
}
