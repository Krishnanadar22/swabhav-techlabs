package com.techlabs.inheritance;

public class Boy extends Man {
	public Boy() {
		System.out.println("Boy created");
	}

	static {
		System.out.println("Static in Boy");
	}

	public void walk() {
		System.out.println("Boy is walking");
	}

	@Override
	public void play() {
		System.out.println("Boy is Playing");
	}
}
