package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.Doc;

class Doctor implements Comparable{
	private String name;
	private String speciality;
	private int years;
	
	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(String name, String speciality, int years) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.years = years;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public int getYears() {
		return years;
	}


	public void setYears(int years) {
		this.years = years;
	}


	@Override
	public String toString() {
		return "Doctor [name=" + name + ", speciality=" + speciality + ", years=" + years + "]";
	}


	/*
	 * public int compareTo(Doctor other) { // TODO Auto-generated method stub
	 * return name.compareToIgnoreCase(other.name); }
	 */

	  @Override 
	  public int compareTo(Object other) 
	  { 
		  Doctor doc=(Doctor)other;
		  return name.compareToIgnoreCase(doc.name);
	 }
	 

}

class DoctorService{
	private List<Doctor> doctorRepository;
	
	public DoctorService(List<Doctor> doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}

	List<Doctor> getExperiencedDoctors(int exp){
		
		
		if(doctorRepository.isEmpty() || doctorRepository==null) {
			return null;
		}
		
		else {
			
			
			List<Doctor> list =new ArrayList<>();
			Iterator it=doctorRepository.iterator();
			
			while(it.hasNext()) {
				Doctor doc=(Doctor)it.next();
				int exp1=doc.getYears();
				if(exp1>= exp) {
					list.add(doc);
				}
			}
			
			
			//Ascending order of Specialtiy
			Collections.sort(list, new Comparator<Doctor>() {

				@Override
				public int compare(Doctor o1, Doctor o2) {
					// TODO Auto-generated method stub
					return o1.getSpeciality().compareTo(o2.getSpeciality());
				}	
			});
			
			
			//Descending order of Experience(Years)
			Collections.sort(list, new Comparator<Doctor>() {

				@Override
				public int compare(Doctor o1, Doctor o2) {
					// TODO Auto-generated method stub
					if(o1.getYears()==o2.getYears()) {
						return 0;
						
					}
					else if(o1.getYears()>o1.getYears()) {
						return -1;
					}
					return 1;
				}
				
			});
			
			
			return list;
			
			/* Not correct yet
			 * List<Doctor> l1=doctorRepository.stream().filter(f->f.getYears()>=exp)
			 * .sorted(Comparator.comparing(Doctor::getSpeciality).thenComparing(Comparator.
			 * comparing(Doctor::getYears).reversed())) .collect(Collectors.toList());
			 * return l1;
			 */
			
			
			
			
		}
		
		
		
	}
	
	Set<Doctor> getSpeciality(String speciality){
		Set<Doctor> s=doctorRepository.stream().filter(p->p.getSpeciality().equals(speciality)).
				sorted(Comparator.comparing(Doctor::getName)).
				collect(Collectors.toSet());
		
		return s;
		
	}
}



  class SearchDoctorApp{
	  static String doctorsData;
	  
  }
 




public class Q7 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<Doctor> docs= new ArrayList<>();
		
		docs.add(new Doctor("Yogesh", "Pediatrics", 25));
		docs.add(new Doctor("Ravish", "Pediatrics", 15));
		docs.add(new Doctor("Amit", "Pediatrics", 9));
		docs.add(new Doctor("Shibin", "Dermatology", 6));
		docs.add(new Doctor("Mavis", "Dermatology", 22));
		docs.add(new Doctor("Shilpa", "Dermatology", 6));
		docs.add(new Doctor("Grian", "Cardiology", 25));
		docs.add(new Doctor("Manzoor", "Cardiology", 15));
		docs.add(new Doctor("Pearl", "Cardiology", 15));
		docs.add(new Doctor("Vinay", "Orthopaedics", 22));
		docs.add(new Doctor("Kumar", "Orthopaedics", 15));
		docs.add(new Doctor("Nicole", "Orthopaedics", 7));
		
		List<Doctor> docs1= new ArrayList<>();
		Set<Doctor> docs2 =new TreeSet<>();
		//
	}
}
