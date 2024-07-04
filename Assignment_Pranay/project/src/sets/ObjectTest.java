package sets;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest {
	public static void main(String[] args) {
		Set<Object> s=new HashSet<Object>();
		
		Object e1=new Object(1, "Pranay");
		Object e2=new Object(1, "Pranay");
		Object e3=new Object(2, "Fab");
		Object e4=new Object(1, "Pranay");
		Object e5=new Object(3, "Bruh");
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		
		
		//If Hash code and equals is not present it considers duplicates as well
		System.out.println("Size: " +s.size());
		System.out.println(s);
	}
}
