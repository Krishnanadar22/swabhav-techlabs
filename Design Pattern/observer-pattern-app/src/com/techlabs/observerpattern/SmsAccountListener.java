package com.techlabs.observerpattern;

public class SmsAccountListener implements IAccountListener {

	@Override
	public void balancechanged(Account account) {
		// TODO Auto-generated method stub
		System.out.println((int) account.getContact()
				+ " SMS alert for Balance change to " + account.getBalance());
	}

}
