public class BmwFactory implements IAutomobileFactory {
	private static BmwFactory bmwFactory;

	private BmwFactory() {

	}

	public static BmwFactory getInstance() {
		if (bmwFactory == null) {
			bmwFactory = new BmwFactory();
		}
		return (bmwFactory);
	}

	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub
		return (new Bmw());
	}

}
