package dip.refactor;

public class CsvLogger implements ILogable{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("CSV logging : " + message);
	}

}
