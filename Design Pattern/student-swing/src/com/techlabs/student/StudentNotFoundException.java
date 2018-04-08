package com.techlabs.student;

public class StudentNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return ("No Student found");
	}
}
