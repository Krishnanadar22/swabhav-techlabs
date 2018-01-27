package com.techlabs.account;

public class InsufficientFundsException extends RuntimeException {
	private Account account;
	private double amount;

	public InsufficientFundsException(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		return ("Sorry, aacount number " + account.getAccNo() + " has balance "
				+ account.getBalance() + " and is trying to withdraw " + amount + " which violates bank's savings account rules");
	}
}