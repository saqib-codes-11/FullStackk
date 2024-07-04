package exceptions;

public class ThrowsTest {
	public static void main(String[] args) {
		Throws t=new Throws();
		
		try {
			int z=t.division(10, 0);
			System.out.println(z);
		}
		
		catch(ArithmeticException e)
		{
			// e.printStackTrace();
			throw new ArithmeticException("Never Divide by Zero!");
		}
	}
}
