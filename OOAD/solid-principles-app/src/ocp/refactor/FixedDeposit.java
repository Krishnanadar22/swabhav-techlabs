package ocp.refactor;


public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principle;
	private int years;
	private IFestivalRate festival;

	public FixedDeposit(int accountNumber, String name, double principle,
			int years, IFestivalRate festival) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
	}

	public double calculateTotalInterest() {
		double rate = this.festival.getRate();
		return (this.principle * this.years * rate / 100);
	}
}
