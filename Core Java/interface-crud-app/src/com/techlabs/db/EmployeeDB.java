package com.techlabs.db;

public class EmployeeDB implements Crudable {

	public void create() {
		System.out.println("create in EmployeeDB");
	}

	public void read() {
		System.out.println("read in EmployeeDB");
	}

	public void update() {
		System.out.println("update in EmployeeDB");
	}

	public void delete() {
		System.out.println("delete in EmployeeDB");
	}

}
