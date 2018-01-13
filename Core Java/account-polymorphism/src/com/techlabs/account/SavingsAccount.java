package com.techlabs.account;

public class SavingsAccount extends Account {

	static private final double MIN_BALANCE;
	static {
		MIN_BALANCE = 500.0;
	}

	public SavingsAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount > MIN_BALANCE) {
			balance = balance - amount;
		}
	}

}
