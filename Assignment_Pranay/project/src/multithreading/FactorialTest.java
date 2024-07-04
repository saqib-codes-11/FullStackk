package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class FactorialTest {
	public static void main(String[] args) {
		
		ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		List<Future<Integer>> list=new ArrayList();
		
		Random r=new Random();
		
		for(int i=0; i<5; i++) {
			//25: range
			Integer n=r.nextInt(25);
			
			Factorial fact=new Factorial(n);
			
			Future<Integer> result= executor.submit(fact);
			
			list.add(result);
		}
		
		for(Future<Integer> future : list)
		{
			try {
			System.out.println("Result of Task: "+ future.get() + "Task Status :" +future.isDone());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


		}
	}
}
