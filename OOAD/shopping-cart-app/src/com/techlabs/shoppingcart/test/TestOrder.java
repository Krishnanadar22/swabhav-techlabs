package com.techlabs.shoppingcart.test;

import java.util.Date;

import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

public class TestOrder {
	public static void main(String args[]) {
		Date date = new Date();
		Product shampoo = new Product("Shampoo", 25, 5);
		Product soap = new Product("Soap", 50, 5);

		LineItem li1 = new LineItem(shampoo, 30);
		LineItem li2 = new LineItem(soap, 25);

		Order order = new Order(date);
		order.addItem(li1);
		order.addItem(li2);

		System.out.println(order.checkoutPrice());
		System.out.println(order.getID());
		System.out.println(order.getOrderDate());
	}
}
