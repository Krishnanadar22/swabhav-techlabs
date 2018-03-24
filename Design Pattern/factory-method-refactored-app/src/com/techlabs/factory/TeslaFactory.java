package com.techlabs.factory;
public class TeslaFactory implements IAutomobileFactory {

	private static TeslaFactory teslaFactory;

	private TeslaFactory() {

	}

	public static IAutomobileFactory getInstance() {
		if (teslaFactory == null) {
			teslaFactory = new TeslaFactory();
		}
		return (teslaFactory);
	}

	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub
		return (new Tesla());
	}

}
