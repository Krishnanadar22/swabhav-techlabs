package com.techlabs.db;

public class CustomerDB implements Crudable {
	public void create() {
		System.out.println("create in CustonmerDB");
	}

	public void read() {
		System.out.println("read in CustonmerDB");
	}

	public void update() {
		System.out.println("update in CustonmerDB");
	}

	public void delete() {
		System.out.println("delete in CustonmerDB");
	}
}
