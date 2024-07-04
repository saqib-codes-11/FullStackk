package test;

import java.util.Scanner;

public class Q2 {
	
	public static boolean isPrime(int n) {
		boolean flag=true;
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}		
		}
		return flag;	
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int res=-1;
		int a=in.nextInt();
		int b=in.nextInt();
		
		if(a==b) {
			res=0;
		}
		
		if (isPrime(a) && isPrime(b)) {
			
			if (a>b) {
				res=a;
			}
			
			else {
				res=b;
			}
		}
		
		else {
			//		
		}
	
	}
}
