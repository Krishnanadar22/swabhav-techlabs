package com.techlabs.shoppingcart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	static private int totalNumberOfOrders;
	static {
		totalNumberOfOrders = 0;
	}

	private int id;
	private Date date;
	private List<LineItem> lineItems = new ArrayList<LineItem>();

	private int generateID() {
		return (++totalNumberOfOrders);
	}

	public Order(Date date) {
		this.id = generateID();
		this.date = date;
	}

	public void addItem(LineItem lineitem) {
		for (LineItem li : lineItems) {
			if (li.getProductID() == lineitem.getProductID()) {
				li.addQuantity(lineitem.getQuantity());
				return;
			}
		}
		lineItems.add(lineitem);
	}

	public double checkoutPrice() {
		double total = 0;
		for (LineItem lineitem : this.lineItems) {
			total = total + lineitem.calculateLineItemCost();
		}
		return (total);
	}

	public Date getOrderDate() {
		return (this.date);
	}

	public int getID() {
		return (this.id);
	}

	public List<LineItem> getLineItems() {
		return (lineItems);
	}
}
