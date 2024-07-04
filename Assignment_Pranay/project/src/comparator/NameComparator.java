package comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	 public int compare(Employee e1, Employee e2)
	 {
//		 Employee e01=(Employee)e1;
//		 Employee e02=(Employee)e2;
//		 return e01.name.compareTo(e02.name);
		 
		 return e1.name.compareTo(e2.name);
	 }
}
