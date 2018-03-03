package com.techlabs.app.juinttest;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.techlabs.app.Student;
import com.techlabs.app.StudentDataStore;
import com.techlabs.app.exceptions.StudentNotFoundException;

public class TestStudentDataStore {

	@Test
	public void shouldAddStudent() {
		StudentDataStore sds = new StudentDataStore();
		int expectedSize = sds.count();
		sds.add(new Student("K", "N", "P"));
		int size = sds.count();
		expectedSize += 1;
		Student std = sds.search("K");
		long id = std.getId();
		sds.delete(id);
		assertEquals(size, expectedSize);
	}

	@Test
	public void shouldDeleteStudent() {
		StudentDataStore sds = new StudentDataStore();
		sds.add(new Student("K", "N", "P"));
		int expectedSize = sds.count();
		Student std = sds.search("K");
		long id = std.getId();
		sds.delete(id);
		expectedSize -= 1;
		assertEquals(expectedSize, sds.count());
	}

	@Test(expected = StudentNotFoundException.class)
	public void shouldThrowExceptionWhenWrongIdEnteredToDelete() {
		StudentDataStore sds = new StudentDataStore();
		int expectedSize = sds.count();

		sds.delete(100);
		assertEquals(expectedSize, sds.count());

	}

	@Test(expected = StudentNotFoundException.class)
	public void shouldThrowExceptionWhenStudentNotFoundInSearch() {
		StudentDataStore sds = new StudentDataStore();
		sds.add(new Student("pratik", "N", "P"));
		long id = sds.search("pratik").getId();
		sds.delete(id);
		Student student = sds.search("pratik");
		System.out.println(student.getFirstName());
	}

	@Test
	public void shouldReturnStudentWhenFound() {
		StudentDataStore sds = new StudentDataStore();
		sds.add(new Student("krishnan", "N", "P"));
		Student student = sds.search("krishnan");
		long id = student.getId();
		sds.delete(id);
		assertFalse(student == null);
	}

	@Test
	public void shouldBuildResume() {
		StudentDataStore sds = new StudentDataStore();
		sds.add(new Student("K", "N", "P"));
		int expected = new File("Resume/").listFiles().length;
		expected = expected + sds.count();
		sds.export();
		Student std = sds.search("K");
		long id = std.getId();
		sds.delete(id);
		assertEquals(expected, new File("Resume/").listFiles().length);
	}
}
