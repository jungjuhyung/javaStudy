package com.ict.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		// 바이트 입력 스트림 : InputStream 자식 클래스 FileInputStream 사용
				// 컴퓨터 입장에서는 파일의 데이터를 읽어서 우리에게 보여주거나 넘겨주는게 입력이다.
				//			FileOutputStream : 해당 파일에 내용을 1byte 읽기(입력)
				//	주요메서드 : read() : int -> 숫자(아스키코드(0~255), 한 글자
				//						**해당 숫자를 문자로 보려면 char 형변환 해라
				// 						**만약에 읽을 수가 없으면 -1이 나온다.
				//						**읽을 때 무한루프로 -1이 나올 때 멈출 조건으로 사용할 수 있다.
				// 			read(byte[] b) : 배열에 존재하는 아스키코드 읽기
		
				
				// 파일 만들 위치 지정
				String pathname = "D:/jjh/util/test02.txt";
				File file = new File(pathname);
				FileInputStream fis = null;
				try {
					fis = new FileInputStream(file);
					
					// 1byte 읽기(숫자, 소문자, 대문자 => 한 글자)
					//	int b = fis.read();
					//	System.out.println(b);
					//	System.out.println((char)(b));
					
					// 모든 글자 읽기 : 한글, 한자 깨져서 나옴
					//	int b = 0;
					//	while (true) {
					//	b = fis.read();
					//	if (b==-1)break;
					//	System.out.println(b+":"+(char)(b));
					//	}
					
					// 위의 축약형 
					// int b = 0;
					// while((b=fis.read())!=-1) {System.out.println(b+":"+(char)(b));}
					
					byte[] b = new byte[(int) file.length()];
					// fis가 가리키는 파일의 내용을 byte[] b에 모두 넣어준다.
					fis.read(b);
					// 이렇게 하면 한글, 한자가 안나온다.
					// write의 배열과 다른점은 write는 String 클래스로 byte배열로 만들어서 출력했으며
					// read는 순수히 파일에 있는 아스키 코드를 읽어오는 것이다.
					// for (byte k : b) {
						//System.out.println(k+":"+(char)(k));
					//}
					
					// String을 이용하면 한글, 한자 안 깨짐
					// String 클래스를 통해 파일에 있는 지원 안되면 문자가 변환된것
					String str = new String(b);
					System.out.println(str);
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
	}
}
