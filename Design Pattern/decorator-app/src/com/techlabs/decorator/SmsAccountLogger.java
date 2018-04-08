package com.techlabs.decorator;

public class SmsAccountLogger extends Decorator {

	public SmsAccountLogger(Account acc) {
		super(acc);
	}

	@Override
	public void deposit(double amt) {
		System.out.println("SMS logging");
		super.deposit(amt);
	}

	@Override
	public void withdraw(double amt) {
		System.out.println("SMS logging");
		super.withdraw(amt);
	}

}
