package package1;
//code contains both encapslation and inheritance

class Vehicles{
	String type;
	public void typeName(String type) {
		this.type = type;
		System.out.println("this is a "+type+ " Vehicle");
		
	}
}
class Cars extends Vehicles{
	String company;
	public void companyName(String cmp) {
		this.company = cmp;
		System.out.println("this is "+company );
		
	}
}

public class Inheritance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars b = new Cars();
		b.companyName("Tesla");
		b.typeName("ev");
	}
	
}