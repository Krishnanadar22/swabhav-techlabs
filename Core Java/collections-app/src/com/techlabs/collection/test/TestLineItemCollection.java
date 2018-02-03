package com.techlabs.collection.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.collection.LineItem;

public class TestLineItemCollection {
	public static void main(String args[]) {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(1, "a", 25, 50.0));
		cart.add(new LineItem(2, "b", 5, 50.0));
		cart.add(new LineItem(3, "d", 2, 50.0));
		cart.add(new LineItem(4, "r", 225, 50.0));
		// cart.add("HELLO");

		/*
		 * for (Object obj : cart) { LineItem lineItem = (LineItem) obj;
		 * System.out.println(lineItem.getId() + " " + lineItem.getName() + " "
		 * + lineItem.calculateTotalCost()); }
		 * 
		 * 
		 * for (Iterator i = cart.iterator(); i.hasNext();) { LineItem lineItem
		 * = (LineItem) i.next(); System.out.println(lineItem.getId() + " " +
		 * lineItem.getName() + " " + lineItem.calculateTotalCost()); }
		 */
		print(cart);
	}

	public static void print(Iterable<LineItem> iterable) {
		for (LineItem lineItem : iterable) {
			System.out.println(lineItem.getId() + " " + lineItem.getName()
					+ " " + lineItem.calculateTotalCost());
		}
	}
}
