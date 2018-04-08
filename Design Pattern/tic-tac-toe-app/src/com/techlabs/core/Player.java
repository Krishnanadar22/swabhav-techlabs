package com.techlabs.core;

public class Player {
	private Mark mark;
	private String name;

	public Player(String name, Mark m) {
		this.mark = m;
		this.name = name;
	}

	public Mark getMark() {
		return this.mark;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
