package com.pong.game;

import com.pong.utils.Const;
import com.pong.utils.Vector;

public class Ball {

	
	Vector pos;
	Vector velocity;
	
	
	public Ball() {
		pos = new Vector(Const.WIDTH.getValue() / 2, Const.HEIGTH.getValue() / 2);
		velocity = new Vector(0, 0);
	}
	
	
	public void update() {
		
	}
	
}
