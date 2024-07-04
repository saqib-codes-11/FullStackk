package test;

import java.util.Scanner;

class Students {
	private int id;
	private String name;
	private String college;

	public Students(int id, String name, String college) {
		this.id = id;
		this.name = name;
		this.college = college;
	}

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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public void getDetails() {
		System.out.println("ID: " + id + "Name: " + name + "College: " + college);
	}

}

class EngineeringStudent extends Students {
	private String stream;

	public EngineeringStudent(int id, String name, String college, String stream) {
		super(id, name, college);
		this.stream = stream;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public void getDetails() {
		System.out.println("Stream: " + stream);
	}

}

public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		  String obj=in.next(); 
		  
		  if(obj.equals("EngineeringStudent")) {
			  Students s = null;
				int id = in.nextInt();
				String name = in.nextLine();
				String college = in.nextLine();

				s = new Students(id, name, college);
				s.getDetails();
		  }
		 

		  else {
			  System.out.println("Not Engineering Student");
		  }

	}
}
