package com.techlabs.automobile.factory;

import com.techlabs.automobile.IAutomobile;
import com.techlabs.automobile.bmw.BmwHatchBack;
import com.techlabs.automobile.bmw.BmwSedan;
import com.techlabs.automobile.bmw.BmwSuv;

public class BmwFactory implements IAutomobileFactory {
	private static BmwFactory bmwFactory;

	private BmwFactory() {

	}

	public static BmwFactory getInstance() {
		if (bmwFactory == null) {
			bmwFactory = new BmwFactory();
		}
		return (bmwFactory);
	}

	@Override
	public IAutomobile makeSuv() {
		// TODO Auto-generated method stub
		return new BmwSuv();
	}

	@Override
	public IAutomobile makeSedan() {
		// TODO Auto-generated method stub
		return new BmwSedan();
	}

	@Override
	public IAutomobile makeHatchBack() {
		// TODO Auto-generated method stub
		return new BmwHatchBack();
	}

	

}
