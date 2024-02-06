package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// URLConneting 클래스 : 원격지 서버 자원의 결과와 원격지 서버의 **헤더 정보를 가져올 수 있다.
// 나중에 xml과 json 파일을 작업할 때 많이 쓸 클래스

public class Ex01 {
	public static void main(String[] args) {
		// 여기서 가져오는 서버 데이터는 문자열 데이터이다.
		// 파일이나 컴퓨터 문자가 아니기 때문에 겹합 스트림을 써줘야한다.
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 내컴퓨터에 저장
		String pathname = "D:/jjh/util/webPage02.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		
		try {
			URL url = new URL("https://comic.naver.com/index");
			URLConnection con = url.openConnection();
			
			is = con.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String msg = null;
			StringBuilder sb = new StringBuilder();
			// msg에는 readLine을 통해 한줄씩 계속 저장된다.
			// 겹쳐서 한번에 저장되는 것은 sb 객체에 저장되는 것이다.
			// 즉, 최종적으로 msg에는 null
			// sb객체에는 string의 나열들이 저장되는 것이다.
			while ((msg = br.readLine())!= null) {
				sb.append(msg+"\n");
			}
			
			// 컴퓨터가 파일로 출력하기 때문에
			// outputstreamwriter가 필요없다.
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
			// 헤더 정보를 가지고 웹브라우저가 해석하고 실행한다.
			// 헤더 정보를 얻자
			Map<String, List<String>> map = con.getHeaderFields();
			for (String k : map.keySet()) {
				System.out.println(k+ ":"+map.get(k));
			}
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		}
	}
}
