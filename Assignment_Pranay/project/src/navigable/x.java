package navigable;

import java.util.NavigableSet;
import java.util.TreeSet;

public class x {
	public static void main(String[] args) {
		NavigableSet<Integer> navSet = new TreeSet<>();
		//TreeSet implements Navigable Set
		navSet.add(100);
		navSet.add(300);
		navSet.add(200);
		navSet.add(500);
		navSet.add(400);
		System.out.println(navSet);
		
		//lower, higher 
		//floor: less than or equal to 
		//ceiling: greater than or eqaal to
		
		System.out.println("Element lower than 200: " +navSet.lower(200));
		System.out.println("Element less than or equal to 200: " +navSet.floor(200));
		System.out.println("Element greater than 200: " +navSet.ceiling(200));
		
															   //Wheter you want to include the number or not
		NavigableSet<Integer> navHeadSet = navSet.headSet(400, true);
		System.err.println("400 or less: " + navHeadSet);
		
		//If you change in one set it will change in the other one or vice versa: Backed Collection
		System.out.println(navSet.pollFirst());
		System.out.println("navHeadSet: "+navHeadSet);
		System.out.println("navSet: "+navSet);
		//Changes in the navSet changes the navHeadSet also and vice versa
		
		NavigableSet<Integer> reverseNavSet = navSet.descendingSet();
		System.out.println("Nav Set in descending/reverse order: "+reverseNavSet);
		//reflects on the other set as well
		
	}
}
