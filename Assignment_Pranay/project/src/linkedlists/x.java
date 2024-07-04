package linkedlists;

import java.util.LinkedList;

public class x {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		//list.add(i,value);
		
		System.out.println(list);
		
		list.addFirst("start");
		System.out.println("After adding first");
			System.out.println(list);
		
		System.out.println("After adding last");
		list.addLast("last");
			System.out.println(list);
		
		System.out.println("First element:");
		System.out.println(list.removeFirst());
		System.out.println("After removing first");
		System.out.println(list);
		
		System.out.println("Last element:");
		System.out.println(list.removeLast());
		System.out.println("After removing last");
		System.out.println(list);
		
		//list.removeAll(list);
		
		//System.out.println(list.poll());
		//System.out.println(list);
		
		System.out.println("pollFirst: "+ list.pollFirst());
		System.out.println("After pollFirst");
		System.out.println(list);
		
		System.out.println("pollLast: "+ list.pollLast());
		System.out.println("After pollLast");
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list);
		
		System.out.println("peekFirst: "+list.peekFirst());
		System.out.println("peekLast: "+list.peekLast());
		
		System.out.println(list);
			
		
	}
}
