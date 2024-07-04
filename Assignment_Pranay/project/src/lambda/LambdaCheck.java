package lambda;

public class LambdaCheck {
	public static void main(String[] args) {
		
		
		//Interface x= (arguments) -> operation;
		ILambdaCheck add=(a,b) -> a+b;
		ILambdaCheck mul=(a,b) -> a*b;
		
		System.out.println(add.operation(4, 2));
		System.out.println(mul.operation(4, 2));
		
	
	}
	
	
}
