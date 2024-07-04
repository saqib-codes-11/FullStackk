package comparator;

import java.util.*;
public class ComparatorTest {
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,2000,"Pranay");
		Employee e2=new Employee(1,3000,"Bhuvan");
		Employee e3=new Employee(1,41900,"Prashant");
		Employee e4=new Employee(1,99999,"Fab");
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println("Sorting by Name Comparison");
		
		Collections.sort(list, new NameComparator());
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Employee emp=(Employee)it.next();
			System.out.println("Id: "+ emp.id +"\tName: "+ emp.name + "\tSalary: "+emp.salary);
		}
		
		System.out.println("\n");
		System.out.println("Sorting by Salary Comparison");
		Collections.sort(list, new SalaryComparator());
		
		Iterator it1=list.iterator();		
		while(it1.hasNext()) {
			Employee emp=(Employee)it1.next();
			System.out.println("Id: "+ emp.id +"\tName: "+ emp.name + "\tSalary: "+emp.salary);
		}
		
		
		
	}
}
