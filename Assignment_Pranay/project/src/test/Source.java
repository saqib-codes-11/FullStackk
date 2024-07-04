package test;

import java.util.*;

class Student{
	String name;
	int roll;
	
	
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
		
}

class Record{
	
	List<Student> students= new ArrayList<>();
	
	public String addStudent(Student student) {
		String s=student.getName();
		
		if(s!=null && s.matches("^[a-zA-Z]*$")) {
			students.add(student);
			return "Added";
		}
		else {
		return "Invalid Name";
		}
		
	}
	
	public String swapRolls(Student s1, Student s2) {
		
//		Collections.swap(students, s1.getRoll(), s2.getRoll());
		int temp;
		temp=s1.getRoll();
		s1.setRoll(s2.getRoll());
		s2.setRoll(temp);
		return "Swapped";
	}
	
	
}

class Source{
	
	public static void main(String[] args) {
		Student s1= new Student("test", 1);
		Student s2= new Student("B", 2);
		Record record= new Record();
		System.out.println(record.addStudent(s1));
		System.out.println(record.swapRolls(s1, s2));
	}
}
