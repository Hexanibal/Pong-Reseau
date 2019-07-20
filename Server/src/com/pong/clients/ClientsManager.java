package com.pong.clients;

import java.net.InetAddress;
import java.util.ArrayList;

public class ClientsManager {
	
	
	private ArrayList<Client> clients;
	
	
	public ClientsManager() {
		clients = new ArrayList<Client>();
	}
	
	
	Client client;
	public void registerClient(InetAddress ip) {
		client = new Client(ip, (clients.size() == 0) ? 5010 : 5020);
		addClient(client);
	}
	
	public void addClient(Client client){
		clients.add(client);
	}
	
	public void removeClient(Client client) {
		clients.remove(client);
	}
	
	public Client getClient(InetAddress ip) {
		for(Client client : clients) {
			if(ip == client.getIp())
				return client;
		}
		return null;
	}
}
