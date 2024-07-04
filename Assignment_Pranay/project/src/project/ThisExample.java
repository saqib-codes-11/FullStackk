package project;

public class ThisExample {
	int id;
	String name;
	static String company="companyName";
	
	public ThisExample(int id, String name) {
		//this is just a reference to specify the variable in the class(Employee)
		//just like an object but does not make a brand new object to confuse the program by making an object inside a method inside an object
		
		//does not work with statics
		this.id = id;
		this.name = name;
	}
}




