package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		User u1=new User(3,"Pranay");	
		User u2=new User(9,"Tasha");	
		User u3=new User(1,"Bruh");	
		User u4=new User(18,"Bobs");	
		
		List<User> list=new ArrayList<User>();
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		
		//Sorts based on the compareTo Functionn in User class
		//By name/id
		Collections.sort(list);
		
		
		for (User user: list)
		{
			System.out.println(user);
		}
	}
	
	
	
	
	
}
