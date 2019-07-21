package com.pong.network;

import java.io.IOException;
import java.net.InetAddress;

import com.pong.Main;

public class Client {

	
	private InetAddress ip;
	private Ports portServer;
	private Ports portClient;
	
	
	public Client(InetAddress ip, Ports portServer) {
		this.ip = ip;
		this.portServer = portServer;
		this.portClient = Ports.CLIENT_RX;
	}
	
	
	
	public void sendData(String data) throws IOException {
		Main.net.sendPacket(ip, portClient, data);
	}
	
	public InetAddress getIp() {
		return ip;
	}
	
	public void setIp(InetAddress ip) {
		this.ip = ip;
	}
	
	public Ports getPortServer() {
		return this.portServer;
	}

}
