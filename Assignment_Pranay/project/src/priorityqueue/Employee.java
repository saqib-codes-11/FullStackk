package priorityqueue;

import java.util.Objects;

//Does not allow insertion of non comparable objects: Leads to class cast exception
public class Employee implements Comparable<Employee> {
	
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if (this.getSalary() > e.getSalary()) {
			return 1;
		}
		else if (this.getSalary() <  e.getSalary()) {
			return -1;
		}
		else return 0;
	}
	
	

}
