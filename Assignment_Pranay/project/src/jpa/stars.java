package jpa;

import java.util.Scanner;

public class stars {
	
	public static void full(int n) {
		 int i,j;
		
		for (i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
         { 
             System.out.print(" "); //print space
         }  
         for (j=0; j<=i; j++ ) //inner loop for number of columns
         { 
             System.out.print("* "); //print star
         } 

         System.out.println(); //ending line after each row
     } 
		
	
	public static void right(int n)
    {
        int a, b;
  
        // outer loop to handle number of rows
        // k in this case
        for (a = 0; a < n; a++) {
  
            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
  
            // end-line
            System.out.println();
        }
    }
	
	public static void left(int n)
    {
        int a, b;
  
        // 1st loop
        for (a = 0; a < n; a++) {
  
            // nested 2nd loop
            for (b = 2 * (n - a); b >= 0; b--) {
                // printing spaces
                System.out.print(" ");
            }
  
            // nested 3rd loop
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
         // end-line
            System.out.println();
        }
    }
	
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter your Choice (1= Left Star 2= Right Star 3= Full Star): ");
		int choice=in.nextInt();
		System.out.println("Enter the number of stars you want: ");
		int number=in.nextInt();
		
		
		switch(choice) {
		case 1: left(number);
		break;
		case 2: right(number);
		break;
		case 3: full(number);
		break;
		default: System.out.println("Invalid Choice");
		}
	}
	
	
	 
}
