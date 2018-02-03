package com.techlabs.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	static private int totalNumberOfCustomers;
	static {
		totalNumberOfCustomers = 0;
	}

	private int id;
	private String name;
	private List<Order> orders = new ArrayList<Order>();

	private int generateID() {
		return (++totalNumberOfCustomers);
	}

	public Customer(String name) {
		this.id = generateID();
		this.name = name;
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public List<Order> getOrders() {
		return (this.orders);
	}

	public String getCustomerName() {
		return (this.name);
	}

	public int getCustomerID() {
		return (this.id);
	}

	public double generateTotalBill() {
		double total = 0;
		for (Order order : orders) {
			total = total + order.checkoutPrice();
		}
		return (total);
	}
}
