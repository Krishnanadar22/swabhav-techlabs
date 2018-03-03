package ocp.violation;

import javax.management.RuntimeErrorException;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principle;
	private int years;
	private FestivalType festival;

	public FixedDeposit(int accountNumber, String name, double principle,
			int years, FestivalType festival) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
	}

	private double calculateRate() {
		if (festival == FestivalType.HOLI) {
			return 8.5;
		} else if (festival == FestivalType.NEW_YEAR) {
			return 8;
		} else if (festival == FestivalType.NORMAL) {
			return 7;
		} else
			throw new RuntimeException("Wrong festival");
	}

	public double calculateTotalInterest() {
		double rate = this.calculateRate();
		return (this.principle * this.years * rate / 100);
	}
}
