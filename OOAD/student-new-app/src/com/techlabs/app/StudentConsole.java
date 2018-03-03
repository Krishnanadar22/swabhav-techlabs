package com.techlabs.app;

import java.util.Iterator;
import java.util.Scanner;

public class StudentConsole {
	private StudentDataStore studentobj;

	private static Scanner input;
	private static final int AddChoice = 1;
	private static final int DisplayChoice = 2;
	private static final int SearchStudentChoice = 3;
	private static final int DeleteStudentChoice = 4;
	private static final int ExportToHTML = 5;
	private static final int Exit = 99;

	public StudentConsole(StudentDataStore obj) {
		studentobj = obj;
	}

	public void start() {

		input = new Scanner(System.in);
		int choice = 0;

		while (choice != Exit) {
			System.out.println("Press 1 to add Student");
			System.out.println("Press 2 to Display Students");
			System.out.println("Press 3 to Search Student By Name");
			System.out.println("Press 4 to Delete Student");
			System.out.println("Press 5 to Export to HTML File");
			System.out.println("Press 99 to Exit");

			choice = Integer.parseInt(input.nextLine());
			switch (choice) {
			case AddChoice:
				getDetails();
				break;
			case DisplayChoice:
				Iterator<Student> students = studentobj.get();
				print(students);
				break;
			case SearchStudentChoice:
				getSearch();
				break;
			case DeleteStudentChoice:
				getDelete();
				break;
			case ExportToHTML:
				studentobj.export();
				System.out.println("Data has been exported to Resume");
				break;
			}
		}
		System.out.println("Thank you");
	}

	public void getDetails() {

		do {
			System.out.println("Enter Student FirstName :");
			String firstName = input.nextLine();

			System.out.println("Enter Student LastName :");
			String lastName = input.nextLine();

			System.out.println("Enter Student Address :");
			String address = input.nextLine();

			Student student = new Student(firstName, lastName, address);
			((StudentDataStore) studentobj).add(student);

			System.out.println("Thank You !! Your details are being saved.");
			System.out.println("Press 1 to add more Student");
			System.out.println("Any Other number to exit");

		} while (Integer.parseInt(input.nextLine()) == AddChoice);
	}

	public void print(Iterator<Student> students) {
		while (students.hasNext()) {
			Student student = students.next();
			System.out.println("Student Id:" + student.getId());
			System.out.println("Student Name:" + student.getFirstName() + " "
					+ student.getLastName());
			System.out.println("Student Location:" + student.getAddress()
					+ "\n");
		}
	}

	public void getSearch() {
		System.out.println("Enter Student Name :");
		Student result = studentobj.search(input.nextLine());

		System.out.println("Student ID:" + result.getId());
		System.out.println("Student Name:" + result.getFirstName()
				+ result.getLastName());
		System.out.println("Student Location:" + result.getAddress());
	}

	private void getDelete() {
		System.out.println("Enter Student Id to delete:");
		studentobj.delete(Long.parseLong(input.nextLine()));
	}
}
