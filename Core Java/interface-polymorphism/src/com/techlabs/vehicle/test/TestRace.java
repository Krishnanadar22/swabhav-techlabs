package com.techlabs.vehicle.test;

import com.techlabs.vehicle.Bike;
import com.techlabs.vehicle.Car;
import com.techlabs.vehicle.IMovable;
import com.techlabs.vehicle.Truck;

public class TestRace {
	public static void main(String args[]) {
		IMovable[] movables = { new Car(), new Truck(), new Bike() };
		startRace(movables);
	}

	public static void startRace(IMovable[] movables) {
		System.out.println("Race has begun");
		for (IMovable movable : movables) {
			movable.move();
		}
		System.out.println("Race has ended");
	}
}
