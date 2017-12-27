package com.techlabs.array;

public class TestOverload {

	public static void main(String args[]) {
		print();
		print(10);
		print("#");
		print(10.1);
		print(10.1f);
	}
	
	private static void print() {
		System.out.println("--------------------");
	}

	private static void print(int number) {
		System.out.println(number);
	}

	private static void print(String pattern) {
		int count = 20;
		while (count > 0) {
			System.out.print(pattern);
			count--;
		}
		System.out.println();
	}

	private static void print(float fnumber) {
		System.out.println(fnumber + " you're in float overload");
	}

	private static void print(double dnumber) {
		System.out.println(dnumber + " you're in double overload");
	}

}