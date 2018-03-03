package srp.violation;

public class Invoice {
	private final double GST = 0.15;
	private int billNumber;
	private String customerName;
	private double cost;
	private double discount;

	public Invoice(int billNumber, String name, double cost, double discount) {
		this.customerName = name;
		this.billNumber = billNumber;
		this.cost = cost;
		this.discount = discount;
	}

	private double calculateDiscount() {
		return (cost * discount);
	}

	private double calculateTax() {
		return (cost * GST);
	}

	public double totalCost() {
		return (cost - this.calculateDiscount() + this.calculateTax());
	}

	public void printInvoice() {
		System.out.println("Bill number:" + this.billNumber);
		System.out.println("Customer name:" + this.customerName);
		System.out.println("Cost:" + this.cost);
		System.out.println("Discount:" + this.calculateDiscount());
		System.out.println("Tax:" + this.calculateTax());
		System.out.println("Total:" + this.totalCost());
	}
}
