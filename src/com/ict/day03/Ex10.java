package com.ict.day03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 패키지가 java.lang에 있는 클래스들은 import를 할 필요 없다.
		// java.lang 이외에 존재하는 클래스를 사용하기 위해서는 import를 해야된다.
		// 해당 클래스의 위치를 표시하므로 해당
		
		// 키보드에 입혁한 정보를 받아서 변수에 저장
		Scanner scan = new Scanner(System.in);
		// 위의 코드가 작동하면 키보드로 입력값을 받을 때까지 기다린다.
		// 무엇을 입력할지 보여주기 위해 println이 아닌 print를 통해 메세지를 출력
		System.out.print("이름 : ");
		
		// Scanner에서 선언한 변수명.next() 메서드는 Scanner에 의해 키보드로 입력한 데이터를 꺼내서 String형으로 처리하는 것
		// =로 연결된 것을 통해 scan.next()의 자료형과 String의 자료형과 같다는 것을 알 수 있다.
		// 이상태에서 숫자를 입력해도 문자열로 저장한다.
		String name = scan.next();
		System.out.println("당신의 이름 : " + name);
		
		// String형으로 저장된 나이라서 문자끼리 연결된다.
		System.out.print("나이 : ");
		String age = scan.next();
		System.out.println("당신의 나이 : " + (age+1));
		
		// Scanner에서 선언한 변수명.nextInt() 메서드는 Scanner에 의해 키보드로 입력한 데이터를 int형으로 처리하는 것
		// 이때는 숫자가 아닌 문자를 넣으면 오류가 난다.(char형, 실수형도 오류가 난다.), int라서 오직 정수형만 들어감
		System.out.print("나이2 : ");
		int age2 = scan.nextInt();
		System.out.println("당신의 나이2 : " + (age2+1));
		
		// .nextDouble() : 입력한 내용을 double형으로 처리하는 매서드
		// 정수를 넣어도 실수형으로 형변환 해준다.
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.println("당신의 키 : " + height);
		
		
	}
}
