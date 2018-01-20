package com.techlabs.propertyfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileCreator {
	public void createProperty() throws IOException {
		Properties property = new Properties();
		property.setProperty("height", "10");
		property.setProperty("width", "3");
		property.setProperty("type", "new");
		property.store(new FileWriter("config.properties"),
				"Properties Example");
		System.out.println("Property File created");
	}

	public void readProperty() throws IOException {
		FileReader reader = new FileReader("config.properties");
		Properties property = new Properties();
		property.load(reader);
		System.out.println("Height : " + property.getProperty("height"));
		System.out.println("Width : " + property.getProperty("width"));
		System.out.println("Type : " + property.getProperty("type"));
	}
}
