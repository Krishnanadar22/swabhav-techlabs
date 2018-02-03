package com.techlabs.collection;

public class LineItem implements Comparable<LineItem> {
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;

	public LineItem(int id, String name, int quantity, double unitPrice) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public double calculateTotalCost() {
		return (quantity * unitPrice);
	}

	public int getId() {
		return (id);
	}

	public String getName() {
		return (name);
	}

	@Override
	public int compareTo(LineItem item2) {
		if (this.getId() < item2.getId())
			return -1;
		if (this.getId() == item2.getId())
			return 0;
		else
			return 1;
	}
}
