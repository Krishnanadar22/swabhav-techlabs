package com.techlabs.crud.test;

import java.util.HashMap;

import com.techlabs.crud.Student;

public class TestHashMap {
	public static void main(String args[]) {
		Student student1 = new Student("K", 789);
		Student student2 = new Student("V", 789);

		HashMap<Student, Student> students = new HashMap<Student, Student>();
		students.put(student1, student2);
		System.out.println(students.containsKey(student1));
		System.out.println(students.containsKey(student2));
		System.out.println(students.containsValue(student2));

		for (Student std : students.keySet()) {
			System.out.println(std.getName() + " "
					+ students.get(std).getName());
		}
	}
}
