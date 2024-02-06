package com.ict.day20;

import java.net.InetAddress;
import java.net.UnknownHostException;

// InetAddress : 자바에서 IP주소를 표현하는 클래스
//				생성자는 존재하지만 사용하지 못함
//				6개의 static 메서드를 이용한다.
// 				** localhost란 현재 내가 사용하고 있는 컴퓨터를 말한다.
public class Ex11 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost(); // 내컴퓨터 주소
			System.out.println("이름 : "+addr.getHostName());
			System.out.println("주소 : "+addr.getHostAddress());
			System.out.println("toString : "+addr.toString());
			
			// 이름으로 확인하기
			System.out.println("1==================");
			addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름 : "+addr.getHostName());
			System.out.println("주소 : "+addr.getHostAddress());
			System.out.println("toString : "+addr.toString());
			System.out.println("2==================");
			addr = InetAddress.getByName("m.naver.com");
			System.out.println("이름 : "+addr.getHostName());
			System.out.println("주소 : "+addr.getHostAddress());
			System.out.println("toString : "+addr.toString());
			System.out.println("3==================");
			
			// 주소로 확인하기
			byte[] b = {(byte)223,(byte)130,(byte)195,(byte)200};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : "+addr.getHostName());
			System.out.println("주소 : "+addr.getHostAddress());
			System.out.println("toString : "+addr.toString());
			System.out.println("4==================");
			
			InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress k : arr) {
				System.out.println("이름 : "+k.getHostName());
				System.out.println("주소 : "+k.getHostAddress());
				System.out.println("toString : "+k.toString());
				System.out.println("5==================");
				
			}
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
