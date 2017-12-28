package com.techlabs.array;

public class Student {
	private String name;
	private String degreeName;
	private int degreeYearEnd;
	private String address;
	private String email;
	private double degreePercentage;
	private int phoneNumber;

	public Student(String name, String email, String address, int phoneNumber,
			String degreeName, int degreeYearEnd, double degreePercentage) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.degreeName = degreeName;
		this.degreeYearEnd = degreeYearEnd;
		this.degreePercentage = degreePercentage;
	}

	public void buildResume() {
		System.out.println("\t\t" + name.toUpperCase());
		System.out.println("Email:" + email + "\t\tContact:" + phoneNumber);
		System.out.println();
		System.out.println("Degree" + degreeName + "\tBatch:"
				+ degreeYearEnd + "\tPercentage:" + degreePercentage);
	}
}
