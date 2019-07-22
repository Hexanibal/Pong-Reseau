package com.pong.utils;

public enum Const {

	WIDTH(1280),
	HEIGTH(720);
	
	
	int value;
	private Const(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
}
