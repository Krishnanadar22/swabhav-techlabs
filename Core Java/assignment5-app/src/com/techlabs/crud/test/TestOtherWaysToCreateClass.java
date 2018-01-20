package com.techlabs.crud.test;

import java.io.ObjectInputStream;

import com.techlabs.crud.*;

public class TestOtherWaysToCreateClass {
	public static void main(String args[]) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		Student student1 = (Student) Class.forName("com.techlabs.crud.Student")
				.newInstance();
		

	}
}
