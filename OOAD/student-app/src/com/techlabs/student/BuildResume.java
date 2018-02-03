package com.techlabs.student;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class BuildResume {
	private List<Student> students = new ArrayList<Student>();
	StudentDatastore record;

	public BuildResume(StudentDatastore record) throws Exception {
		this.record = record;
		students = this.record.getAllStudents();
		this.build();
	}

	public void build() throws Exception {
		for (Student student : students) {
			String defaultPath = "src//com//techlabs//student//buildresume//";
			BufferedReader bufferReader = new BufferedReader(new FileReader(
					defaultPath + "resume.html"));
			String currentLine = "", htmlFileContent = "";

			while ((currentLine = bufferReader.readLine()) != null) {
				htmlFileContent = htmlFileContent + currentLine + "\n";
			}

			htmlFileContent = htmlFileContent.replace("$fName",
					student.getName());
			htmlFileContent = htmlFileContent.replace("$address",
					student.getAddress());
			String resumeFileName = student.getName() + ".html";
			FileWriter fileWriter = new FileWriter(defaultPath + resumeFileName);
			fileWriter.write(htmlFileContent);
			fileWriter.close();
			bufferReader.close();
			File file = new File(defaultPath + resumeFileName);
			Desktop.getDesktop().browse(file.toURI());
		}
	}
}
