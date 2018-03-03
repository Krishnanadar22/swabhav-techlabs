package com.techlabs.app.test;

import com.techlabs.app.StudentConsole;
import com.techlabs.app.StudentDataStore;

public class TestStudentConsole {

	public static void main(String[] args) {

		StudentConsole studentConsole = new StudentConsole(
				new StudentDataStore());
		studentConsole.start();
	}
}
