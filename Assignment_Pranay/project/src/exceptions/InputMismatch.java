package exceptions;

import java.util.*;
public class InputMismatch {
	
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	int age=0;
	double salary=0.0;
	String name="";
	
	System.out.println("Enter the details");
	
	try {
		age=sc.nextInt();
		salary=sc.nextDouble();
		name=sc.next();
		
		System.out.println(age+salary+name);
	}
	
	catch(InputMismatchException ime)
	{
		System.out.println("Error: Input Mismatch Exception");
		ime.printStackTrace();
	}
	
	
	}
}
