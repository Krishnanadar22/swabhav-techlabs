package com.techlabs.account;

public abstract class Account {
	static protected int accountNumberGenerator;
	protected final String name;
	protected double balance;
	protected int accountNumber;

	static {
		accountNumberGenerator = 0;
	}

	public Account(String name, double balance) {
		accountNumberGenerator += 1;
		this.name = name;
		this.balance = balance;
		accountNumber = accountNumberGenerator;
	}

	public String getAccName() {
		return name;
	}

	public double getAccBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
	}

	public abstract void withdraw(double amount);

	public int getAccNumber() {
		return accountNumber;
	}
}
