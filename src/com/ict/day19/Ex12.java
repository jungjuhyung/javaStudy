package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//  D:/jjh/util/image01.jpg 파일을 D:/jjh/image01.jpg로 복사하자
public class Ex12 {
	public static void main(String[] args) {
		// outputPath의 자식 경로의 이름을 바꾸면 이름 바꿔서 생성
		String inputPath = "D:/jjh/util/image01.jpg";
		String outputPath = "D:/jjh/img-01.jpg";
		
		File in_file = new File(inputPath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		File out_file = new File(outputPath);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while ((b=bis.read())!= -1) {
				bos.write(b);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				bis.close();
				fos.close();
				fis.close();
				// in_file.delete(); // try문 안에서는 in_file을 사용중이라 삭제를 못한다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
