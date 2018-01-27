package com.techlabs.crud.test;

import java.io.ObjectInputStream;

import com.techlabs.crud.*;

public class TestOtherWaysToCreateClass {
	public static void main(String args[]) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			CloneNotSupportedException {
		Student std = new Student("k", 789);

		Student student2 = (Student) std.clone();
		System.out.println(student2.getName());
		
		Student student1 = (Student) Class.forName("com.techlabs.crud.Student")
				.newInstance();

	}
}
