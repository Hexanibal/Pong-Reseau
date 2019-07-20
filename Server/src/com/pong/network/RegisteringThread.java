package com.pong.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import com.pong.Main;

public class RegisteringThread implements Runnable{

	@Override
	public void run() {
		while(true) {

			try {

				DatagramSocket server = new DatagramSocket(5000);

				while(true){

					byte[] buffer = new byte[128];
					DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
					
					System.out.println("[registering thread] en attente");
					server.receive(packet);


					String data = new String(packet.getData());
					Main.clientsManager.registerClient(data);
					
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
