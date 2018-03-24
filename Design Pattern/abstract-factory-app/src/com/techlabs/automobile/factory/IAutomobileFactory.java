package com.techlabs.automobile.factory;

import com.techlabs.automobile.IAutomobile;

public interface IAutomobileFactory {
	public IAutomobile makeSuv();
	public IAutomobile makeSedan();
	public IAutomobile makeHatchBack();
}
