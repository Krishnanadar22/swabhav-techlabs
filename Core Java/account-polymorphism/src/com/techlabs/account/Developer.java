package com.techlabs.account;

public class Developer extends Employee {
	private double perks;

	public Developer(int empNo, String empName, double basicSalary) {
		super(empNo, empName, basicSalary);
		perks = 0.3 * basicSalary;
	}

	@Override
	public double calculateNetSalary() {
		return (basicSalary + perks);
	}

}
