package Encapsulation;

public class Encapsulation {
	private String name;  
	//getter method for name  
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name ; 
	}  
}
public class main{
	public static void main(String[] args) {
		Student s=new Student();   
		s.setName("vijay");    
		System.out.println(s.getName());  
	}
}