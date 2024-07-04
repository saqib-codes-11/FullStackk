package multithreading;

public class Sleep extends Thread{
	public void run()
	{
		
			for(int i=0;i<=10;i++) {
		try {
			Thread.sleep(2000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Sleep s1=new Sleep();
		s1.start();
		
		Sleep s2=new Sleep();
		s2.start();
	}
}
