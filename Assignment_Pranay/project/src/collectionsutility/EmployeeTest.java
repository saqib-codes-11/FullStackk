package collectionsutility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import arraysutility.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		
		
		List<Employee> list= new ArrayList<Employee>();
				list.add(new Employee(7788, "Smith", 2200.0));
				list.add(new Employee(7438, "Wesson", 3234.43));
				list.add(new Employee(9998, "Web", 657676.43));
				list.add(new Employee(7777, "Miller", 3244343.21));
				list.add(new Employee(3242, "Alan", 99999.99));
		
			
		
		Collections.sort(list);	
		
		for (Employee emp: list) {
			System.out.println(emp);
		}
		
		
	
		int index=Collections.binarySearch(list, new Employee(7777, "", 0.0));
		System.out.println(index +"\n");
		
		int index1=Collections.binarySearch(list, new Employee(100, "", 0.0));
		System.out.println(index1 +"\n");
		
		int index2=Collections.binarySearch(list, new Employee(10000, "", 0.0));
		System.out.println(index2 +"\n");
		
		System.out.println("Increasing Order of Salary:");
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				//return e1.getName().compareTo(e2.getName());
				//return e2.getName().compareTo(e1.getName()) : Reverse Order
				return Double.compare(e1.getSalary(), e2.getSalary());
			}
			
		});
		
		
		for (Employee emp: list) {
			System.out.println(emp);
		}
		
		
		/////////////////////////////////////////////////////
		
		
		List<String> list1= new ArrayList<String>();
		list1.add("Pranay");
		list1.add("Ankita");
		list1.add("Naveen");
		list1.add("John");
		list1.add("John");
		list1.add("Smith");
		
		int freq= Collections.frequency(list1, "John");
		System.out.println("\n John is repeated: " +freq);
		
		//It is a string list
		String min=Collections.min(list1);
		System.out.println("\nMin: " +min);
		
		String max=Collections.min(list1);
		System.out.println("\nMax: "+ max);
		
		
		
		//Min and Max can also be used with Employee (Custom Class)
		
		Employee minemp= Collections.min(list);
		//Natural ordering is based on id
		System.out.println("Minimum id in Employee: "+ minemp);
		
		
		//If we wanted to get maximum based on salary then we use Comparator
		Employee highestEarner= Collections.max(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getSalary(), o2.getSalary());
			}
		});
		
		System.out.println("\nHighest Earner: " +highestEarner);
		
	}
	
}
