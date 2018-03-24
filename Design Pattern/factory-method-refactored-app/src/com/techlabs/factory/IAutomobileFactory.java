package com.techlabs.factory;

public interface IAutomobileFactory {
	public IAutomobile make();

	public static IAutomobileFactory getInstance() {
		return null;
	}
}
