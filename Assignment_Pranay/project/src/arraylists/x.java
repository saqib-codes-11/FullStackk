package arraylists;

import java.util.ArrayList;

public class x {
	public static void main(String[] args) {
		
		
		//ArrayList list= new ArrayList(); - Heterogenous in nature, <...> - Homogenous in nature
		
		
		        //generics
		ArrayList<String> list= new ArrayList<String>();
//		ArrayList<String> list= new ArrayList<>();
		list.add("Pranay");
		list.add("Roberts");
		//list.remove("Roberts");
		list.remove(1);
		
		list.set(0, "Ankita");
		
		list.add("John");
		
		System.out.println(list);
		
		
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("hii");
		list2.add("test");
		list2.add("test2");
		
		list2.addAll(list); //Already has a ToString
		System.out.println(list2);
	}
}
