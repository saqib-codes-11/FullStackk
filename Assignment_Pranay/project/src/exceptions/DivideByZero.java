package exceptions;

public class DivideByZero {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		
		try {
			c=a/b;
			System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println("Never divide a number by 0");
			
		}
		
		finally
		{
		System.out.println("step 1");
		System.out.println("step 2");
		}
	}

}
