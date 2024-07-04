package synchronization;

public class Thread2 extends Thread{
	
	Printer p;
	
	public Thread2(Printer p)
	{
		this.p=p;
	}
	
	public void run()
	{
		p.Printing(5);
	}
}
