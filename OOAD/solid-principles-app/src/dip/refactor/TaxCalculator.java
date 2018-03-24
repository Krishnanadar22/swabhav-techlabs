package dip.refactor;

public class TaxCalculator {
	private ILogable logType;

	public TaxCalculator(ILogable logType) {
		this.logType = logType;
	}

	public double calculateTax(int salary, int r) {
		try {
			double c = salary / r;
			return c;
		} catch (Exception e) {
			logType.log(e.getMessage());
			throw e;
		}
	}
}
