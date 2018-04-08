package com.techlabs.adapt;

public class TestSwabhavQ {
	public static void main(String args[]) {
		SwabhavQ<Student> q = new SwabhavQ<Student>();

		q.enqueue(new Student("Krishna", "Nadar"));
		q.enqueue(new Student("Pratik", "Chaurasia"));

		System.out.println(q.size());

		for (Student student : q) {
			System.out.println(student);
		}
	}
}