package com.pong.network;

public enum Ports {

	REGISTERING(5000),
	CLIENT_1(5010),
	CLIENT_2(5020);
	
	int port;
	private Ports(int port) {
		this.port = port;
	}
	
	public int getValue() {
		return this.port;
	}
}
