package com.techlabs.core;

import java.util.Date;

public class Student implements Iperson {
	private int id;
	private String name;
	private String address;
	private Date dob;
	private Branch branch;

	public Student(int id, String name, Branch branch, String address, Date dob) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.address = address;
		this.dob = dob;
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

	public String getBranch() {
		return (branch.toString());
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println(this.id + " " + this.name + " " + this.branch);
	}

}
