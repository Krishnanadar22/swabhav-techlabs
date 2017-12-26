package com.techlabs.array;

public class TestWelcome {
	public static void main(String names[]) {
		if (names.length == 0)
			System.out.println("Please pass some names");
		else {
			for (String n : names) {
				System.out.println("hi " + n);
			}
		}
	}
}
