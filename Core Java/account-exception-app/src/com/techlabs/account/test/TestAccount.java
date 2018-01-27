package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestAccount {

	public static void main(String args[]) {
		Account acc1 = new Account(10, "k", 1000.0);

		System.out.println(Account.getNumberOfAccs());

		try {
			acc1.withdraw(1000.0);
			printDetails(acc1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void printDetails(Account acc) {
		System.out.println("Account Details");
		System.out.println("Account Number: " + acc.getAccNo());
		System.out.println("Name: " + acc.getName());
		System.out.println("Balance: " + acc.getBalance());
	}
}
