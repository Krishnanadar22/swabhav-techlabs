package srp.refactor;

public class InvoiceConsolePrinter {
	public void printInvoice(Invoice invoice) {
		System.out.println("Bill number:" + invoice.getBillNumber());
		System.out.println("Customer name:" + invoice.getName());
		System.out.println("Cost:" + invoice.getCost());
		System.out.println("Discount:" + invoice.calculateDiscount());
		System.out.println("Tax:" + invoice.calculateTax());
		System.out.println("Total:" + invoice.totalCost());
	}
}
