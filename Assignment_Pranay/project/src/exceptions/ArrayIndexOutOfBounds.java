package exceptions;

public class ArrayIndexOutOfBounds {
	
	public static void main(String[] args) {
		
		try {
			int[] arr= {1,2,3,4,5};
			System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Some other exception");
		}
		
	}

}
