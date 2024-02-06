package com.ict.day03;

import java.util.Scanner;

public class Ex12test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		scan.useDelimiter("/");
		sc.useDelimiter("/");
		System.out.print("next()메서드 사용 : ");
		String a = scan.next();
		System.out.print("nextLine()메서드 사용 : ");
		String b = sc.nextLine();
		System.out.println(a);
		System.out.println(b);

		
	}
}
