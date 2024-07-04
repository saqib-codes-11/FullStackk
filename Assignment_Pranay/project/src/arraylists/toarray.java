package arraylists;

import java.util.ArrayList;

public class toarray {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		list.add("mno");
		
		System.out.println(list);
		
		
		String[] arr= list.toArray(new String[list.size()]);
		for(String element: arr)
		{
			System.out.println(element);
		}
	}
	
}
