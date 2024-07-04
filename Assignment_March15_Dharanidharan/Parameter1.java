package Parameter1;

public class Parameter1 {
	public static void main(String args[])
    {
        int a = 4;
        int b = 5;

        add(a, b);
    }
    public static void add(int x, int y)
    {
        int sum = x + y;
        System.out.print("Sum of two numbers is :" + sum);
    }
}
