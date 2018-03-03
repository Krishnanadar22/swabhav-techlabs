package com.techlabs.core;

import java.util.ArrayList;

public class EngineeringCollege {

	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Professor> professors = new ArrayList<Professor>();

	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student succesfully added");
		System.out.println("Total number of students are: "
				+ this.getNumberOfStudents());
	}

	public int getNumberOfStudents() {
		return (this.students.size());
	}

	public void addProfessor(Professor professor) {
		professors.add(professor);
		System.out.println("Professor succesfully added");
		System.out.println("Total number of professors are: "
				+ this.getNumberOfProfessors());
	}

	public int getNumberOfProfessors() {
		return (this.professors.size());
	}

	public void printAllStudentDetails() {
		for (Student student : this.students) {
			student.printDetails();
		}
	}

	public void printAllProfessorDetails() {
		for (Professor professor : this.professors) {
			professor.printDetails();
		}
	}
}
