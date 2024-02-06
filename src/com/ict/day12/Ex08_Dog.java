package com.ict.day12;

// 추상클래스 상속
// 1. 일반적인 클래스가 추상클래스를 상속하면 
// 	일반적인 클래스는 추상메서드를 오버라이딩해서 구체화한다.
class Ex08_Dog extends Ex08_Animal {

	@Override
	public void sound() {
		System.out.println("멍~ 멍~");
	}
}
// 2. 추상클래스가 추상클래스를 상속하면 오버라이딩을
// 		하지 않아도 된다.
// 자신이 추상메서드가 없어도 부모가 추상 메서드를 가진채 상속 받게되면
// 자식 클래스도 추상클래스로 설정해줘야하낟.
abstract class Ex08_Cat extends Ex08_Animal{
	
}
// 3. 부모의 추상메서드를 해결해도 자신이 추상 메서드를 가지고 있으면
//		추상 클래스로 해줘야한다.
abstract class Ex08_Cow extends Ex08_Animal{
	@Override
	public void sound() {
		System.out.println("음메~~");
	}
	public abstract void like();
}
// 4. 굳이 부모 추상 메서드를 해결해주지 않아도
// 		자신이 추상 메서드가 있으면 추상 클래스로 분류해야한다.
abstract class Ex08_chicken extends Ex08_Animal{
	public abstract void sleep();
}

// 5. 부모의 부모와 부모의 추상 메서드 두개 다 오버라이딩해야한다.
class Ex08_My_Animal extends Ex08_chicken{

	@Override
	public void sleep() {}
	@Override
	public void sound() {}
}

// 6. Ex08_Cow는 자신의 부모의 추상 메서드는 재정의했으므로
// Ex08_Cow 자신의 추상 메서드만 재정의해주면 된다.
class Ex08_MyAnimal2 extends Ex08_Cow{
	@Override
	public void like() {}
}
