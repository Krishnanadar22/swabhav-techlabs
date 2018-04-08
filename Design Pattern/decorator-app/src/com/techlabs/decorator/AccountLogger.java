package com.techlabs.decorator;

public class AccountLogger extends Decorator {

	public AccountLogger(Account acc) {
		super(acc);
	}

	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Logging accoount");
		super.deposit(amt);
		System.out.println("Logging done");
	}

	@Override
	public void withdraw(double amt) {
		System.out.println("Logging account");
		super.withdraw(amt);
		System.out.println("Logging done");
	}

}
