package com.ict.day20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// PritStream은 모든 데이터 출력 가능
// PrintWriter는 모든 데이터 출력가능 + (OutputSteam(바이트출력), Writer(문자출력) 둘다 가능)
public class Ex07 {
	public static void main(String[] args) {
		// Writer
		String pathname = "D:/jjh/util/test07.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		PrintWriter pw = null;
		
		// byteStream도 해보자
		String pathname2 = "D:/jjh/util/test08.txt";
		File file2 = new File(pathname2);
		FileOutputStream fos = null;
		PrintWriter pw2 = null;
		try {
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
					
			pw.println("PrintWriter 연습");
			pw.println(false);
			pw.println(123456);
			pw.println(179.62);
			pw.println('A');
			pw.flush();
			
			// byteStream으로 해보기
			fos = new FileOutputStream(file2);
			pw2 = new PrintWriter(fos);
			pw2.println("PrintWriter 연습2");
			pw2.println(false);
			pw2.println(123456);
			pw2.println(179.62);
			pw2.println('A');
			pw2.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pw2.close();
				fos.close();
				pw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		
		
		
		
		
		
		
	}
}
