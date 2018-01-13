package com.techlabs.account;

public abstract class Employee {
	protected int empNo;
	protected String empName;
	protected double basicSalary;

	public Employee(int empNo, String empName, double basicSalary) {
		this.empNo = empNo;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}

	public abstract double calculateNetSalary();
}
