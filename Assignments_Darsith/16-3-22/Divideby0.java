package Assignment3;

import java.util.Scanner;

public class Divideby0 {
	public static void main (String args[]) {
	      Scanner sc=new Scanner (System.in);
	      int num1,num2,result;
	      System.out.println("enter num1 and num2");
	      num1=sc.nextInt();
	      num2=sc.nextInt();
	      try{
	          result = num1/num2;
	          System.out.println("The result is" +result);
	      } 
	      catch (ArithmeticException e) {
	         System.out.println ("Can't be divided by Zero ");
	      }
	      sc.close();
	   }
	

}
