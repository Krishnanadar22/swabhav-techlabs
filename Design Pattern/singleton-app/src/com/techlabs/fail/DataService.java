package com.techlabs.fail;

public class DataService {
	private DataService() {
		System.out.println("Instance of DataServer created");
	}

	public static DataService getInstance() {
		return new DataService();
	}

	public void doWork() {
		System.out.println("service " + this.hashCode() + " is doing work");
	}
}
