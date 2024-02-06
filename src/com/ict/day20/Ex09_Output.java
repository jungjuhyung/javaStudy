package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

// ObjectOutputStream : 객체 출력 스트림
// writeObject() : 객체 직렬화 메서드
public class Ex09_Output {
	public static void main(String[] args) {
		// 1. VO를 객체로 만들자
		Ex09_VO vo1 = new Ex09_VO("고길동", 17, 49.6, true);
		Ex09_VO vo2 = new Ex09_VO("이길동", 27, 59.6, false);
		Ex09_VO vo3 = new Ex09_VO("임길동", 37, 69.6, true);
		Ex09_VO vo4 = new Ex09_VO("가길동", 47, 79.6, true);
		Ex09_VO vo5 = new Ex09_VO("나길동", 57, 89.6, false);
		Ex09_VO vo6 = new Ex09_VO("박길동", 67, 99.6, false);
		Ex09_VO vo7 = new Ex09_VO("임길동", 77, 19.6, false);
		Ex09_VO vo8 = new Ex09_VO("배길동", 87, 29.6, true);
		
		// 직렬화(지금은 파일로 저장)
		String pathname = "D:/jjh/util/object01.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 객체 직렬화(객체 1개 보낼 때)
			//oos.writeObject(vo1);
			//oos.flush();
			
			// 객체 직렬화(객체가 여러개 일 때)
			// 객체를 컬렉션으로 모으자
			ArrayList<Ex09_VO> list = new ArrayList<Ex09_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			list.add(vo6);
			list.add(vo7);
			list.add(vo8);
			
			// 객체 직렬화(컬렉션 보내기)
			// 직렬화는 줄이 바뀌지 않고 들어간다.
			oos.writeObject(list);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
