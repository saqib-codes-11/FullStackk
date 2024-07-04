package synchronization;

public class Thread1 extends Thread {
	
	Printer p;
	
	public Thread1(Printer p)
	{
		this.p=p;
	}
	
	public void run()
	{
		p.Printing(3);
	}
	
}
