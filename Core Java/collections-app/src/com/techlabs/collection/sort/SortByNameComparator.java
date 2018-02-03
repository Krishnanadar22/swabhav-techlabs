package com.techlabs.collection.sort;

import java.util.Comparator;

import com.techlabs.collection.LineItem;

public class SortByNameComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem item1, LineItem item2) {
		// TODO Auto-generated method stub
		return (item1.getName().compareTo(item2.getName()));
	}

}
