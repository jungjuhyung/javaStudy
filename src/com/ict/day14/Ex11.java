package com.ict.day14;

import java.util.Scanner;

// throws : 예외전가, 예외 양도
//			예외가 발생하면 예외처리를 하지 않고 자신을 호출한 곳으로 예외객체를 전달
//			나중에라도 예외처리를 하는 것이 좋다.(throws로만 끝내지 마라)
public class Ex11 {
	
	// NumberFormatException는 prndata에서 일어났지만 throw에 의해 예외전가되어서 setadata에서 처리했다.
	// 순서를 잘생각해야한다.
	// main => setData => prnData의 오류코드 부분(오류)=>throw=>catch실행
	// 여기서도 try catch를 안해주고 throw를 하면 이전 호출이었던 main쪽으로 넘긴다
	// 그러면 main에서 try catch로 처리해줘야한다.
	public void setData(String str) {
		try {
			if (str.length() >= 1) { // 입력을 한문자라도 했다면 이라는 뜻이다.// str이 null이 아니라면
				String res = str.substring(0,1);
				prnData(res);
			}			
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		}
	}
	
	// 해당 오류가 발생하면 해당 메서드를 호출한 곳으로 해당오류를 던진다.
	public void prnData(String str) throws NumberFormatException {
		int dan = Integer.parseInt(str);
		System.out.println(dan+"단");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan +"*"+i+"="+(dan*i));
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String msg = scan.next();
		Ex11 ex11 = new Ex11();
		
		ex11.setData(msg);
		System.out.println("수고하셨습니다.");
	}
}
