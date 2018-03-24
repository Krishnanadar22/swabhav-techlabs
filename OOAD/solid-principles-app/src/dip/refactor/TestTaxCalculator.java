package dip.refactor;

public class TestTaxCalculator {
	public static void main(String args[]) {
		TaxCalculator tc = new TaxCalculator(new XmlLogger());
		tc.calculateTax(5000, 0);

		TaxCalculator tc2 = new TaxCalculator(new CsvLogger());
		tc2.calculateTax(5000, 0);
	}
}
