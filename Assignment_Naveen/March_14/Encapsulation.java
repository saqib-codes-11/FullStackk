package package1;

class Employee{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	private int id;
	private String dept;
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee p =new Employee();
		p.setDept("devops");
		p.setName("floyd");
		p.setId(12412);
		System.out.println("employee name is "+p.getName()+"id is "+p.getId()+" part of "+p.getDept());
	}

}
