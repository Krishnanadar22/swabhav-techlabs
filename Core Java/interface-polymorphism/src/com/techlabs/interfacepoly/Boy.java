package com.techlabs.interfacepoly;

public class Boy implements IMannerable, IEmotionable {
	@Override
	public void cry() {
		System.out.println("Boy is Crying");
	}

	@Override
	public void laugh() {
		System.out.println("Boy is Laughing");
	}

	@Override
	public void wish() {
		System.out.println("Boy is wishing");
	}

	@Override
	public void depart() {
		System.out.println("Boy is departing");
	}
}
