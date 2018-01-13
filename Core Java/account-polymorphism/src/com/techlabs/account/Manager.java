package com.techlabs.account;

public class Manager extends Employee {
	private double hra;
	private double ta;

	public Manager(int empNo, String empName, double basicSalary) {
		super(empNo, empName, basicSalary);
		hra = 0.5 * basicSalary;
		ta = 0.4 * basicSalary;
	}

	@Override
	public double calculateNetSalary() {
		return (basicSalary + hra + ta);
	}

}
