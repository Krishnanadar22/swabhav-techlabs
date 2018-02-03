package com.techlabs.student.test;

import java.util.Scanner;

import com.techlabs.student.SerializerStudent;
import com.techlabs.student.StudentDatastore;

public class TestStudentApp {
	public static void main(String args[]) throws Exception {
		StudentDatastore record = new StudentDatastore();
		SerializerStudent serializer = new SerializerStudent(record);
		Scanner input = new Scanner(System.in);
		int valid = 0;
		while (valid != 99) {
			System.out
					.println("Type 'add' to add Students\nType 'display' to Display Student Details\nType 'build resume' to Build Resume\nType 'exit' to Exit\n\nNo of Students are :"
							+ record.getSize());
			String response = input.nextLine();
			switch (response) {
			case "add":
				// getDetails();
				serializer.serialise();
				break;

			case "display":
				// printDetails(record);
				break;

			case "build resume":
				// printData.buildResume(record);
				break;
			case "exit":
				valid = 99;
				break;
			default:
				System.out.println("Please Enter Correct Response");
				break;
			}
		}
		input.close();
	}
}