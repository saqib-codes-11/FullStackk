package arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class swap {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		list.add("mno");
		
		//System.out.println(list);
		
		Collections.swap(list, 2, 4);
		
		//System.out.println(list);
		
	}
}
