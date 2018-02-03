package com.techlabs.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDatastore {
	private List<Student> students = new ArrayList<Student>();

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void removeStudent(Student student) {
		this.students.remove(student);
	}

	public List<Student> getAllStudents() {
		return (this.students);
	}

	public int getSize() {
		return (students.size());
	}
}
