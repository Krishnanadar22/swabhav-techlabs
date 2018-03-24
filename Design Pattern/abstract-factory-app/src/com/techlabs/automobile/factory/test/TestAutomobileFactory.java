package com.techlabs.automobile.factory.test;

import com.techlabs.automobile.IAutomobile;
import com.techlabs.automobile.factory.BmwFactory;
import com.techlabs.automobile.factory.IAutomobileFactory;

public class TestAutomobileFactory {
	public static void main(String args[]) {
		IAutomobileFactory factory = BmwFactory.getInstance();
		IAutomobile car1 = factory.makeSedan();

		car1.start();
		car1.stop();
	}
}
