package com.pong.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import com.pong.Main;
import com.pong.clients.Client;


public class NetworkManager {

	
	DatagramSocket socket;
	

	public NetworkManager() throws SocketException {
		socket = new DatagramSocket();
		
		Thread registeringThread = new Thread(new RegisteringThread(), "registeringThread");
		registeringThread.start();
		
		
		//lancer les threads
	}
	
	
	public void computePacket(Ports port, InetAddress ip, String data) {
		if(port == Ports.REGISTERING) {
			if(data.equals("#heho$")) {
				Main.clientsManager.registerClient(ip);
				System.out.println("[registering thread] demande d'enregistrement reçue de " + ip.toString());
			}
			
		} else if(port == Ports.CLIENT_1){
			
			
		} else if(port == Ports.CLIENT_2) {
			
			
		}
	}
	
	
	public void sendPacket(InetAddress ip, int port, String message) throws IOException {
		byte[] data = message.getBytes();
		//InetAddress adresse = InetAddress.getByName(ip);
		InetAddress adresse = ip;
		DatagramPacket dp = new DatagramPacket(data, data.length, adresse, port);
		socket.send(dp);
	}
	
	
}
