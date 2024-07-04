package CapgeminiTraining;

public class DivisionByZeroException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int total=5/0;
			System.out.println("execution of the above line Will not come here ");
		}
		catch(ArithmeticException  e) {
			System.out.println("Cannot divid a number by zero");
			
		}

	}

}


