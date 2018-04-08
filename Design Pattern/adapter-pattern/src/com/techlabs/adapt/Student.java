package com.techlabs.adapt;

import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fName, lName, address;
	private UUID rollNo;

	public Student(String fname, String lname) {
		rollNo = UUID.randomUUID();
		this.fName = fname;
		this.lName = lname;
	}

	public UUID getRollNo() {
		return rollNo;
	}

	public void setFName(String firstName) {
		fName = firstName;
	}

	public void setLName(String lastName) {
		lName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return (this.fName + " " + this.lName);
	}
}
