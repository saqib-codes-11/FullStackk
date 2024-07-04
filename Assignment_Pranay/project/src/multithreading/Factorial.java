package multithreading;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer>
{
	private Integer n;
	
	public Factorial(Integer n)
	{
		this.n=n;
	}
	
	public Integer call() {
		int result=1;
		
		if( (n==0) || (n==1))
		{
			result=1;
		}
		
		else 
		{
			for(int i=2;i<=n;i++)
			{
				result=result*i;
			}
		}
		
		System.out.println("Factorial of " +n+ ": "+result);
		return result;
		
	}

}
