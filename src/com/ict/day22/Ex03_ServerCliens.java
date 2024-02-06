package com.ict.day22;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex03_ServerCliens implements Runnable{
	Socket s;
	Ex03_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;
	String ip;
	public Ex03_ServerCliens(Socket s, Ex03_Server server ) { 
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
			ip = s.getInetAddress().getHostAddress();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		esc:while (true) {
			try {
				Object obj = in.readObject();
				Ex03_Protocol p = (Ex03_Protocol)obj;
				switch (p.getCmd()) {
				case 0:
					out.writeObject(p);
					break esc;
				case 1:	
					p.setMsg(ip+":"+p.getMsg());
					server.sendMsg(p);
					break;
				case 2: 
					server.picture(p);
					break;
					
				default:
					break;
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			out.close();
			in.close();
			s.close();
			server.removeClient(this);
			Ex03_Protocol p2 = new Ex03_Protocol();
			p2.setCmd(1);
			p2.setMsg(ip+"님 퇴장");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
