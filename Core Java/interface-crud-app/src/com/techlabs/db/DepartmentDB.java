package com.techlabs.db;

public class DepartmentDB implements Crudable {

	public void create() {
		System.out.println("create in DepartmentDB");
	}

	public void read() {
		System.out.println("read in DepartmentDB");
	}

	public void update() {
		System.out.println("update in DepartmentDB");
	}

	public void delete() {
		System.out.println("delete in DepartmentDB");
	}
}
