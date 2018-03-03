package com.techlabs.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class StudentSerializer {
	private ArrayList<Student> studentlist = new ArrayList<Student>();

	@SuppressWarnings({ "resource", "unchecked" })
	public StudentSerializer() {
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"Data/studentdata.txt");
			studentlist = (ArrayList<Student>) new ObjectInputStream(
					fileInputStream).readObject();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public ArrayList<Student> get() {
		return (studentlist);
	}

	public void save(ArrayList<Student> studentlist) {
		try {

			PrintWriter pw = new PrintWriter("Data/studentdata.txt");
			pw.close();

			FileOutputStream fileOutputStream = new FileOutputStream(
					"Data/studentdata.txt");

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);
			objectOutputStream.writeObject(studentlist);
			objectOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
