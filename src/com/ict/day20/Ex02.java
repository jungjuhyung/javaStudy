package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// PrintStream은 모든 데이터를 출력할 수 있다.
// 입력Stream 없음
// 기본생성자가 없어서 BufferedStream처럼 InputStream, OutputStream을 상속 받은 클래스를 사용
public class Ex02 {
	public static void main(String[] args) {
		String pathname = "D:/jjh/util/test04.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream(file);
			ps = new PrintStream(fos);
			
			// out 맴버필드는 반환값이 PrintStream이다.
			// 그래서 println은 PrintStream의 메서드이다.
			// system은 모니터에 출력되는 것이고
			// ps는 fos를 따라가기 때문에 파일에 찍히는 것이다.
			// 즉 PrintStream이 따라가는 객체에 따라 출력되는 것이 다르다.
			System.out.println();
			ps.println('A');
			ps.println(false);
			ps.println(3.14);
			ps.println("Hello World");
			ps.println(92);
			ps.println("환영합니다.");
			ps.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		

	}
}
