package lambda;

//Method references
public class ITest {

	public void display()
	{
		System.out.println("Display method");

	}
	public static void main(String[] args) {
		ITest t=new ITest();
		//ITest i= t::display;
		I i= new ITest()::display;
		
		//I t1= () -> display();
		
		
		
	}
}
