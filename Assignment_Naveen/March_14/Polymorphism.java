package package1;

public class Polymorphism {

	public static int area(int a) {
		return a*a;
	}
	public static int area(int b,int h) {
		return (int) (.5*(b*h));
	}
	public static int area(int a,int b,int h) {
		return (int) (.5*(a+b)*h);
	}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println("area of square "+area(4));
	System.out.println("area of triangle "+area(4,10));
	System.out.println("area of trapezium "+area(4,10,7));
	
	}

}
