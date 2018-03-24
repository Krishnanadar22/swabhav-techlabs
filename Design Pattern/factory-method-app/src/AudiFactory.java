public class AudiFactory implements IAutomobileFactory {
	private AudiFactory() {
		// TODO Auto-generated constructor stub
	}

	private static AudiFactory audiFactory;

	public static AudiFactory getInstance() {
		if (audiFactory == null) {
			audiFactory = new AudiFactory();
		}
		return (audiFactory);
	}

	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub
		return (new Audi());
	}

}
