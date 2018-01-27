package com.techlabs.crud.test;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.crud.Student;

public class TestSet {
	public static void main(String args[]) {
		Student student1 = new Student("K", 789);
		Student student2 = new Student("K", 789);

		Set<Student> students;
		students = new HashSet<Student>();
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1.equals(student2));
		
		System.out.println(students.add(student1));
		System.out.println(students.add(student2));
		System.out.println(students.add(student1));
		
		System.out.println(students.size());
		
		for (Student std : students) {
			System.out.println(std.getName());
		}

		students.remove(student1);
	}
}
