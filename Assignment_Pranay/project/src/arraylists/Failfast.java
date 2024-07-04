package arraylists;

import java.util.ArrayList;

//java.util.ConcurrentModificationException
public class Failfast {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		list.add("mno");
		
		for(String alpha:list) {
			System.out.println(alpha);
			
			//list.add("pqr");
		}
	}
}
