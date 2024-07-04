package com.company.aneesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                leftpattern();
                break;

            case 2:
                rightPatter();
                break;
            default:
                System.out.println("give correct number");
                break;
        }
    }
public  static  void leftpattern(){
    int i, j, row = 6;

    for (i=0; i<row; i++)
    {

        for (j=2*(row-i); j>=0; j--)
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
public static void rightPatter(){
    int i, j, row=6;

    for(i=0; i<row; i++)
    {

        for(j=0; j<=i; j++)
        {

            System.out.print("* ");
        }

        System.out.println();
    }
}
}

