package arraylists;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListLoop {
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		System.out.println("For Loop");
		for (int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("While");
		
		int j=0;
		while (j<list.size())
		{
			System.out.println(list.get(j));
			j++;
		}
		
		System.out.println("Advanced For Loop");
		for (Integer item: list)
		{
			System.out.println(item);
		}
		
		
		System.out.println("forEach Loop");
		list.forEach(item->System.out.println(item));
		
		
		System.out.println("Iterator");
		Iterator it=list.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Enumeration
	}
}
