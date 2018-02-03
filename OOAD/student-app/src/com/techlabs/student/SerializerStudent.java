package com.techlabs.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializerStudent {
	private StudentDatastore record;
	private List<Student> students = new ArrayList<Student>();

	public SerializerStudent(StudentDatastore record) {
		this.record = record;
		this.students = record.getAllStudents();
	}

	public void serialise() throws IOException {
		FileOutputStream fileoutput = new FileOutputStream("Students.txt");
		ObjectOutputStream objectout = new ObjectOutputStream(fileoutput);

		objectout.writeObject(this.students);
		objectout.close();
	}

	@SuppressWarnings("unchecked")
	public void deSerialise() throws IOException, Exception {
		FileInputStream fileinput = new FileInputStream("Students.txt");
		ObjectInputStream objectin = new ObjectInputStream(fileinput);
		students = (ArrayList<Student>) objectin.readObject();
		objectin.close();

	}
}
