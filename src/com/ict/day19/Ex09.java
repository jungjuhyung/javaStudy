package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 스트림은 지연이 될 수 있으므로 Buffer(임시기억)를 이용해서 지연 현상을 해결한다.
// BufferedOutputStream 사용 // 혼자서는 사용 안됨, 무조건 OutputStream과 함께 사용해야함
public class Ex09 {
	public static void main(String[] args) {
		String pathname = "D:/jjh/util/exam01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			// buffer처럼 위의 객체가 아래 객체로 연결되서 작동하는 것을
			// 체인 방식이라고 한다.
			// 매개변수로 true를 넣으면 이어쓰기가 된다
			// 매개변수가 없으면 디폴트값은 false로 덮어쓰기 된다.
			fos = new FileOutputStream(file, true);
			bos = new BufferedOutputStream(fos);
			
			String msg = "한국 ICT 인재 개발원 \n5강의장 \n자바 실습중\n";
			byte[] b = msg.getBytes();
			bos.write(b);
			
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close(); // fos를 받아서 사용하기 때문에 bos를 먼저 닫는다.
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
