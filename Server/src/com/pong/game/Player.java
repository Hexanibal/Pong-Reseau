package com.pong.game;

import com.pong.network.Client;

public class Player {

	
	private Client client;
	
	private Pad pad;
	
	
	public Player(Client client) {
		this.client = client;
		pad = new Pad();
	}
	
	
	public Pad getPas() {
		return this.pad;
	}
}
