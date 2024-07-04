package Assignment1;
public class Encapsulation {
	        public static void main(String[] args) {
        	Details ob = new Details();

            ob.setId(10);
            ob.setName("abc");
            ob.setSalary(20000);

            System.out.println(ob.getId());
            System.out.println(ob.getName());
            System.out.println(ob.getSalary());
        }
}
class Details {
    private int id;
    private String name;
    private int salary;
    
    public int getId() {
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }
    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }
    public int getSalary() {
            return salary;
    }
    public void setSalary(int salary) {
            this.salary = salary;
    }
	}