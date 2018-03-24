package com.techlabs.observerpattern;

public class TestListeners {
	public static void main(String args[]) {
		SmsAccountListener listener1 = new SmsAccountListener();
		EmailAccountListener listener2 = new EmailAccountListener();
		Account account = new Account("Krishna", 1, 976, "kr@gmail.com", 5000);
		account.addListner(listener1);
		account.addListner(listener2);

		account.deposit(100);

		account.removeListner(listener1);

		account.withdraw(100);
	}
}