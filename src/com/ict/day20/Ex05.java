package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// FileInputStream => 1byte, read() => 아스키코드(숫자)(숫자,대/소문자 표현), read(byte[] b)
// FileReader => 2byte, read() => 유니코드(숫자)(전세계문자 표현가능), read(char[] c) => String 이용
// **FileReader는 문자 한개씩 읽는다.
public class Ex05 {
	public static void main(String[] args) {
		String pathname = "D:/jjh/util/test05.txt";
		File file = new File(pathname);
		
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			// 한글자 읽기(숫자=>형변환 해야함)
			// int k = fr.read(); // 유니코드 숫자가 나온다.
			// System.out.println(k+":"+(char)(k));
			
			//전체읽기(while)
			//int k = 0;
			//while ((k=fr.read()) != -1) {
			//System.out.println(k+":"+(char)(k));
			//}
			
			// 배열처리
			//char[] c = new char[(int) file.length()];
			//fr.read(c);
			//for (char k : c) {
				//System.out.print(k);
			//}
			char[] c = new char[(int) file.length()];
			fr.read(c);
			//String msg = new String(c).trim(); // 파일에 있는 공백에 의해 깨진 문자 제거를 위해 trim()사용
			//System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
