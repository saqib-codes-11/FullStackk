//process of controlling access of threads on a shared resource

package synchronization;

public class Printer {
	
	//public void Printing(int n)
	public synchronized void Printing(int n)
	{
		for (int i=0;i<=n;i++)
		{
			System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
}

//Completes one threads task than goes to the other
//Wont start another until current task is completed


//The shared resource here is the printing method. Only one can access at a time