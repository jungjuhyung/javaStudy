package com.ict.day22;

import java.awt.Color;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex03_Server {
	ArrayList<Ex03_ServerCliens> list;
	ServerSocket ss;
	public Ex03_Server() {
		while (true) {
			try {
				list = new ArrayList<Ex03_ServerCliens>();
				ss = new ServerSocket(7777);
				System.out.println("서버 시작~~~");
				
				play();
				
			} catch (Exception e) {
			}
		}
	}
	
	private void play() {
		while (true) {
			try {
				Socket s = ss.accept();
				Ex03_ServerCliens sc = new Ex03_ServerCliens(s, this);
				new Thread(sc).start();
				list.add(sc);
			} catch (Exception e) {
			}
		}
	}
	// 메세지 전달
	public void sendMsg(Ex03_Protocol p) {
		for (Ex03_ServerCliens k : list) {
			try {
				k.out.writeObject(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// 리스트 삭제
	public void removeClient(Ex03_ServerCliens sc) {
		list.remove(sc);
	}
	// 그림 그리기
	public void picture(Ex03_Protocol p) {
		for (Ex03_ServerCliens k : list) {
			try {
				k.out.writeObject(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new Ex03_Server();
	}
}
