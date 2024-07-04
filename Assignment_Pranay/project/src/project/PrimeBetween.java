package project;
import java.util.*;

class PrimeBetween {
	
	public static void main(String[] args)
	{
	
	Scanner in=new Scanner(System.in);
	boolean flag=false;
	
	System.out.println("Enter x:");
	int x=in.nextInt();
	System.out.println("Enter y:");
	int y=in.nextInt();
	
	System.out.printf("Prime numbers between %d and %d are:\n ", x, y);
	
    for (int i = x; i <= y; i++) 
    {
        if (i == 1 || i == 0) {
            continue;
        }
        flag = true;

        for (int j = 2; j <= i / 2; j++) 
        {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }

        if (flag == true)
            System.out.println(i);

    }
    in.close();
	}
}

