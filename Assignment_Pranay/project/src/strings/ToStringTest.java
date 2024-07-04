package strings;

public class ToStringTest {
	public static void main(String[] args) {
		ToString t1=new ToString(1,"Pranay");
		ToString t2=new ToString(2, "Alex");
		
		//automatically calls the toString method since its in a syso
		System.out.println(t1);
		System.out.println(t2.toString());
	}
}
