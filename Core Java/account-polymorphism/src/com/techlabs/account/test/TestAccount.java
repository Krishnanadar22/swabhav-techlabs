package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingsAccount;

public class TestAccount {
	public static void main(String args[]) {
		// Account acc = new Account(111,"k",1000);
		SavingsAccount acc1 = new SavingsAccount("k", 1000);
		CurrentAccount acc2 = new CurrentAccount("p", 1000);

		printDetails(acc1);
		printDetails(acc2);

		acc1.withdraw(500);
		acc2.withdraw(5000);

		printDetails(acc1);
		printDetails(acc2);

	}

	public static void printDetails(Account acc) {
		System.out.println("Account Number " + acc.getAccNumber());
		System.out.println("Account Name " + acc.getAccName());
		System.out.println("Balance " + acc.getAccBalance());
	}
}
