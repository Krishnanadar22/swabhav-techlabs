package srp.refactor;

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

	public double calculateDiscount() {
		return (cost * discount);
	}

	public double calculateTax() {
		return (cost * GST);
	}

	public double totalCost() {
		return (cost - this.calculateDiscount() + this.calculateTax());
	}

	public int getBillNumber() {
		return billNumber;
	}

	public double getCost() {
		return cost;
	}

	public String getName() {
		return customerName;
	}
}
