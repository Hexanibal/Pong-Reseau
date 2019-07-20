package com.pong.clients;

import java.util.ArrayList;

public class ClientsManager {
	
	
	private ArrayList<Client> clients;
	
	
	public ClientsManager() {
		clients = new ArrayList<Client>();
	}
	
	
	
	public void registerClient(String data) {
		System.out.println("packet d'enregistrement reçu: " + data);
	}
	
	public void addClient(Client client){
		clients.add(client);
	}
	
	public void removeClient(Client client) {
		clients.remove(client);
	}
}
