package com.techlabs.array;

public class TestInteger {
	public static void main(String args[]) {
		int mark = 100;
		changeMark(mark);
		System.out.println(mark);

		int marks[] = { 10, 20, 30, 40 };
		changeMarks(marks);
		for (int mark1 : marks) {
			System.out.println(mark1);
		}
	}

	static void changeMark(int mark) {
		mark = 0;
	}

	static void changeMarks(int marks[]) {
		int counter = 0;
		for (; counter < marks.length; counter++) {
			marks[counter] = 0;
		}
	}


}
