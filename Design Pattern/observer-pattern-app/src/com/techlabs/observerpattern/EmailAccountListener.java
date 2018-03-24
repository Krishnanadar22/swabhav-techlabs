package com.techlabs.observerpattern;

public class EmailAccountListener implements IAccountListener {

	@Override
	public void balancechanged(Account account) {
		// TODO Auto-generated method stub
		System.out.println(account.getEmail()
				+ " Email alert for Balance change to " + account.getBalance());
	}

}
