package synchronization;

public class TestSync {
	public static void main(String[] args) {
		Printer p=new Printer();
		
		Thread1 t1= new Thread1(p);	
		Thread2 t2= new Thread2(p);
		
		t1.start();
;		t2.start();
		//calls their respective run methods
	}
}
