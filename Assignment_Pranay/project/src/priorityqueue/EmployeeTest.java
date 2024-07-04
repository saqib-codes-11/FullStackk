package priorityqueue;

import java.util.PriorityQueue;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee e1= new Employee("Shreyas",40000);
		Employee e2= new Employee("John",399);
		Employee e3= new Employee("Prnay",1);
		Employee e4= new Employee("Ankita",99999);
		Employee e5 = new Employee("Zo",1234);
		PriorityQueue<Employee> pq = new PriorityQueue<>();
		
		pq.add(e1);
		pq.add(e2);
		pq.add(e3);
		pq.add(e4);
		pq.add(e5);
		
		//We overrode compareTo based on salary therfore peek returns the Highest priority element: first element(lowest) based on salary
		System.out.println("Head Value: " +pq.peek());
			
		Employee eCheck = new Employee("Zo",1234);
		
		//We overrode the equals method in Employee class
		System.out.println("Contains: "+ pq.contains(eCheck));
		
		//Removes the highest priorty element
		pq.remove();
		System.out.println("After removing highest priority value: \n");
		System.out.println(pq);
	}
	
	
}
