package com.techlabs.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.techlabs.app.exceptions.ExportException;

public class StudentResumeBuilder {
	public StudentResumeBuilder(ArrayList<Student> studentlist) {
		buildResume(studentlist);
	}

	public static void buildResume(ArrayList<Student> studentlist) {
		try {
			FileReader fileReader = new FileReader("Resume/index.html");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String currntLine = "";
			String htmlLine = "";

			while ((currntLine = bufferedReader.readLine()) != null) {
				htmlLine = htmlLine + currntLine + "\n";
			}
			for (Student student : studentlist) {
				htmlLine = htmlLine.replace("$name", student.getFirstName()
						+ " " + student.getLastName());
				htmlLine = htmlLine.replace("$jobTitle", student.getAddress());
				String resumeFileName = student.getFirstName()
						.replace(" ", "-") + ".html";
				FileWriter writer = new FileWriter("Resume/" + resumeFileName);
				writer.write(htmlLine);
				writer.close();

			}
			bufferedReader.close();

		} catch (Exception e) {
			throw new ExportException();
		}
	}
}
