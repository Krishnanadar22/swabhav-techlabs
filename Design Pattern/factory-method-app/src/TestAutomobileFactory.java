public class TestAutomobileFactory {
	public static void main(String args[]) {
		IAutomobileFactory factory = BmwFactory.getInstance();
		IAutomobile car1 = factory.make();

		car1.start();
		car1.stop();
	}
}
