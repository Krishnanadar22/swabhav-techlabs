package com.techlabs.automobile.factory;

import com.techlabs.automobile.IAutomobile;

public class TestAutomobileFactory {
	public static void main(String args[]) {
		IAutomobileFactory factory = BmwFactory.getInstance();
		IAutomobile car1 = factory.makeSedan();

		car1.start();
		car1.stop();
	}
}
