package com.techlabs.refactor;

public class TestDataService {
	public static void main(String args[]) {
		DataService ds1 = DataService.getInstance();
		DataService ds2 = DataService.getInstance();

		ds1.doWork();
		ds2.doWork();
	}
}
