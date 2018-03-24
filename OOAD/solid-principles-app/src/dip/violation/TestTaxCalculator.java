package dip.violation;

public class TestTaxCalculator {
	public static void main(String args[]) {
		TaxCalculator tc = new TaxCalculator(LogType.XML);
		tc.calculateTax(5000, 0);

		TaxCalculator tc2 = new TaxCalculator(LogType.CSV);
		tc2.calculateTax(5000, 0);
	}
}
