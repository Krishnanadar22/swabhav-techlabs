package com.techlabs.account.test;

import com.techlabs.account.Developer;
import com.techlabs.account.Employee;
import com.techlabs.account.Manager;

public class TestEmployeePolymorphism {
	public static void main(String args[]) {
		Manager manager = new Manager(1, "k", 50000);
		Developer developer = new Developer(2, "p", 30000);

		printSalarySlip(developer);
		printSalarySlip(manager);
	}

	public static void printSalarySlip(Employee emp) {
		System.out.println("Salary " + emp.calculateNetSalary());
	}
}
