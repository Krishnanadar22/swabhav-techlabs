package com.techlabs.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDriveItem {
	private String name;
	private List<IDriveItem> driveItems;

	public Folder(String name) {
		this.name = name;
		driveItems = new ArrayList<IDriveItem>();
	}

	@Override
	public void showDetails() {
		System.out.println("Folder Name: " + name);
		for (IDriveItem driveItem : driveItems) {
			driveItem.showDetails();
		}
	}

	public void add(IDriveItem driveItem) {
		driveItems.add(driveItem);
	}

}
