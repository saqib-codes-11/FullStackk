package multithreading;

public class RunnableExample implements Runnable {
	
	public void run()
	{
		System.out.println("Welcome");
		
	}
	
	public static void main(String[] args) {
		/*
		  * Ankit test=new Ankit();
		 * 
		 * Thread t=new Thread(test);
		 */
		Thread  t= new Thread(new RunnableExample());
		t.start();
		
	}

}
