package com.techlabs.collection.sort;

import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.collection.LineItem;

public class TestListItemSort {
	public static void main(String agrs[]) {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(1, "a", 25, 50.0));
		cart.add(new LineItem(3, "d", 2, 50.0));
		cart.add(new LineItem(2, "b", 5, 50.0));
		cart.add(new LineItem(4, "c", 225, 50.0));

		System.out.println("Before sorting");
		print(cart);
		Collections.sort(cart);
		System.out.println("After Default Sorting");
		print(cart);
		Collections.sort(cart, new SortByNameComparator());
		System.out.println("After Name sorting");
		print(cart);
	}

	public static void print(Iterable<LineItem> iterable) {
		for (LineItem lineItem : iterable) {
			System.out.println(lineItem.getId() + " " + lineItem.getName()
					+ " " + lineItem.calculateTotalCost());
		}
	}
}
