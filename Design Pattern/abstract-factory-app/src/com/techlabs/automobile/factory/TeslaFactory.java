package com.techlabs.automobile.factory;

import com.techlabs.automobile.IAutomobile;
import com.techlabs.automobile.tesla.TeslaHatchBack;
import com.techlabs.automobile.tesla.TeslaSedan;
import com.techlabs.automobile.tesla.TeslaSuv;

public class TeslaFactory implements IAutomobileFactory {

	private static TeslaFactory teslaFactory;

	private TeslaFactory() {

	}

	public static TeslaFactory getInstance() {
		if (teslaFactory == null) {
			teslaFactory = new TeslaFactory();
		}
		return (teslaFactory);
	}

	@Override
	public IAutomobile makeSuv() {
		// TODO Auto-generated method stub
		return new TeslaSuv();
	}

	@Override
	public IAutomobile makeSedan() {
		// TODO Auto-generated method stub
		return new TeslaSedan();
	}

	@Override
	public IAutomobile makeHatchBack() {
		// TODO Auto-generated method stub
		return new TeslaHatchBack();
	}

}
