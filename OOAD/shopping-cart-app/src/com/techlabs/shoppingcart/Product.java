package com.techlabs.shoppingcart;

public class Product {
	static private int totalNumberOfProducts;

	private int id;
	private String name;
	private double price;
	private double discountPercent;

	static {
		totalNumberOfProducts = 0;
	}

	public Product(String name, double price, double discount) {
		this.id = generateID();
		this.name = name;
		this.price = price;
		this.discountPercent = discount;
	}

	private int generateID() {
		return (++totalNumberOfProducts);
	}

	public double calculateDiscTotal() {
		return (price - price * (discountPercent / 100));
	}

	public String getProductName() {
		return (this.name);
	}

	public int getProductID() {
		return (this.id);
	}

	public double getProductPrice() {
		return (this.price);
	}
}
