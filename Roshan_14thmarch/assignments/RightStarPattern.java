package assignments;
import java.util.Scanner;
public class RightStarPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer value");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){

            for(int k=2*(n-i);k>0;k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
