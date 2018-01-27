package com.techlabs.crud;

public class Student implements Cloneable {
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
	
	@Override
	public boolean equals(Object student) {
		Student s= (Student)student;
		return getName().equals(s.getName());
	}

	@Override
	public int hashCode() {
		return (getName().hashCode());
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (super.clone());
	}
}
