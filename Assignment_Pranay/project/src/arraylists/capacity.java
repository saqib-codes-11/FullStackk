package arraylists;

import java.lang.reflect.Field;
import java.util.ArrayList;


//Internally list.add checks capacity if it can add more else discards the current array and increments the size of a new array and copies the data [BTS]
//Array list is growable: Grows by half its current length
public class capacity {
	
	static int findCapacity(ArrayList<String> list) throws Exception {
		Field field= ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		
		return((Object[]) field.get(list)).length;
	}
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<String> list=new ArrayList<>();
		
		System.out.println("Size: "+list.size()); //By default it starts at 10
		
		System.out.println(findCapacity(list));
		
		list.add("a");
		System.out.println(findCapacity(list));
		
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("i");
		list.add("j");
		
		System.out.println(list.size());
		System.out.println(findCapacity(list));
		
		
	}
	
}
