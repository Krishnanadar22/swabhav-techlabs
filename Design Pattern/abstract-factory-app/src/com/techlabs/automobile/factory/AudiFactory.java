package com.techlabs.automobile.factory;

import com.techlabs.automobile.IAutomobile;
import com.techlabs.automobile.audi.AudiHatchBack;
import com.techlabs.automobile.audi.AudiSedan;
import com.techlabs.automobile.audi.AudiSuv;

public class AudiFactory implements IAutomobileFactory {
	private AudiFactory() {
		// TODO Auto-generated constructor stub
	}

	private static AudiFactory audiFactory;

	public static AudiFactory getInstance() {
		if (audiFactory == null) {
			audiFactory = new AudiFactory();
		}
		return (audiFactory);
	}

	@Override
	public IAutomobile makeSuv() {
		// TODO Auto-generated method stub
		return new AudiSuv();
	}

	@Override
	public IAutomobile makeSedan() {
		// TODO Auto-generated method stub
		return new AudiSedan();
	}

	@Override
	public IAutomobile makeHatchBack() {
		// TODO Auto-generated method stub
		return new AudiHatchBack();
	}

}
