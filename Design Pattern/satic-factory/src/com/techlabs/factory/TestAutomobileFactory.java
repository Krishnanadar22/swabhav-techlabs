package com.techlabs.factory;

public class TestAutomobileFactory {
	public static void main(String args[]) {
		IAutomobile car1 = AutomobileFactory.make(AutoType.AUDI);
		IAutomobile car2 = AutomobileFactory.make(AutoType.BMW);
		IAutomobile car3 = AutomobileFactory.make(AutoType.TESLA);

		car1.start();
		car2.start();
		car3.start();

		car1.stop();
		car2.stop();
		car3.stop();
	}
}
