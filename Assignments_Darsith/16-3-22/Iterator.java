package Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Iterator {
	public static void main(String args[]){
	    ListIterator<String> iter = null;
	    List<String> names = new ArrayList<String>();
	    names.add("Abhay");
	    names.add("Deepak");
	    names.add("Likhith");
	   
	    iter=names.listIterator();
	 
	    System.out.println("Traversing in forward direction ");
	    while(iter.hasNext()){
	       System.out.println(iter.next());
	    }
	    System.out.println("Traversing in backward direction ");
	    while(iter.hasPrevious()){
	       System.out.println(iter.previous());
	    }
	    
	    Vector<String> Enum = new Vector<String>();         
        Enum.add("Cs");  
        Enum.add("Mech");  
        Enum.add("Ece");  
        Enum.add("EEE");  
         
        Enumeration<String> en = Collections.enumeration(Enum);  
        System.out.println("Enumeration List ");  
        while(en.hasMoreElements()){  
             System.out.println(en.nextElement());  
        }       
	  }

}
