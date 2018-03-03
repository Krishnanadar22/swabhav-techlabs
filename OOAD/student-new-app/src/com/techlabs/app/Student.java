package com.techlabs.app;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private final String firstName;
	private final String lastName;
	private final String address;
	private final long id;
	private static long count;
	static {
		count = 0;
	}

	public Student(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.id = count++;
	}

	public Student(String firstName, String lastName, String address, long id) {
		this.firstName = firstName;
		this.id = id;
		this.lastName = lastName;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}
}
