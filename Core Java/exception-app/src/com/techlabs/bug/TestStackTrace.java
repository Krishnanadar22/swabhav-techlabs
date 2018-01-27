package com.techlabs.bug;

public class TestStackTrace {
	public static void main(String args[]) throws Exception {
		System.out.println("Inside Main");
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of main");
	}

	static public void m1() throws Exception {
		System.out.println("inside m1");
		m2();
	}

	static public void m2() throws Exception {
		System.out.println("inside m2");
		m3();
	}

	static public void m3() throws Exception {
		System.out.println("inside m3");
		throw new Exception();
	}
}
