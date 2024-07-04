package package1;

class Calc1{
	public void add(int a,int b) {
		System.out.println("added values is: "+ a+b);
	}
	public void sub(int a,int b) {
		System.out.println("subtracted values is: "+ (a-b));
	}
}
class Calc2 extends Calc1{
	public void mul(int a,int b) {
		System.out.println("multiplied values is: "+ a*b);
	}
	public void div(int a,int b) {
		System.out.println("divided values is: "+ a/b);
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc2  n = new Calc2();
		n.add(3,4);
		n.sub(10,5);
		n.mul(20, 4);
		n.div(50, 2);
		
		

	}

}
