package lambda;

@FunctionalInterface
public interface ILambdaCheck {
	public int operation(int a,int b);
	
	//Cannot have more than abstract method (All stuff in the interface are by default abstract)
	//public int check(int a,int b);
	
	
	//static methods
	public static void test() {
		
	}
	
	//Default method can have functionality in the interface
	default void display()
	{
		System.out.println("test");
	}
}
