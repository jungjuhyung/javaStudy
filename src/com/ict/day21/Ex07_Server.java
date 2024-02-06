package com.ict.day21;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex07_Server {
	ArrayList<Ex07_ServerClients> list = null;
	ServerSocket ss = null;
	public Ex07_Server() {
		list = new ArrayList<Ex07_ServerClients>();
		try {
			ss = new ServerSocket(7007);
			System.out.println("서버 시작!!");
			play();
			
		} catch (Exception e) {
		}
	}
	
	public void play() {
		while (true) {
			try {
				// 접속자가 올 때까지 기다리는 중
				Socket s = ss.accept();
				System.out.println("소켓 시작");
				// 접속자 정보를 가진 소켓이 인자s
				// **list를 활용한 sendMsg()와 removeClient()를
				// 사용하기 위해서 this를 인자로 보낸다.
				// this는 Ex07_Server 자신을 뜻한다.
				Ex07_ServerClients clients = new Ex07_ServerClients(s, this);
				new Thread(clients).start();
				list.add(clients);
				
				// 접속시 누구누구 입장 한번 하기
				String msg = "**"+clients.ip + "님 입장";
				// PrintWritet는 끝 표시 안함
				//msg+= System.lineSeparator();
				sendMsg(msg);
			} catch (Exception e) {
			}
		}
	}
	// 모든 사람에게 메세지 전달
	public void sendMsg(String msg) {
		// 모든 사람은 리스트 안에 존재
		// 클라이언트 중 아무나 문자를 보내면
		// 해당 문자가 리스트에 있는 모든사람에게 보여짐
		for (Ex07_ServerClients k : list) {
			k.out.println(msg);
			
		}
	}
	// 인자로 들어온 객체를 리스트에서 삭제
	public void removeClient(Ex07_ServerClients sc) {
		list.remove(sc);
	}
	public static void main(String[] args) {
		new Ex07_Server();
	}
}
