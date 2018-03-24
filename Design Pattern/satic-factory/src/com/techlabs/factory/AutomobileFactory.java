package com.techlabs.factory;

public class AutomobileFactory {
	private AutomobileFactory() {

	}

	public static IAutomobile make(AutoType t) {
		if (t == AutoType.AUDI) {
			return (new Audi());
		}
		if (t == AutoType.BMW) {
			return (new Bmw());
		}
		return (new Tesla());
	}
}
