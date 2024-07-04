package overload;

public class Employee {
	int id;
	String name;
	int salary;
	
	public Employee() {
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
}
