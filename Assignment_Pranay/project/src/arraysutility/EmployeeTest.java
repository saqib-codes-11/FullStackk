package arraysutility;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] emps= {
				new Employee(7788, "Smith", 2200.0),
				new Employee(7438, "Wesson", 3234.43),
				new Employee(9998, "Web", 657676.43),
				new Employee(7777, "Miller", 3244343.21),
				new Employee(3242, "Alan", 99999.99),
		
		};
		
		int[] nums= {1,2,3,4,5};
		System.out.println(nums); //Without Arrays.toString 
		System.out.println(Arrays.toString(nums) +"\n");
		
		System.out.println(emps);
		System.out.println(Arrays.toString(emps) +"\n");
		
		
		//System.out.println(Collections.max(emps));
		
		System.out.println("Max ID: " + Collections.max(Arrays.asList(emps)) +"\n");
		
		Employee maxsal= Collections.max(Arrays.asList(emps), new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getSalary(), o2.getSalary());
			}
			
		});
		
		System.out.println("Max Salary: " + maxsal +"\n");
		
		
		
		
		String[] names1= {"John", "Pranay", "Ankita", "Naveena"};
		String[] names2= {"John", "Pranay", "Ankita", "Naveena"};
		
		boolean same= Arrays.equals(names1, names2);
		System.out.println("Are they same: " +same +"\n");
		
		
		System.out.println(names1.length);
		
		String[] names3= Arrays.copyOf(names1, 15);
		System.out.println(names3.length);
		System.out.println(Arrays.asList(names3) +"\n");
		
		
		//Searching
		
		Arrays.sort(emps);
		
		for (Employee emp: emps) {
			System.out.println(emp);
		}
		
		int index=Arrays.binarySearch(emps, new Employee(7777, null,0));
		System.out.println("\nIndex of element to be search: "+ index);
		
		// Greater than all the elements to be searched
		//-(Number of elements) -1
		int index1=Arrays.binarySearch(emps, new Employee(9999, null,0));
		System.out.println("\nIndex of element to be search: "+ index1);
		
		// Lesser than all the elements to be searched
		//-1
		int index2=Arrays.binarySearch(emps, new Employee(21, null,0));
		System.out.println("\nIndex of element to be search: "+ index2);
		
		
	}
}
