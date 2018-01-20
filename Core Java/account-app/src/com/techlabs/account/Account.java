package com.techlabs.account;

public class Account {
	private static final double MIN_BALANCE;
	private static int numberOfAccs;
	private static int numberOfWithdrawls;
	private static int numberOfDeposits;

	private final int accNumber;
	private final String name;
	private double balance;

	static {
		numberOfWithdrawls = 0;
		numberOfDeposits = 0;
		MIN_BALANCE = 500.0;
		numberOfAccs = 100;
		System.out.println("Inside Static block");
	}

	public Account(int accNumber, String name, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
		numberOfAccs += 1;
		System.out.println("inside Constructor");
	}

	public Account(int accNumber, String name) {
		this(accNumber, name, MIN_BALANCE);
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
		numberOfDeposits += 1;
	}

	public void withdraw(double amount) {
		if ((this.balance - amount) > MIN_BALANCE) {
			this.balance = balance - amount;
			numberOfWithdrawls += 1;
		}
	}

	public int getAccNo() {
		return (this.accNumber);
	}

	public String getName() {
		return (this.name);
	}

	public double getBalance() {
		return (this.balance);
	}

	public static int getNumberOfAccs() {
		return (Account.numberOfAccs);
	}

	public static int getNumberOfWithdrawals() {
		return (numberOfWithdrawls);
	}

	public static int getNumberOfDeposits() {
		return (numberOfDeposits);
	}

}
