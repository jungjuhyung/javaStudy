package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex05_Server {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			server = new ServerSocket(7000);
			System.out.println("서버 대기중...");
			// 클라이언트가 요청하기 전까지는 블록킹 된다.
			socket = server.accept();
			System.out.println("accept 이후");
			
			// 입력 스트림 얻기
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			// 서버에 접속한 ip주소 얻기
			String ip = socket.getInetAddress().
					getHostAddress();
			// 들어온 문자 출력하기
			System.out.println(ip+":"+msg);

			// 클라이언트에게 보낼 출력 스트림 얻기
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg);
			bw.flush();
			
		} catch (IOException e) {
			System.out.println("서버오류");
		}finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				osw.close();
				os.close();
			} catch (Exception e) {
			}
		}
	}
}
