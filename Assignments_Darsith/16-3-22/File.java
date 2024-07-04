package Assignment3;

import java.util.Scanner;
import java.io.*;
public class File implements Readable {
public static void main(String[] args) throws Exception{
		
		Scanner input=new Scanner(new File("java.txt"));
		System.out.println();
		
        while(input.hasNextInt())
        {
        	System.out.print(input.nextInt() + " ");
        	
        }
        System.out.println();
        
	}

}
