package com.techlabs.core.unittesting;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.techlabs.core.Branch;
import com.techlabs.core.EngineeringCollege;
import com.techlabs.core.Professor;
import com.techlabs.core.Student;

public class TestEngineeringCollege {

	@Test
	public void shouldAddStudents() {
		Student student = new Student(0, "k", Branch.COMPS, "Powai", new Date());
		EngineeringCollege sjcet = new EngineeringCollege();
		int expected = sjcet.getNumberOfStudents() + 1;
		sjcet.addStudent(student);
		assertEquals(expected, sjcet.getNumberOfStudents());
	}

	@Test
	public void shouldAddProfessor() {
		Professor professor = new Professor(0, "k", "Powai", new Date());
		EngineeringCollege sjcet = new EngineeringCollege();
		int expected = sjcet.getNumberOfProfessors() + 1;
		sjcet.addProfessor(professor);
		assertEquals(expected, sjcet.getNumberOfProfessors());
	}

	

}
