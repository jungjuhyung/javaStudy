package com.ict.day22;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex01_ServerCliens implements Runnable {
	Socket s;
	Ex01_Server server;

	// 직렬화(대상 클래스(vo), ObjectInputStream, ObjectOutputStream
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;

	public Ex01_ServerCliens(Socket s, Ex01_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
		}
	}
	
	// 클라이언트가 보낸 프로토콜, 메세지 받기
	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					// 역직렬화
					Ex01_Protocol p = (Ex01_Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 접속해제 (while문 밖에서 처리)
						// 받은 정보는 그대로 자신에게 보낸다.
						out.writeObject(p);
						break esc;
					case 1: // 닉네임 받기
						nickName = p.getMsg();
						p.setCmd(2); // 닉네임 받고 cmd를 2로 바꿈
						p.setMsg(nickName + "님 입장");
						server.sendMsg(p);
						break;
					case 2:
						p.setMsg(nickName + ":" + p.getMsg());
						server.sendMsg(p);
						break;

					default:
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		try {
			// cmd= 0이면 접속해제
			out.close();
			in.close();
			s.close();

			// 자신을 제외한 사람들에게는 메세지 전달을 하자
			server.removeClient(this);
			Ex01_Protocol p = new Ex01_Protocol(2, nickName + "님 퇴장");

			server.sendMsg(p);
		} catch (IOException e) {
		}
	}

}
