import java.util.*;

public class divisionbyzero {

	   public static void main(String args[]) { 
	      try { 
	         int a[] = new int[3];
	         a[2] = 30;  
	      }  
	      catch(ArithmeticException e)
	      {
	    	  System.out.println("ArithmeticException");
	      }  
	      catch(ArrayIndexOutOfBoundsException e)
	      {
	    	  System.out.println("ArrayIndexOutOfBoundsException");
	      }  
	      catch(Exception e)
	      {
	    	  System.out.println("Other exceptions");
	      }
	      System.out.println("NO exception");  
	   }  
	} 
