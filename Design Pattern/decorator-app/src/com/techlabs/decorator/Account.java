package com.techlabs.decorator;

public class Account implements IAccount {

	private String name;
	private double balance;

	public Account(String name, double amt) {
		this.name = name;
		this.balance = amt;
	}

	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		balance = balance + amt;
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		balance = balance - amt;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

}
