package com.ict.day13;
// 인터페이스(접점, 공유 영역) : 서비스를 제공하는 목록
//			상수와 추상메서드로 구성되어있음
//			생성자가 없음 (객체 생성 안됨)
//			상속과 달리 인터페이스는 하나의 클래스가 둘 이상의 인터페이스를 동시에 구현 할 수 있다.
//			인터페이스가 같다라는 뜻은 대체가 가능하다는 뜻이다.
//			ex) c타입 usb(인터페이스)가 같으면 아이폰, 안드로이드폰 상관 없이 충전 및 정보교환이 가능하다.
//			인터페이스는 부모만 될 수 있으며 class의 자식으로 될 수 없다.
//			java 8 버전부터 지원 : 1. static 메서드 추가, 2. default 메서드(완전한 메서드) 추가 (나중에 활용할 것)
//			java8지원 내용은 일단 무시하고 나중에 사용할 때가 왔을 때 사용해도 됨
class Ex01 {
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
}
// 이렇게 한 파일에서 클래스를 2개 만들때는 public을 지워주는 것이 좋다. 그래야 오류가 안남
interface Ex02{
	// 원래는 상수명을 대문자로 만들어야함
	// 아무리 변수 형태로 만들어도 interface에서는
	// 전부 static final로 만들어버린다.
	// 정확하게는 interface에서 작성된 필드는 static final이 생략되어있는것이다.
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
	// 일반클래스에서는 추상 메서드와 클래스에 무조건 abstract를 작성해줘야한다.
	// 그러나 interface에서는 abstract를 생략해도 자동으로 붙어있다. 
	// public void like(){}; {}가 있는 일반메서드는 오류남
	public abstract void sound();
	public void play();
}