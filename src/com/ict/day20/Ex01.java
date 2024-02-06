package com.ict.day20;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DataInputStream과 DataOutputStream
// 기본 자료형의 데이터를 주고 받을 때 사용
// **반드시 입력순서와 출력순서를 맞춰야 한다.
// 기본생성자가 없어서 BufferedStream처럼 InputStream, OutputStream을 상속 받은 클래스를 사용
// 그냥 파일을 열어서 읽을 수 없으며 DataInputStream을 이용해서만 읽을 수 있다.

public class Ex01 {
	public static void main(String[] args) {
		String pathname = "D:/jjh/util/test03.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		DataOutputStream dos = null; // buffered 대신 사용
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			// writeXXXX(), XXXX = 기본자료형
			dos.writeChar(97);
			dos.writeChar('D');			
			dos.writeBoolean(true);
			dos.writeDouble(178.95);
			dos.writeInt(84);
			dos.writeChar('가');
			dos.flush();
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// readXXXX(), XXXX = 기본자료형
			// output했던 순서 그대로 input해야한다.
			// 순서가 바뀌면 바뀐부분은 전혀 다른값이 나온다.
			System.out.println("1번 : "+dis.readChar());
			System.out.println("2번 : "+dis.readChar());
			System.out.println("3번 : "+dis.readBoolean());
			System.out.println("4번 : "+dis.readDouble());
			System.out.println("5번 : "+dis.readInt());
			System.out.println("6번 : "+dis.readChar());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				fos.close();
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}
