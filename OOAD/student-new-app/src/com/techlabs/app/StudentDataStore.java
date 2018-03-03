package com.techlabs.app;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.app.exceptions.StudentNotFoundException;

public class StudentDataStore implements Iterable<Student> {
	StudentSerializer ss = new StudentSerializer();
	private ArrayList<Student> studentlist;

	public StudentDataStore() {
		studentlist = ss.get();
	}

	public Iterator<Student> get() {
		return studentlist.iterator();
	}

	public void add(Student student) {
		studentlist.add(student);
		ss.save(studentlist);
	}

	public Student search(String name) {
		for (Student student : studentlist) {
			if (name.equals(student.getFirstName())) {
				return student;
			}
		}
		throw new StudentNotFoundException(0);
	}

	public Student search(long id) {
		for (Student student : studentlist) {
			if (id == student.getId()) {
				return student;
			}
		}
		throw new StudentNotFoundException(id);
	}

	public void delete(long id) {
		Student student = search(id);
		if (student == null)
			throw new StudentNotFoundException(id);
		studentlist.remove(student);
		ss.save(studentlist);
	}

	public void export() {
		StudentResumeBuilder.buildResume(studentlist);
	}

	public int count() {
		return (studentlist.size());
	}

	@Override
	public Iterator<Student> iterator() {
		return studentlist.iterator();
	}
}
