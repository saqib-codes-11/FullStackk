package arraylists;

import java.util.ArrayList;

public class ObjectsTest {
	public static void main(String[] args) {
		Objects obj1=new Objects(1,"Pranay",20000);
		Objects obj2=new Objects(2,"Prashant",500000);
		Objects obj3=new Objects(3,"Fab",9999);
		
		
		ArrayList<Objects> list=new ArrayList<Objects>();
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		System.out.println(list);
		
	}
}
