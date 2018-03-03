package com.techlabs.core;

import java.util.Date;

public class Professor implements Iperson, IsalariedEmployee {
	private int id;
	private String name;
	private String address;
	private double basicPay;
	private double hra;
	private double bonus;
	private Date dob;

	public Professor(int id, String name, String address,
			Date dob) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public void setSalaryDetails(double basicPay, double hra, double bonus) {
		this.basicPay = basicPay;
		this.hra = hra;
		this.bonus = bonus;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return (basicPay + hra + bonus);
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public Date getDob() {
		// TODO Auto-generated method stub
		return dob;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println(this.id + " " + this.name + " " + this.basicPay
				+ " " + this.getSalary());
	}

}
