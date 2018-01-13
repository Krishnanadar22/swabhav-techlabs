package com.techlabs.account;

public class CurrentAccount extends Account {

	static private final double OVERDRAFT;
	static {
		OVERDRAFT = -5000;
	}

	public CurrentAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount > OVERDRAFT) {
			balance = balance - amount;
		}
	}

}
