package package1;

interface  Faculty {
		
	void setFacultyid(int n);

	int getFacultyid();
}
abstract class Details{
	String name;
	String address;
	long phno;
	public Details(String name,String address,long phno) {
		this.address= address;
		this.name = name;
		this.phno = phno;
		
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public long getphno(){
		return phno ;
}
}
class Depertment extends Details implements Faculty  {
	public Depertment(String name, String address, long phno) {
		super(name, address, phno);
		// TODO Auto-generated constructor stub
	}

	String deptname;
	int id;
	
	public String getDeptname() {
		return deptname;
	}
	
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	
	public void setFacultyid(int n) {
	this.id = n;
		
	}

	public int getFacultyid() {
		return id;
	}
}



public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Depertment p  = new Depertment("Avish","indore",763833200);
		p.setFacultyid(123);
		p.setDeptname("cse");;

		System.out.println("name is "+p.getName()+" from "+p.getAddress()+" phone number is "+p.getphno());
		System.out.print("faculty id is "+ p.getFacultyid()+" from ");
		System.out.println(p.getDeptname());
	}

}
