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
	public void showDetails(int level) {
		int levelCopy=level;
		while(level>0){
			System.out.print("\t");
			level--;
		}
		System.out.println("Folder Name: " + name);
		for (IDriveItem driveItem : driveItems) {
			driveItem.showDetails(levelCopy+1);
		}
	}

	public void add(IDriveItem driveItem) {
		driveItems.add(driveItem);
	}

}
