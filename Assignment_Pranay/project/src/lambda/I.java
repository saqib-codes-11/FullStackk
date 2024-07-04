package lambda;

@FunctionalInterface
public interface I {
	public void test();
	
	public static void focus() {
		System.out.println("Focus method");
	}
}
