package com.ict.day09;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex17 t = new Ex17();
		// 첫번째 숫자 : 
		System.out.print("첫번째 숫자를 입력해주세요>>> ");
		int su1 = scan.nextInt();
		// 두번째 숫자 : 
		System.out.print("두번째 숫자를 입력해주세요>>> ");
		int su2 = scan.nextInt();
		// 연산자 : +, -, /, *
		System.out.print("시행하려는 연산자(+,-,*,/) 입력 >>> ");
		String mun = scan.next();
		// switch case 사용하면 좀더 간편함
		if (mun.equals("+")) {
			t.plus(su1, su2);
			int res18 = t.res;
			System.out.println(su1+mun+su2+"="+res18);
		}else if (mun.equals("-")) {
			t.sub(su1, su2);
			int res18 = t.res;
			System.out.println(su1+mun+su2+"="+res18);
		}else if (mun.equals("*")) {
			int res18 =t.mul(su1, su2);
			System.out.println(su1+mun+su2+"="+res18);
		}else if (mun.equals("/")){
			double res18 = t.div(su1, su2);
			System.out.println(su1+mun+su2+"="+res18);
		}
		
	}
}
