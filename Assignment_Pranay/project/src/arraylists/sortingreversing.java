package arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class sortingreversing {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Kiran");
		list.add("Prasad");
		list.add("Gouri");
		list.add("Naresh");
		list.add("Prashant");
		list.add("Gouri");
		//list.add("Gouri"); duplicates allowed
		//list.add(null);
		//Cannot invoke method on null: NullPointerException
		
		//Reversing
		Collections.sort(list);
		System.out.println("After sorting\n"+list);
		
		//Reversing
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After reversing\n"+list);
	
	
	}
}
