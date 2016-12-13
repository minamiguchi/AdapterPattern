public class Main {
	public static void main(String[] args) {
		Target target = new Adapter();
		System.out.println(target.getXxx());
	}
}
