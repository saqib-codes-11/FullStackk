package package1;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("input number of rows: ");
		int n = input.nextInt();
		System.out.print("input pattern style ");
		String str  = input.next();
		str.toLowerCase();
		switch(str) {
		
		case "left":
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			break;
		case "right":
			for (int i = 0; i < n; i++) {  

				for (int j = 2 * (n - i); j >= 0; j--) {

				System.out.print(" "); 

				}

				for (int j = 0; j <= i; j++) {

				System.out.print("* ");

				}

				System.out.println();

				}
			break;
		case "full":
			for(int i=0;i<n;i++) {
				for(int j=n-i;j>1;j--) {
					System.out.print(" ");			
					}
				for(int k=0;k<=i;k++) {
					System.out.print("* ");			
					}
				System.out.println();
	
			}
			break;
		}

	}

}
