package com.techlabs.core.test;

import java.util.Date;

import com.techlabs.core.Branch;
import com.techlabs.core.EngineeringCollege;
import com.techlabs.core.Professor;
import com.techlabs.core.Student;

public class TestEngineeringCollege {
	public static void main(String args[]) {
		EngineeringCollege sjcet = new EngineeringCollege();
		Student student1 = new Student(0, "k", Branch.COMPS, "powai",
				new Date());
		Student student2 = new Student(1, "n", Branch.EXTC, "owai", new Date());
		Student student3 = new Student(2, "p", Branch.MECH, "wai", new Date());

		sjcet.addStudent(student1);
		sjcet.addStudent(student2);
		sjcet.addStudent(student3);

		Professor professor1 = new Professor(0, "a", "andheri", new Date());
		Professor professor2 = new Professor(1, "b", "ndheri", new Date());
		Professor professor3 = new Professor(2, "c", "dheri", new Date());

		sjcet.addProfessor(professor1);
		sjcet.addProfessor(professor2);
		sjcet.addProfessor(professor3);

		sjcet.printAllStudentDetails();
		sjcet.printAllProfessorDetails();

	}
}
