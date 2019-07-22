package com.pong.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import com.pong.Main;

public class RegisteringThread implements Runnable{

	@SuppressWarnings("resource")
	@Override
	public void run() {
		while(true) {

			try {

				DatagramSocket server = new DatagramSocket(Ports.REGISTERING.getValue());

				while(true){

					byte[] buffer = new byte[6];
					DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
					
					//System.out.println("[registering thread] en attente");
					
					server.receive(packet);


					String data = new String(packet.getData());
					InetAddress ip = packet.getAddress();
					Main.net.computePacket(Ports.REGISTERING, ip, data);
					
					//System.out.println("[registering thread] Packet reçu de " + ip.toString());
					
					System.out.print(data);
					
					
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
