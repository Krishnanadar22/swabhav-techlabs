package srp.violation.test;

import srp.violation.Invoice;

public class TestInovice {
	public static void main(String args[]) {
		Invoice invoice = new Invoice(0, "Krishna", 85, 0.05);

		invoice.printInvoice();
	}
}
