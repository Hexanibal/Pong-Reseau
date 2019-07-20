package com.pong.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class NetworkManager {

	
	DatagramSocket socket;
	

	public NetworkManager() throws SocketException {
		socket = new DatagramSocket();
		
		Thread registeringThread = new Thread(new RegisteringThread(), "registeringThread");
		registeringThread.start();
	}
	
	
	public void sendPacket(String ip, int port, String message) throws IOException {
		byte[] data = message.getBytes();
		InetAddress adresse = InetAddress.getByName(ip);
		DatagramPacket dp = new DatagramPacket(data, data.length, adresse, port);
		socket.send(dp);
	}
	
	
}
