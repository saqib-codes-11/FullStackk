package test;

import java.util.InputMismatchException;
import java.util.Scanner;

class DivisionByZeroException extends Exception{
	public DivisionByZeroException() {
		super("Division By Zero!");
	}
	
	public DivisionByZeroException(String msg) {
		super(msg);
	}
}


public class Q11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1 ,n2 ;
		double res;
		try {
			
			n1=sc.nextInt();
			n2=sc.nextInt();
			
			if(n2==0) {
				throw new DivisionByZeroException();
			}
			
			res=(double)n1/n2;
			System.out.println(res);
			
		} catch(DivisionByZeroException dvze) {
			System.err.println(dvze.getMessage());
		}
		catch(InputMismatchException imme) {
//			sc.hasNextLine();
			System.err.println("Error 501");
		}
	}
}
