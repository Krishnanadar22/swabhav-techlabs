package com.techlabs.shoppingcart.test;

import com.techlabs.shoppingcart.Product;

public class TestProduct {
	public static void main(String args[]) {
		Product product = new Product("shampoo", 25, 5);

		System.out
				.println(product.getProductID() + " "
						+ product.getProductName() + " "
						+ product.calculateDiscTotal());
	}
}
