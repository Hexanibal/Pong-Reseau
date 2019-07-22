package com.pong.game;

import com.pong.utils.Vector;

public class Pad {

	
	Vector pos;
	
	public Pad() {
		pos = new Vector(0, 0);
	}
	
	
	public void setPos(Vector pos) {
		this.pos = pos;
	}
	
}
