package com.ict.day20;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// objectInputStream : 객체 입력 스트림
// readObject() -> 객체 역직렬화 메서드

public class Ex09_Input {
	public static void main(String[] args) {
		String pathname = "D:/jjh/util/object01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 1. 한개 일 때(원래대로 되돌린다.)
			// 다시 클래스화된다.
			// 반환형이 object이기 때문에 (Ex09_VO)로 캐스팅해줘야한다.
			//Ex09_VO vo = (Ex09_VO) ois.readObject();
			
			// 직렬화 객체가 1개일 때 화면에 출력
			//System.out.println("이름\t나이\t몸무게\t성별");
			//System.out.print(vo.getName()+"\t");
			//System.out.print(vo.getAge()+"\t");
			//System.out.print(vo.getWeight()+"\t");
			//if (k.isGender()) {
				//System.out.println("남성");
			//}else {
				//System.out.println("여성");
			//}
			
			
			// 2. 여러개 일 때
			// 저장된 형태로 받아야한다. 여기서는 ArrayList
			ArrayList<Ex09_VO> list = (ArrayList<Ex09_VO>) ois.readObject();
			for (Ex09_VO k : list) {
				System.out.println("이름\t나이\t몸무게\t성별");
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getWeight()+"\t");
				if (k.isGender()) {
					System.out.println("남성");
				}else {
					System.out.println("여성");
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
