import java.util.Scanner;
public class PatternProgram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 to print leftStarPattern\nenter 2 to print RightStarPattern\nenter 3 to print FullPyramidStarPattern");
        int ch=sc.nextInt();int n;
        switch (ch){
            case 1:System.out.println("enter an integer value");
                   n=sc.nextInt();
                for(int i=0;i<n;i++){
                    for(int j=0;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:System.out.println("enter an integer value");
                   n=sc.nextInt();
                for(int i=1;i<=n;i++){

                    for(int k=2*(n-i);k>0;k--) {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:System.out.println("enter an integer value");
                   n=sc.nextInt();
                for(int i=0;i<n;i++){

                    for(int k=n-i;k>1;k--) {
                        System.out.print(" ");
                    }
                    for(int j=0;j<i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:System.out.println("wrong choice");
        }

    }
}
