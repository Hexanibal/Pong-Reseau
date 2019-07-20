package com.pong.clients;

import java.io.IOException;
import java.net.InetAddress;

import com.pong.Main;

public class Client {

	
	private InetAddress ip;
	private int port;
	
	public Client(InetAddress ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	
	
	public void sendData(String data) throws IOException {
		Main.net.sendPacket(ip, port, data);
	}
	
	public InetAddress getIp() {
		return ip;
	}
	
	public void setIp(InetAddress ip) {
		this.ip = ip;
	}

}
