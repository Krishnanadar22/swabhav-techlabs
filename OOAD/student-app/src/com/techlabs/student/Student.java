package com.techlabs.student;

public class Student {
	private static int totalNumberOfStudents;
	static {
		totalNumberOfStudents = 0;
	}

	private int id;
	private String name;
	private String address;

	private int generateID() {
		return (++totalNumberOfStudents);
	}

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		this.id = generateID();
	}

	public String getName() {
		return (this.name);
	}

	public int getID() {
		return (this.id);
	}

	public String getAddress() {
		return (this.address);
	}
}
