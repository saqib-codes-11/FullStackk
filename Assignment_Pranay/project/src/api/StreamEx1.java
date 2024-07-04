package api;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx1 {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>(); 
		
		list.add("ajay");
		list.add("pranay");
		list.add("ALAN");
		list.add("alan");
		list.add("test");
		list.add("FaB");
		list.add("prashant");
		list.add("aBc");
		list.add("lil wayne");
		list.add("ananad");
		
		
		// Filter names that start with a //Make them Uppercase// Sort the list//Iterate and print
		list.stream().filter(element -> element.startsWith("a"))
		.map(String::toUpperCase) .sorted() .forEach(System.out::println);
		
		//Creating a list cant be directly; We need to use collect method
		List<String> list1= list.stream().filter(element -> element.startsWith("a")).map(String::toUpperCase).sorted().collect(Collectors.toList());
		System.out.println(list1);
		
		//Counting
		long count= list.stream().filter(name -> name.startsWith("a")).count();
		
		System.out.println("\nCount: "+count);
		
		boolean check1=list.stream().anyMatch(name -> name.startsWith("z"));
		System.out.println("\nAny name that starts with \'z\': "+check1);
		
		boolean check2= list.stream().allMatch(name -> name.startsWith("a"));
		System.out.println("\nAll names starts with \'a\': "+check2);
		
		boolean check3 = list.stream().noneMatch(name -> name.startsWith("Z"));
		System.out.println("\nNo names starts with \'Z\': "+check3);
		
		
		
		 
		
		
	}
}
