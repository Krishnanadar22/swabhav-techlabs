package srp.refactor.test;

import srp.refactor.InvoiceConsolePrinter;
import srp.refactor.Invoice;

public class TestInoviceConsolePrinter {
	public static void main(String args[]) {
		Invoice invoice = new Invoice(0, "Krishna", 85, 0.05);
		InvoiceConsolePrinter pl = new InvoiceConsolePrinter();

		pl.printInvoice(invoice);
	}
}
