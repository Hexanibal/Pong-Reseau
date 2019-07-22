package com.pong;
import java.net.SocketException;

import com.pong.game.Pong;
import com.pong.network.ClientsManager;
import com.pong.network.NetworkManager;


public class Main {
	
	
	public static NetworkManager net;
	public static ClientsManager clientsManager;
	public static Pong pong;
	
	public static void main(String[] args) throws SocketException {

		net = new NetworkManager();
		clientsManager = new ClientsManager();
		pong = new Pong();
		
	}

}
