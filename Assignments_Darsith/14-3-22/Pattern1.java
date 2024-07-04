package Assignment1;

import java.util.Scanner;

public class Pattern1 {
	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		System.out.println("1. Full Star, 2.Left Star, 3.Right Star");
		n = scan.nextInt();
		switch(n) {
		case 1:
			full();
			break;
		case 2:
			left();
			break;
		case 3:
			right();
			break;
		}
			
	}
	
	public static void full() {
		 int i, j, n;
		 System.out.println("Input for N");
		 n = scan.nextInt();
         for (i=0; i<n; i++)
         {
                 for (j=n-i; j>1; j--)
                 {
                         System.out.print(" ");
                 }
                 for (j=0; j<=i; j++ )
                 {
                         System.out.print("* ");
                 }
                 System.out.println();
         }
	}
	
	public static void left() {
		int i, j, n;
		System.out.println("Input for N");
		n = scan.nextInt();
        for (i=0; i<n; i++)  {
            for (j=2*(n-i); j>=0; j--)  {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	
	public static void right() {
		int n;
		System.out.println("Input for N");
		n = scan.nextInt();
        for (int i=1 ; i<=n ; i++) {

        for (int j=1; j<=i; j++) {
        System.out.print("* ");
        }

        System.out.println();
        }
	}

}
