package com.techlabs.composite.pattern;

public class File implements IDriveItem {
	private String name;
	private String fileType;
	private double size;

	public File(String name, String fileType, double size) {
		this.name = name;
		this.fileType = fileType;
		this.size = size;
	}

	@Override
	public void showDetails(int level) {
		while(level>0){
			System.out.print("\t");
			level--;
		}
		System.out.println("Name: " + name + " FileType: " + fileType
				+ " size: " + size);
	}

}
