package assignments1;
import java.util.Scanner;
public class fullpyramidstarpgm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){

            for(int k=n-i;k>1;k--) {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
