package exceptions;

public class NullEqual {
	public static void main(String[] args) {
		String s=null;;
		//String x=abc;
		
		try {
			//Never invoke methods on null
			//But can be done on literals
			
			if("abc".equals(s))
			{
				System.out.println("Equal");
				
			}
			else
			{
				System.out.println("Not Equal");
				
			}
			
			
		}catch (NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Error: Null Pointer Exception");
		}
	}
}
