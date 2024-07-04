package test;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int no = in.nextInt();
		
		if (no>0) {
			int count=0; //Count HR Designations
			
			String input[] = new String[no]; //input array
			
			String designations[] =new String[no]; //array to work on designations
			
			
			for(int i=0; i<no; i++) {
				input[i]=in.next();
			}
			
			
			for(int i=0; i<no;i++) {
				if (input[i].contains("HR")) {
					designations[count]=input[i];
					count++;
				}
			}
			
			if(count>0) 
			{
				System.out.println("Count of designations: "+count);
			
			for (int i=0;i<count;i++) {
				System.out.println(designations[i].toUpperCase());
			}

			}
			
			else {
				System.out.println("No HR Designation found");
			}
	}
		
		else {
			System.out.println("INVALID INPUT");
		}
		
		
		
	}
	
}
