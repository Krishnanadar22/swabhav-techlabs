package com.techlabs.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String name;
	private double contactNumber;
	private int accNumber;
	private double balance;
	private String email;
	private List<IAccountListener> listeners;

	public Account(String name, int accNumber, double contactNumber,
			String email, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
		this.email = email;
		this.contactNumber = contactNumber;
		this.listeners = new ArrayList<IAccountListener>();
	}

	public void addListner(IAccountListener listener) {
		listeners.add(listener);
	}

	public void removeListner(IAccountListener listner) {
		listeners.remove(listner);
	}

	private void notifyListeners() {
		for (IAccountListener listener : listeners) {
			listener.balancechanged(this);
		}
	}

	public void deposit(double amt) {
		this.balance = this.balance + amt;
		this.notifyListeners();
	}

	public void withdraw(double amt) {
		this.balance = this.balance - amt;
		this.notifyListeners();
	}

	public double getBalance() {
		return this.balance;
	}

	public double getContact() {
		return this.contactNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public String getName() {
		return this.name;
	}

	public int getAccNumber() {
		return this.accNumber;
	}

}
