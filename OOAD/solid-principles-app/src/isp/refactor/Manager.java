package isp.refactor;

public class Manager implements IEatableWorkable {

	@Override
	public void startWork() {
		System.out.println("Manager is working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager stopped working");
	}

	@Override
	public void startEating() {
		// TODO Auto-generated method stub
		System.out.println("MAnager is eating");
	}

	@Override
	public void stopEating() {
		// TODO Auto-generated method stub
		System.out.println("Manager stopped eating");
	}

}
