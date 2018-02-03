package com.techlabs.shoppingcart.test;

import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Product;

public class TestLineItem {
	public static void main(String args[]) {
		LineItem li = new LineItem(new Product("Shampoo", 25, 5), 25);
		System.out.println(li.calculateLineItemCost());
	}
}
