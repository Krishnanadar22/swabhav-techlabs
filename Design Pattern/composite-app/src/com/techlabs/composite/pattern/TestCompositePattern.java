package com.techlabs.composite.pattern;

public class TestCompositePattern {
	public static void main(String args[]) {
		Folder root = new Folder("Movies");
		root.add(new File("IT", ".avi", 250));
		root.add(new File("Dunkirk", ".mp4", 800));

		Folder level1 = new Folder("Hindi");
		level1.add(new File("a", ".mov", 500));
		level1.add(new File("b", ".mp3", 10));

		root.add(level1);
		root.showDetails();
	}
}
