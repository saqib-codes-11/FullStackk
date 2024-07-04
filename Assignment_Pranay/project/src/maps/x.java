package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class x {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		//HashMap and Hashset depends on equals and hashCode- they have unique ids: When an object is added with same fields then their haschode will be the same and considered as a duplicates
		
		LinkedHashMap<Integer,String> lmap= new LinkedHashMap<>();
		TreeMap<Integer,String> tmap= new TreeMap<>(); //TreeSet and TreeMap requires Comparable along with compareTo() when woring with Objects
		
				
		map.put(1, "Pranay");
		map.put(2, "Ankita");
		map.put(3, "Sam");
		map.put(4, "Bobs");
		map.put(null, "check1");
		map.put(20, null);
		map.put(21, null);
			System.out.println(map);
		
		lmap.put(1, "Pranay");
		lmap.put(2, "Ankita");
		lmap.put(3, "Sam");
		lmap.put(4, "Bobs");
		lmap.put(null, "check1");
		lmap.put(20, null);
		lmap.put(21, null);	
			System.out.println(lmap);
		
		
		tmap.put(1, "Pranay");
		tmap.put(2, "Ankita");
		tmap.put(3, "Sam");
		tmap.put(4, "Bobs");
		//tmap.put(null, "check1"); NullPointerException
		//tmap.put(20, null); NullPointerException
		//tmap.put(21, null); NullPointerException
		System.out.println(tmap);
		
		
		
	}
}
