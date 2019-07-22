package com.pong.network;

import java.net.InetAddress;
import java.util.ArrayList;

import com.pong.Main;

public class ClientsManager {
	
	
	private ArrayList<Client> clients;
	
	
	public ClientsManager() {
		clients = new ArrayList<Client>();
	}
	
	
	Client client;
	public void registerClient(InetAddress ip) {
		if(clients.size() > 1) return;
		
		client = new Client(ip, (clients.size() == 0) ? Ports.CLIENT_1 : Ports.CLIENT_2);
		addClient(client);
		Main.net.runThread(client.getPortServer());
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
	
	public Client getClientByIndex(int index) {
		return (index != 0 && index != 1) ? null : (index == 0) ? clients.get(0) : clients.get(1);
	}
}
