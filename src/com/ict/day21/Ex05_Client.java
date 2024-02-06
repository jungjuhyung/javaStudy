package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_Client {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Socket socket = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 서버에 접속
			socket = new Socket("192.168.0.31", 7000);
			
			// 출력 스트림 얻고 문자열 보내기
			// 클라이언트 소켓에는 서버의 입출력 스트림이 있다.
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			System.out.print("메세지 입력 : ");
			String msg = scan.next();
			bw.write(msg+"\n"); // 알아보기
			bw.flush();
			
			// 서버가 보낸 입력스트림 얻기
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String re_msg = br.readLine();
			System.out.println("받은 정보 : "+re_msg);

		} catch (Exception e) {
			System.out.println("클라이언트 오류");
		}finally {
			try {
				os.close();
				osw.close();
				bw.close();
				br.close();
				isr.close();
				is.close();
				socket.close();
			} catch (Exception e2) {
			}
		}
	}
}
