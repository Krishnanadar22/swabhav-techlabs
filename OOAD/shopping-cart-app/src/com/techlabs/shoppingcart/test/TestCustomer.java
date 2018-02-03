package com.techlabs.shoppingcart.test;

import java.util.Date;

import com.techlabs.shoppingcart.Customer;
import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

public class TestCustomer {
	public static void main(String args[]) {
		Product product1 = new Product("shampoo", 25, 5);
		Product product2 = new Product("soap", 50, 5);
		Product product3 = new Product("deo", 100, 10);

		Customer customer1 = new Customer("Krishna");
		Order order1 = new Order(new Date());
		order1.addItem(new LineItem(product1, 25));
		customer1.addOrder(order1);

		Order order2 = new Order(new Date());
		order2.addItem(new LineItem(product2, 30));
		customer1.addOrder(order2);

		Order order3 = new Order(new Date());
		order3.addItem(new LineItem(product3, 10));
		order3.addItem(new LineItem(product3, 10));
		customer1.addOrder(order3);

		Customer customer2 = new Customer("Pratik");
		Order order4 = new Order(new Date());
		order4.addItem(new LineItem(product1, 10));
		order4.addItem(new LineItem(product2, 25));
		customer2.addOrder(order4);

		generateInvoice(customer1);
		generateInvoice(customer2);
	}

	public static void generateInvoice(Customer customer) {
		System.out.println("Customer Name\t" + customer.getCustomerName());
		System.out.println("No. of orders\t" + customer.getOrders().size());
		for (Order order : customer.getOrders()) {
			getOrderDetails(order);
		}
		System.out.println(customer.generateTotalBill());
	}

	public static void getOrderDetails(Order order) {
		System.out.println("Order no. " + order.getID());
		for (LineItem li : order.getLineItems()) {
			System.out.println(getProductDetails(li.getProduct()) + "\t"
					+ li.getQuantity() + "\t" + li.calculateLineItemCost());
		}
	}

	public static String getProductDetails(Product product) {
		return (product.getProductID() + "\t" + product.getProductName() + "\t"
				+ product.getProductPrice() + "\t" + product
					.calculateDiscTotal());
	}
}
