package arraylists;

import java.util. * ;
public class OvercomeConcurrentModificationException {
  public static void main(String[] args) {
	  ArrayList<String> a = new ArrayList<String>();
	  a.add("Prashant");
	  a.add("Arya");
	  a.add("Sunil");
	  a.add("Pranay");
	  
	  ListIterator<String> t = a.listIterator();
	  
	  while(t.hasNext()) {
	  if(t.next()=="Pranay") {
	  t.add("Fab");
	  }
	  }
	  System.out.println(a);
  }
}