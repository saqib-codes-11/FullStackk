package assignments;

import java.util.Scanner;

public class DivbyZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("division by zero is not possible");
		}
	}

}
