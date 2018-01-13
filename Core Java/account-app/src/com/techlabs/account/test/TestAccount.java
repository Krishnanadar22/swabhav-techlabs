package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestAccount {

	public static void main(String args[]) {
		Account acc1 = new Account(10, "k", 1000.0);
		Account acc2 = new Account(11, "P");

		// printDetails(acc1);
		// printDetails(acc2);
		System.out.println(Account.getNumberOfAccs());

		acc1.withdraw(1000.0);
		printDetails(acc1);
		acc2.deposit(400.0);
		printDetails(acc2);
		acc2.withdraw(350);
		printDetails(acc2);

	}

	public static void printDetails(Account acc) {
		System.out.println("Account Details");
		System.out.println("Account Number: " + acc.getAccNo());
		System.out.println("Name: " + acc.getName());
		System.out.println("Balance: " + acc.getBalance());
	}
}
