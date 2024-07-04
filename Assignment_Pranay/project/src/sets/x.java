package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class x {
	public static void main(String[] args) {
		HashSet<String> hset= new HashSet<String>();
		//HashMap and Hashset depends on equals and hashCode- they have unique ids: When an object is added with same fields then their haschode will be the same and considered as a duplicates
		
		LinkedHashSet<String> lset= new LinkedHashSet<String>(); //Follows Insertion order(Not in ascending)
		
		
		TreeSet<String> tset = new TreeSet<>(); //Sorts the elements (Wont follow insertion order) However cant take null 
		//Canot take objects as parameter, throws ClassCastException: cannot cast to java.lang.Comparable;
		//TreeSet and TreeMap requires Comparable along with compareTo() when woring with Objects inorder to overcome the issue
		
		
		hset.add("b");
		hset.add("c");
		hset.add("d");
		hset.add(null);
		hset.add("d");
		hset.add("e");
		hset.add(null);
		hset.add("f");
		hset.add("f");
		
		System.out.println(hset);
		//Null always placed in the first postion and also cannot be duplicated
		
		
		lset.add("b");
		lset.add("c");
		lset.add("d");
		lset.add(null);
		lset.add("d");
		lset.add("e");
		lset.add(null);
		lset.add("f");
		lset.add("f");
		System.out.println(lset);
		
		
		
		//Cannot add null values to TreeSets
		tset.add("b");
		tset.add("c");
		tset.add("d");
		//tset.add(null);
		tset.add("d");
		tset.add("e");
		//tset.add(null);
		tset.add("f");
		tset.add("f");
		
		System.out.println(tset);
	}
}	
