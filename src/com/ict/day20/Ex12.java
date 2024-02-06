package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// URL(Uniform Resource Locator) : 인터넷에서 접근 가능한 자원의 주소(위치)
//	=> URL은 폴더까지의 주소 느낌이고
//	=> URL는 해당 폴더 안에 있는 특정 자료의 위치 주소 느낌이다.
// 	=> URL주소 뒤에 붙는 특정 자료의 주소를 식별자라고 한다.
// URL 클래스 : 해당 위치의 자원의 결과만 가져온다.
//				final 클래스이다. 상속이 안된다.(자식클래스를 못만든다.)
public class Ex12 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 내컴퓨터에 저장
		String pathname = "D:/jjh/util/webPage01.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL("https://comic.naver.com/index");
			// 원래 InputStream에 읽을 타겟을 넣고 쓴다
			// 여기서는 타겟이 홈페이지 url이기 때문에
			// url.openStream을 씀으로써 홈페이지의 컴퓨터 데이터형태를 받는다.
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			// 여러 줄의 스트림을 저장하기 위해서 StringBuffer 나 StringBuilder를 사용한다.
			// String은 불변성을 가지고 있기 때문에 string에 문자열을 더하거나 추가하면
			// 기존 객체에 저장되는 것이 아니라 새로운 객체를 생성해서 저장하고
			// 기존 객체의 참조값을 새로운 객체가 참조한다.
			// 이후 참조가 끊긴 기존 객체는 java에만 있는 가비지 컬렉션이 일정이상 모이면 삭제해준다.
			// 그래서 일반 read로 읽게 되면 수많은 string객체가 생성되고 지워진다.
			// 여기서 +를 하게되면 계속해서 쓰레기 객체가 늘어나기 때문에
			// StringBuffer를 쓰면 고유 메서스 append()를 통해
			// 객체를 새롭게 생성하지 않고 기존 객체의 뒤에 붙여넣을 수 있다.
			StringBuffer sb = new StringBuffer();
			// StringBuilder sb = new StringBuilder();
			while ((msg=br.readLine())!= null) {
				// 화면에 출력
				// System.out.println(msg+"\n");
				sb.append(msg+"\n"); // sb.append의 반환형은 StringBuffer이다.
				// 따라서 해당 객체를 sb.toStirng을 통해 string형으로 바꿔줘야한다.
			}
			fw = new FileWriter(file);
			bw =new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();

		
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				fw.close();
				isr.close();
				br.close();
				is.close();
			} catch (Exception e2) {
			}
		}
	}
}
