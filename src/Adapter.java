public class Adapter extends Target {
	private Adaptee adaptee;

	public Adapter() {
		adaptee = new Adaptee();
	}

	@Override
	public String getXxx() {
		String ret = adaptee.getXyy();
		return ret.replaceAll("y", "x");
	}
}
