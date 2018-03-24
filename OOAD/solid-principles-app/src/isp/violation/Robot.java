package isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot is working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot stopped working");
	}

	@Override
	public void startEating() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Robot cant eat");
	}

	@Override
	public void stopEating() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Robot cant eat");
	}

}
