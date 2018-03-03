package com.techlabs.app.exceptions;

@SuppressWarnings("serial")
public class StudentNotFoundException extends RuntimeException {
	private long id;

	public StudentNotFoundException(long id) {
		this.id = id;
	}


	@Override
	public String getMessage() {
		return "No student with id " + id + " was found.";

	}
}
