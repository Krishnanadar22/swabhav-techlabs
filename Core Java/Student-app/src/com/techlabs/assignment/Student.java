package com.techlabs.assignment;

public class Student {
	private static int numberOfStudents;

	private int studentId;
	private String name;
	private int marksScored;

	static {
		numberOfStudents = 0;
	}

	public Student(String name, int marks) {
		this.name = name;
		this.marksScored = marks;
		this.studentId = ++numberOfStudents;
	}

	public String getStudentName() {
		return (this.name);
	}

	public int getStudentMarks() {
		return (this.marksScored);
	}

	public int getStudentId() {
		return (this.studentId);
	}

}