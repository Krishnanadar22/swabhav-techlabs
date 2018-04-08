package com.techlabs.decorator;

public class Decorator implements IAccount {

	protected Account acc;

	public Decorator(Account acc) {
		this.acc = acc;
	}


	@Override
	public void deposit(double amt) {
		this.acc.deposit(amt);
	}

	@Override
	public void withdraw(double amt) {
		this.acc.withdraw(amt);
	}

}
