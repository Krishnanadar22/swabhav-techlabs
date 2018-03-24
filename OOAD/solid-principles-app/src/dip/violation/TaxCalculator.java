package dip.violation;

public class TaxCalculator {
	private LogType logType;

	public TaxCalculator(LogType logType) {
		this.logType = logType;
	}

	public void calculateTax(int salary, int r) {
		try {
			double c = salary / r;
		} catch (Exception e) {
			if (logType == LogType.XML) {
				XmlLogger logger = new XmlLogger();
				logger.log(e.getMessage());
			} else if (logType == LogType.CSV) {
				CsvLogger logger = new CsvLogger();
				logger.log(e.getMessage());
			}
		}
	}
}
