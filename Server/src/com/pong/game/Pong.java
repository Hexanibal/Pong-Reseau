package com.pong.game;

import com.pong.Main;

public class Pong {

	
	private Ball ball;
	private Player[] player;
	
	
	public Pong() {
		player[0] = new Player(Main.clientsManager.getClientByIndex(0));
		player[1] = new Player(Main.clientsManager.getClientByIndex(1));

		ball = new Ball();
	}
	
	
	public void update() {
		ball.update();
	}
}
