package com.techlabs.shoppingcart;

public class LineItem {
	static private int totalNumberOfLineItems;
	static {
		totalNumberOfLineItems = 0;
	}

	private int id;
	private Product product;
	private int quantity;

	private int generateID() {
		return (++totalNumberOfLineItems);
	}

	public LineItem(Product product, int quantity) {
		this.id = generateID();
		this.product = product;
		this.quantity = quantity;
	}

	public double calculateLineItemCost() {
		return (product.calculateDiscTotal() * this.quantity);
	}

	public int getLineItemID() {
		return (this.id);
	}

	public Product getProduct() {
		return (this.product);
	}

	public int getQuantity() {
		return (quantity);
	}

	public String getProductName() {
		return (this.product.getProductName());
	}

	public int getProductID() {
		return (this.product.getProductID());
	}

	public void addQuantity(int quantity) {
		this.quantity = this.quantity + quantity;
	}

}
