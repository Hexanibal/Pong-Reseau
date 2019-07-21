package com.pong.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import com.pong.Main;

public class Port5010Thread implements Runnable{

	@Override
	public void run() {
		while(true) {

			try {

				DatagramSocket server = new DatagramSocket(Ports.CLIENT_1.getValue());

				while(true){

					byte[] buffer = new byte[128];
					DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
					
					System.out.println("[Port 5010] en attente");
					
					server.receive(packet);


					String data = new String(packet.getData());
					InetAddress ip = packet.getAddress();
					Main.net.computePacket(Ports.CLIENT_1, ip, data);
					
					
					packet.setLength(buffer.length);
				}
				
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
