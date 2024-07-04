package exceptions;

public class StringIndexOutOfBounds {
	public static void main(String[] args) {
		
		String s="pranay";
		
		try {
			char c=s.charAt(20);
			System.out.println(c);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: ArrayIndexOutOfBoundsException");
			
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Error: StringIndexOutOfBounds");
		}
		catch(Exception e)
		{
			System.out.println("Root exception");
			
		}
		}
}
