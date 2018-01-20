package com.techlabs.propertyfile.test;

import java.io.IOException;

import com.techlabs.propertyfile.PropertyFileCreator;

public class TestPropertyFileCreator {
	public static void main(String args[]) throws IOException {
		PropertyFileCreator property = new PropertyFileCreator();
		property.createProperty();
		property.readProperty();
	}

}
