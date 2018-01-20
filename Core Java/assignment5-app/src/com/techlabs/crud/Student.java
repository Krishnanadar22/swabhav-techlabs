package com.techlabs.crud;

public class Student {
	private String name;
	private int contactNumber;

	public Student(String name, int contactNumber) {
		this.name = name;
		this.contactNumber = contactNumber;
	}

	public Student() {

	}

	public String getName() {
		return (name);
	}

	public int getContactNumber() {
		return (contactNumber);
	}
}
