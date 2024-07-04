package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class Lecturer{
	private String lecturerFirstName;
	private String lecturerLastName;
	private int salary;
	public Lecturer(String lecturerFirstName, String lecturerLastName, int salary) {
		this.lecturerFirstName = lecturerFirstName;
		this.lecturerLastName = lecturerLastName;
		this.salary = salary;
	}
	public String getlecturerFirstName() {
		return lecturerFirstName;
	}
	public void setlecturerFirstName(String lecturerFirstName) {
		this.lecturerFirstName = lecturerFirstName;
	}
	public String getlecturerLastName() {
		return lecturerLastName;
	}
	public void setlecturerLastName(String lecturerLastName) {
		this.lecturerLastName = lecturerLastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Lecturer [lecturerFirstName=" + lecturerFirstName + ", lecturerLastName=" + lecturerLastName + ", salary=" + salary + "]";
	}
	
}

class Imp{
	public List<String> getlecturerFirstName(List<Lecturer> list){
		List<String> n= list.stream().map(p->p.getlecturerFirstName()).collect(Collectors.toList());
		return n;
	}
public double getMaxSalary(List<Lecturer> list){
		Lecturer max=list.stream().max(Comparator.comparing(Lecturer::getSalary)).get();
		return max.getSalary();
	}
	
}

public class Source3{
	public static void main(String[] args) {
		Imp i=new Imp()	;
		List<Lecturer> list=new ArrayList<>();
		list.add(new Lecturer("Alan", "D costa", 50000));
		list.add(new Lecturer("Pranay", "Roberts", 50000));
		list.add(new Lecturer("X", "Y", 50000));
		System.out.println(i.getlecturerFirstName(list));
		System.out.println(i.getMaxSalary(list));
	}
}

