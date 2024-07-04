package multithreading;

public class Apoorva extends Thread{
	public void run() {
		System.out.println("Inside Run Method");
		
		for(int i=0;i<=10; i++)
		{
			System.out.println(i);
		}
	}
	
	
	public void test() {
		System.out.println("Inside Test Method");
		
		for(int i=0;i<=10; i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Apoorva a=new Apoorva();
		//a.run(); - Disadvantage: Memory leak in the stack memory
		//Cannot perform multithreading if you call run instead of start and same stack frame is used to run it
		//If you use start a new thread is created for each stack frames and parallel processing can take place
		a.start(); //internally calls the run method
		
		
		//Overriding the run method of thread to a particular task
		
		
		//a.start() again:- IllegalThreadStateException
		//However two different threads can be created and started
	}
}
