package com.techlabs.factory;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestAutomobileFactory {
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {

		IAutomobileFactory factory = getFactory();
		IAutomobile car1 = factory.make();

		car1.start();
		car1.stop();
	}

	public static String getFactoryName() throws IOException {
		FileReader reader = new FileReader("prop.properties");
		Properties p = new Properties();
		p.load(reader);
		return (p.getProperty("factory"));
	}

	public static IAutomobileFactory getFactory() throws IOException,
			ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		String className = getFactoryName();
		Class<?> c = Class.forName(className);
		Method m = c.getMethod("getInstance");
		IAutomobileFactory factory = (IAutomobileFactory)m.invoke(null);
		return (factory);
	}
}
