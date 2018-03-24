package com.techlabs.refactor;

public class DataService {
	private static DataService ds;

	private DataService() {
		System.out.println("Instance of DataServer created");
	}

	public static DataService getInstance() {
		if (ds == null) {
			ds = new DataService();
		}
		return ds;
	}

	public void doWork() {
		System.out.println("service " + this.hashCode() + " is doing work");
	}
}
