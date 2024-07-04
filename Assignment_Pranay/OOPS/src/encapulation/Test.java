package encapulation;

public class Test {

	public static void main(String[] args) {
		Employee e=new Employee();
		
		e.setId(1);
		e.setName("Pranay");
		e.setSalary(20000);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());

	}

}
