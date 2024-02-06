package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex06_Client implements Runnable {
	Socket socket = null;
	
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	
	@Override
	public void run() {
			try {
				isr = new InputStreamReader(socket.getInputStream());
				br = new BufferedReader(isr);
				String msg = br.readLine();
				System.out.println("서버로부터 받은 메세지 : "+msg);
			} catch (IOException e) {
				e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Socket socket = null;
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		BufferedReader keyboard = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 서버에 접속
			socket = new Socket("192.168.0.31", 7007);
			
			
			while (true) {
				System.out.println("데이터 입력 : ");
				keyboard = new BufferedReader(new InputStreamReader(System.in));
				String msg = keyboard.readLine();
				
				osw = new OutputStreamWriter(socket.getOutputStream());
				bw = new BufferedWriter(osw);
				bw.write(msg+System.lineSeparator()); // 알아보기 라인 끝표시라고 함
				bw.flush();
				
				Thread thread =  new Thread(new Ex06_Client());
				thread.start();
					
			}
			
		} catch (Exception e) {
		}
	}
}
