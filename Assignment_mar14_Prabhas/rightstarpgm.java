package assignments1;

import java.util.Scanner;
public class rightstarpgm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
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