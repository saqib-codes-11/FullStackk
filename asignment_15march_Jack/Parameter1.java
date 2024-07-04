package marchfifteen;
 //with parameter but no return type
public class Parameter1 {
    public static void main(String args[])
    {
        int a1 = 2;
        int b1 = 6;
 
        // Calling the function with 2 parameters
        add(a1, b1);
    }
    public static void add(int x, int y)
    {
        int sum = x + y;
        // Displaying the sum
        System.out.print("Sum of two numbers is :" + sum);
    }
}
