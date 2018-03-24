package isp.refactor;

public class Test {
	public static void main(String ARGS[]) {
		Manager manager = new Manager();
		Robot robot = new Robot();

		atTheWork(manager);
		atTheCafeteria(manager);

		atTheWork(robot);
		// atTheCafeteria(robot);
	}

	public static void atTheWork(IWorkable worker) {
		worker.startWork();
		worker.stopWork();
	}

	public static void atTheCafeteria(IEatable worker) {
		worker.startEating();
		worker.stopEating();
	}
}
