package com.techlabs.decorator;

public class EmailAccountLogger extends Decorator {

	public EmailAccountLogger(Account acc) {
		super(acc);
	}

	@Override
	public void deposit(double amt) {
		System.out.println("Email logger");
		super.deposit(amt);
	}

	@Override
	public void withdraw(double amt) {
		System.out.println("Email Logger");
		super.withdraw(amt);
	}

}
