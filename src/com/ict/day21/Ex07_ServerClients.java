package com.ict.day21;

import java.awt.SystemColor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.net.Socket;
import java.util.ArrayList;


public class Ex07_ServerClients implements Runnable {
	Socket s;
	Ex07_Server server;
	
	BufferedReader in;
	PrintWriter out;
	String ip;
	
	public Ex07_ServerClients(Socket s, Ex07_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true); // true이면 flush 안써도 자동으로 해줌
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				// PrintWritet는 끝 표시 안함
				//msg+=System.lineSeparator();
				if (msg.equalsIgnoreCase("exit")) {
					// 이건 자신만 보임
					String exit = "bye";
					// PrintWritet는 끝 표시 안함
					//exit+=System.lineSeparator();
					out.println(exit);
					break;
				}
				server.sendMsg(ip+":"+msg);
				
			} catch (Exception e) {
			}
		}
		// 자기 자신 list에서 삭제
		server.removeClient(this);
		String msg2 = ip + "님 퇴장";
		// PrintWritet는 끝 표시 안함
		//msg2+=System.lineSeparator();
		// 이미 자신은 list에서 빠졌기 때문에 자신 제외 모두에게 보내기
		server.sendMsg(msg2);
	}

}
