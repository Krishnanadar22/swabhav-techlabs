package com.techlabs.collection.test;

import java.util.ArrayList;

import com.techlabs.collection.LineItem;

public class TestLineItemGenericCollection {
	public static void main(String args[]) {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(1, "a", 25, 50.0));
		cart.add(new LineItem(2, "b", 5, 50.0));
		cart.add(new LineItem(3, "d", 2, 50.0));
		cart.add(new LineItem(4, "r", 225, 50.0));
		// cart.add("hello");

		for (LineItem lineItem : cart) {
			System.out.println(lineItem.getId() + " " + lineItem.getName()
					+ " " + lineItem.calculateTotalCost());
		}
	}
}
