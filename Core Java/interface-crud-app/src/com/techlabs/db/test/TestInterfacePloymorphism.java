package com.techlabs.db.test;

import com.techlabs.db.Crudable;
import com.techlabs.db.CustomerDB;
import com.techlabs.db.DepartmentDB;
import com.techlabs.db.EmployeeDB;

public class TestInterfacePloymorphism {
	public static void main(String args[]) {
		doDbOperation(new CustomerDB());
		doDbOperation(new DepartmentDB());
		doDbOperation(new EmployeeDB());
	}

	public static void doDbOperation(Crudable c) {
		System.out.println("Performing DB operations");
		c.create();
		c.read();
		c.update();
		c.delete();
	}
}