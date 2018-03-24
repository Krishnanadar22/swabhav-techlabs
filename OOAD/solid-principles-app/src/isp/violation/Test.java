package isp.violation;

public class Test {
	public static void main(String ARGS[]) {
		Manager manager = new Manager();
		Robot robot = new Robot();

		atTheWork(manager);
		atTheCafeteria(manager);

		atTheWork(robot);
		atTheCafeteria(robot);
	}

	public static void atTheWork(IWorker worker) {
		worker.startWork();
		worker.startWork();
	}

	public static void atTheCafeteria(IWorker worker) {
		worker.startEating();
		worker.stopEating();
	}
}
