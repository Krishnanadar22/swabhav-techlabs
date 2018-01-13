package com.techlabs.inheritance;

public class Man {
	public Man() {
		System.out.println("Man created");
	}

	static {
		System.out.println("Static in Man");
	}

	public void eat() {
		System.out.println("Man is Eating");
	}

	public void play() {
		System.out.println("Man is Playing");
	}

	public void read() {
		System.out.println("Man is Reading");
	}
}
