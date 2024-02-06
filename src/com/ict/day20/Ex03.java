package com.ict.day20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// FileOutputStream => 1byte, write(int(아스키 코드) c), write(byte[] b)
// FileWriter = 2byte, white(int c), write(char[] c), write(String str)
public class Ex03 {
	public static void main(String[] args) {
		String pathname = "D:/jjh/util/test05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			String str = "안녕하세요\n123456\nhello\n";
			fw.write(str);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
